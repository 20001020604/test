package com.wangyuhang.mapper;

import com.wangyuhang.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface RoleMapper {
    public Role findById(@Param("id") long id);
    public List<Role> findAll();
}
