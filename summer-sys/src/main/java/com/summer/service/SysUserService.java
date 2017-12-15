package com.summer.service;

import com.summer.entity.SysUser;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SysUserService {

    Page<SysUser> findAll(int pageNo, int pageSize);
    List<SysUser> findAll();
}
