package com.smarttelecom.usage_service.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smarttelecom.usage_service.dto.UsageLogDTO;
import com.smarttelecom.usage_service.dto.UserUsageDto;
import com.smarttelecom.usage_service.entity.UsageLog;
import com.smarttelecom.usage_service.exception.UserNotFoundException;
import com.smarttelecom.usage_service.repository.UsageLogRepository;

@Service
public class UsageLogServiceImpl implements UsageLogService {

	private final UsageLogRepository usageLogRepository;

	private final RestTemplate restTemplate;
	public UsageLogServiceImpl(UsageLogRepository usageLogRepository, RestTemplate restTemplate) {
		this.usageLogRepository = usageLogRepository;
		this.restTemplate = restTemplate;
	}

	@Value("${user.service.url}")
	private String userServiceUrl;

	@Override
	public UsageLogDTO logUsage(UsageLogDTO dto) {
		Long userId;

		try {
			UserUsageDto userUsageDto = restTemplate.getForObject(userServiceUrl + "/api/users/" + dto.getUserId(),
					UserUsageDto.class);

			if (userUsageDto != null) {
				userId = userUsageDto.getId();
				System.out.println("================="+userId);
			} else {
				throw new UserNotFoundException("User with ID " + dto.getUserId() + " not found.");
			}

		} catch (Exception e) {
			throw new UserNotFoundException("Failed to fetch user from User-Service: " + e.getMessage());
		}

		// Convert DTO to Entity
		UsageLog usageLog = convertToEntity(dto);
		usageLog.setUserId(userId); // Set resolved user ID
		usageLog.setDate(LocalDate.now());

		// Save to DB
		UsageLog savedLog = usageLogRepository.save(usageLog);

		// Convert Entity back to DTO
		return convertToDto(savedLog);
	}

	private UsageLog convertToEntity(UsageLogDTO dto) {
		return UsageLog.builder().callDuration(dto.getCallDuration()).dataUsed(dto.getDataUsed())
				.smsCount(dto.getSmsCount()).build();
	}

	private UsageLogDTO convertToDto(UsageLog usageLog) {
		return UsageLogDTO.builder().userId(usageLog.getUserId()).callDuration(usageLog.getCallDuration())
				.dataUsed(usageLog.getDataUsed()).smsCount(usageLog.getSmsCount()).build();
	}

	@Override
	public List<UsageLogDTO> getUsageByUser(Long userId) {
		return usageLogRepository.findByUserId(userId).stream().map(log -> UsageLogDTO.builder().userId(log.getUserId())
				.callDuration(log.getCallDuration()).dataUsed(log.getDataUsed()).smsCount(log.getSmsCount()).build())
				.collect(Collectors.toList());
	}

	/*
	 * @Override public List<UsageLog> getUsageByUserId(Long userId) { return
	 * usageLogRepository.findByUserId(userId); }
	 * 
	 * @Override public UsageLog saveUsageLog(UsageLog usageLog) { return
	 * usageLogRepository.save(usageLog); }
	 */

}
