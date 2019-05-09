package com.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/cour")
public class CourController {

	@RequestMapping(value="/courList",method=RequestMethod.GET)
	public List<Map<String,String>> getCourList(){
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		Map<String, String> cour = new HashMap<String, String>();
		cour.put("name", "数学");
		Map<String, String> cour2 = new HashMap<String, String>();
		cour2.put("name", "计算机");
		list.add(cour);
		list.add(cour2);
		return list;
	}
}
