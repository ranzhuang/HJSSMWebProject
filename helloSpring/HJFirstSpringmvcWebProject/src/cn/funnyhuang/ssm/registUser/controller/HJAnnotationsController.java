package cn.funnyhuang.ssm.registUser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HJAnnotationsController {
	
	@RequestMapping("/getPhoneNumber")
	public void getPhoneNumber() throws Exception {
		System.out.println("phoneNumber:123456789");
	}

}
