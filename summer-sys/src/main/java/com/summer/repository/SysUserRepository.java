package com.summer.repository;

import com.summer.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface SysUserRepository extends JpaRepository<SysUser,Serializable> {
}
