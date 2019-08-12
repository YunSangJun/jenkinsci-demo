package com.sample.controller;

import com.sample.service.SampleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

	private SampleService sampleService; 

	public SampleController(SampleService sampleService) {
		this.sampleService = sampleService;
	}
	
	@RequestMapping(path = {"", "/version"}, method = RequestMethod.GET)
	public String getVersion(){
		return sampleService.getVersion();
	}

	@RequestMapping(path = "/hostname", method = RequestMethod.GET)
	public String getHostName() {	
		return sampleService.getHostName();
	}

}
