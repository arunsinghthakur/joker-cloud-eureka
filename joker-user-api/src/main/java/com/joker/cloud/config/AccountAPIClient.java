package com.joker.cloud.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("joker-account-api")
public interface AccountAPIClient{
	
	@RequestMapping(method=RequestMethod.GET, value = "/rest/account/info")
	public String acccountNumber();
}
