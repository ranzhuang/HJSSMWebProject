package cn.huang.ssm.service;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import cn.huang.ssm.po.HJUserModel;

public interface HJUserService {
	
	//用户的查询列表
	public List getUserList(HJUserModel userModel) throws Exception;
}