package cn.huang.ssm.mapper;


import java.util.List;

import cn.huang.ssm.po.HJUserModel;

public interface HJGetUserMapperCustom {
	//用户的查询列表
	public List<HJUserModel> getUserList(HJUserModel userModel) throws Exception;
}
