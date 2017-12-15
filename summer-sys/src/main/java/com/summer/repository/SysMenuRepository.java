package com.summer.repository;

import com.summer.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface SysMenuRepository extends JpaRepository<SysMenu,Serializable> {

    List<SysMenu> findByTypeEqualsOrTypeEquals(Integer type1, Integer type2);
}
