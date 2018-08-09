package cn.huang.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import cn.huang.ssm.service.HJUserService;
import cn.huang.ssm.service.impl.HJUserServiceImpl;

@Controller
public class HJGetUserInfoController {
	
	@Autowired
	private HJUserService userService;
	
	@RequestMapping("/getUserInfoList")
	public void getUserInfoList() throws Exception {
		//调用service查找数据
		List userList = userService.getUserList(null);
		System.out.println(userList);
	}
}
