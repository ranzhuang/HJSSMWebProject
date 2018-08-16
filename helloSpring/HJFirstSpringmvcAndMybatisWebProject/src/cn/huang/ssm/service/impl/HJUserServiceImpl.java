package cn.huang.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import cn.huang.ssm.mapper.HJGetUserMapperCustom;
import cn.huang.ssm.po.HJUserModel;
import cn.huang.ssm.service.HJUserService;

/**
 * 查询用户实现
 * @author ran
 *
 */
public class HJUserServiceImpl implements HJUserService {
	
	@Autowired
	private HJGetUserMapperCustom userMapperCustom;

	@Override
	public java.util.List<HJUserModel> getUserList(HJUserModel userModel) throws Exception {
		// 通过mapper查询数据
		List<HJUserModel> userList = userMapperCustom.getUserList(userModel);
		return userList;
	}

}
