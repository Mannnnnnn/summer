package com.summer.service.impl;

import com.summer.entity.SysUser;
import com.summer.repository.SysUserRepository;
import com.summer.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserRepository repository;
    @Override
    public Page<SysUser> findAll(int pageNo, int pageSize) {
        return repository.findAll(PageRequest.of(pageNo,pageSize));
    }

    @Override
    public List<SysUser> findAll() {
        return repository.findAll();
    }
}
