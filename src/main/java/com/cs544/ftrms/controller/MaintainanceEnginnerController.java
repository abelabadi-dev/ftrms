package com.cs544.ftrms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.cs544.ftrms.model.IAircraft;

@Controller
public class MaintainanceEnginnerController {
	@Resource
	private IAircraft aircraft;

}
