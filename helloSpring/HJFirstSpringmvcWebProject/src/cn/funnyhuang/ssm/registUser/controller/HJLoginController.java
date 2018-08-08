package cn.funnyhuang.ssm.registUser.controller;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.apple.eawt.Application;

import cn.funnyhuang.ssm.registUser.model.HJLoginModel;
import jdk.nashorn.api.scripting.JSObject;

public class HJLoginController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HJLoginModel model = new HJLoginModel();
		model.setUserID("000000");
		model.setPhone("13112345671");
		model.setPassWord("123456");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json串");
	}

}
