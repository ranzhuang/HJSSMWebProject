package cn.huang.ssm.service;


import cn.huang.ssm.po.HJUserModel;

public interface HJUserService {
	
	//用户的查询列表
	public java.util.List<HJUserModel> getUserList(HJUserModel userModel) throws Exception;
}
