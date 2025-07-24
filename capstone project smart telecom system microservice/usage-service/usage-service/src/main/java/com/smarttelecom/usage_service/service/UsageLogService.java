package com.smarttelecom.usage_service.service;

import java.util.List;

import com.smarttelecom.usage_service.dto.UsageLogDTO;

public interface UsageLogService {
  //  List<UsageLog> getUsageByUserId(Long userId);
   // UsageLog saveUsageLog(UsageLog usageLog);
	UsageLogDTO logUsage(UsageLogDTO dto);
    List<UsageLogDTO> getUsageByUser(Long userId);
}
