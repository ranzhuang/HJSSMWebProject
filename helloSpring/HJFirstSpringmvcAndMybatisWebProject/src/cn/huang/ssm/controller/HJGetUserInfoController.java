package cn.huang.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.huang.ssm.po.HJUserModel;
import cn.huang.ssm.service.HJUserService;

@Controller
public class HJGetUserInfoController {
	
	@Autowired
	private HJUserService userService;
	
	@RequestMapping("/getUserInfoList")
	public void getUserInfoList() throws Exception {
		//调用service查找数据
		System.out.println("成功");
		java.util.List<HJUserModel> userList = userService.getUserList(null);
		System.out.println(userList);
	}
}
