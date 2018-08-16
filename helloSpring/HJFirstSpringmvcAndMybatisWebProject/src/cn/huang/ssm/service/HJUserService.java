package cn.huang.ssm.service;


import java.util.List;

import cn.huang.ssm.po.HJUserModel;

public interface HJUserService {
	
	//用户的查询列表
	public List<HJUserModel> getUserList(HJUserModel userModel) throws Exception;
}
