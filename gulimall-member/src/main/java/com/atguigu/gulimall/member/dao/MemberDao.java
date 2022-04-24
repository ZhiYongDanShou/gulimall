package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author LinHaojia
 * @email 1326813696@qq.com
 * @date 2022-04-13 16:48:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
