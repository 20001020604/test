package com.wangyuhang.service;

import com.wangyuhang.mapper.RoleMapper;
import com.wangyuhang.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<Role> findAll(){
        return roleMapper.findAll();
    }
}
