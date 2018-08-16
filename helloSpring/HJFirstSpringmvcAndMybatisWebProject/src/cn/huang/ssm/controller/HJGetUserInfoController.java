package cn.huang.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import cn.huang.ssm.po.HJUserModel;
import cn.huang.ssm.service.HJUserService;

@Controller
public class HJGetUserInfoController {
	
	@Autowired
	private HJUserService userService;
	@RequestMapping("/getUserInfoList")
	@ResponseBody
	public List<HJUserModel> getUserInfoList() throws Exception {
		//调用service查找数据
		List<HJUserModel> userList = userService.getUserList(null);
		return userList;
	}
}
