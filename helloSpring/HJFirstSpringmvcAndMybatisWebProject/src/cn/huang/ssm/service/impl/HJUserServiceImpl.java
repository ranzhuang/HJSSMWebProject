package cn.huang.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

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
	
	public List getUserList(HJUserModel userModel) throws Exception {
		//通过mapper查询数据
		return userMapperCustom.getUserList(userModel);
	}

}
