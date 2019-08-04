package com.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {
	
	@Value("${application.version}")
	private String appVersion;
	
	@RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
	public String getVersion(){
		return appVersion;
		
	}

}
