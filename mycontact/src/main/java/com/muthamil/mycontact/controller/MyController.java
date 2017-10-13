package com.muthamil.mycontact.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "/listAll" , method=RequestMethod.GET)
	public ResponseEntity<List<JSONObject>> listAll() {
		
		JSONObject json = new JSONObject();
		json.put("name", "tamil");
		
		
		List<JSONObject> list =new ArrayList<JSONObject>();
		list.add(json);
		
		return new ResponseEntity<List<JSONObject>>(list, HttpStatus.OK);
		
	}

}
