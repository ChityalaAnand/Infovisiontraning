package com.auth_service.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth_service.dto.AuthResponse;
//import com.auth_service.config.JwtTokenProvider;
import com.auth_service.dto.LoginRequest;
import com.auth_service.dto.RegisterRequest;
import com.auth_service.exception.UserAlreadyExistsException;
//import com.auth_service.dto.UserDto;
import com.auth_service.model.User;
import com.auth_service.model.UserRole;
import com.auth_service.repository.UserRepository;
import com.auth_service.security.JwtUtil;
//import com.auth_service.util.JwtTokenUtil;

@Service
public class AuthService {
	@Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(RegisterRequest req) {
         if (userRepository.existsByEmail(req.getEmail()))
            throw new RuntimeException("This email already exists");
        User user = new User();
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        user.setPhone(req.getPhone());
        user.setRole(req.getRole());
        user.setPassword(passwordEncoder.encode(req.getPassword()));
        userRepository.save(user);
    }

    public AuthResponse login(LoginRequest req) {
        User user = userRepository.findByEmail(req.getEmail()).orElseThrow(
            () -> new RuntimeException("Invalid email or password"));
        if (!passwordEncoder.matches(req.getPassword(), user.getPassword()))
            throw new RuntimeException("Invalid email or password");
        String token = jwtUtil.generateToken(user);
        return new AuthResponse(token, user.getRole());
    } 
}
















  
//	@Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private JwtUtil jwtUtil;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public void register(RegisterRequest req) {
//        if (userRepository.existsByEmail(req.getEmail()))
//            throw new RuntimeException("Email already exists");
//        User user = new User();
//        user.setName(req.getName());
//        user.setEmail(req.getEmail());
//        user.setPhone(req.getPhone());
//        user.setRole(req.getRole());
//        user.setPassword(passwordEncoder.encode(req.getPassword()));
//        userRepository.save(user);
//    }

//    public AuthResponse login(LoginRequest req) {
//        User user = userRepository.findByEmail(req.getEmail()).orElseThrow(() -> new RuntimeException("No such user"));
//        if (!passwordEncoder.matches(req.getPassword(), user.getPassword()))
//            throw new RuntimeException("Invalid credentials");
//        String token = jwtUtil.generateToken(user);
//        return new AuthResponse(token, user.getRole());
//    }
//}
//	@Autowired private UserRepository repo;
//	  @Autowired private PasswordEncoder encoder;
//	  @Autowired private JwtTokenProvider jwt;
//
//	  public AuthResponse login(LoginRequest req) {
//	    Authentication auth = new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword());
//	    AuthenticationManagerBuilder builder = null;
//	    repo.findByUsername(req.getUsername()).orElseThrow(() -> new UsernameNotFoundException("No user"));
//	    UserDetails user = loadUserByUsername(req.getUsername());
//	    return new AuthResponse(jwt.createToken(user.getUsername(), List.of(user.getAuthorities().toString())));
//	  }
//
//	  public void register(RegisterRequest req) {
//	    if (repo.findByUsername(req.getUsername()).isPresent()) 
//	      throw new UserAlreadyExistsException("Username taken");
//	    repo.save(User.builder()
//	      .username(req.getUsername())
//	      .password(encoder.encode(req.getPassword()))
//	      .role(req.getRole()).build());
//	  }
//
//	  @Override
//	  public UserDetails loadUserByUsername(String username) {
//	    User u = repo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No user"));
//	    return org.springframework.security.core.userdetails.User
//	      .withUsername(u.getUsername()).password(u.getPassword())
//	      .roles(u.getRole().replace("ROLE_","")).build();
//	  
//	  if (UserRepository.existsByEmail(userRequest.getEmail())) {
//		    throw new UserAlreadyExistsException("User with email already exists: " + userRequest.getEmail());
//		}
//	  }
//	}
// 

//	@Autowired private UserRepository userRepo;
//    @Autowired private PasswordEncoder passwordEncoder;
//    @Autowired private JwtTokenUtil jwtUtil;
//
//    public UserDto register(RegisterRequest req) {
//    
//
//    	 User user = new User(null, req.getUsername(), passwordEncoder.encode(req.getPassword()), req.getRole().toUpperCase());
//          user = userRepo.save(user);
//         return new UserDto(user.getId(), user.getUsername(), user.getRole());
//     } 
//
//     public LoginResponse login(LoginRequest req) {
//         User user = userRepo.findByUsername(req.getUsername())
//                  .orElseThrow(() -> new RuntimeException("User not found"));
//         if (!passwordEncoder.matches(req.getPassword(), user.getPassword()))
//             throw new RuntimeException("Invalid credentials");
//
//         String token = jwtUtil.generateToken(user);
//         return new LoginResponse(token, user.getUsername(), user.getRole());
//     }
//    } 
//    	User user=new User(
//    			null,
//                req.getUsername(),
//                passwordEncoder.encode(req.getPassword()),
//                UserRole.valueOf(req.getRole().toUpperCase())
//            );
//
//            user = userRepo.save(user);
//            return new UserDto(user.getId(), user.getUsername(), user.getRole().name());
//        }
//
//        public JwtResponse login(LoginRequest req) {
//            User user = userRepo.findByUsername(req.getUsername())
//                    .orElseThrow(() -> new RuntimeException("User not found"));
//
//            if (!passwordEncoder.matches(req.getPassword(), user.getPassword())) {
//                throw new RuntimeException("Invalid credentials");
//            }
//
//            String token = jwtUtil.generateToken(user);
//            return new JwtResponse(token, user.getUsername(), user.getRole().name());
//        }
   // }
    //✅ Lombok Dependency (Must Be in pom.xml)
//        User user = new User(null, req.getUsername(), passwordEncoder.encode(req.getPassword()), req.getRole());
//        user = userRepo.save(user);
//        return new UserDto(user.getId(), user.getUsername(), user.getRole());
//    }
//
//    public JwtResponse login(LoginRequest req) {
//        User user = userRepo.findByUsername(req.getUsername())
//                .orElseThrow(() -> new RuntimeException("User not found"));
//        if (!passwordEncoder.matches(req.getPassword(), user.getPassword()))
//            throw new RuntimeException("Invalid credentials");
//
//        String token = jwtUtil.generateToken(user);
//        return new JwtResponse(token, user.getUsername(), user.getRole());
//    }
//}
//
