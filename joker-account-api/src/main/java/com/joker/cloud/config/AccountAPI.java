package com.joker.cloud.config;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/account")
public class AccountAPI {
	
	@GetMapping("/info")
	@PreAuthorize("hasRole('USER') and #oauth2.hasScope('read')")
	public String acccountNumber() {
		return "99999988888666555433";
	}
}
