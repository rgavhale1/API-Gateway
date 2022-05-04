package com.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userFallback")
	String userServiceFallbackMethod(){
		return "User service is longer than expected. Please try agian later";
		
	}
	
	@GetMapping("/departmentFallback")
	String departmentServiceFallbackMethod(){
		return "Department service is longer than expected. Please try agian later";
		
	}


}
