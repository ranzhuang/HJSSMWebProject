package cn.huang.ssm.mapper;


import cn.huang.ssm.po.HJUserModel;

public interface HJGetUserMapperCustom {
	//用户的查询列表
	public java.util.List<HJUserModel> getUserList(HJUserModel userModel) throws Exception;
}
