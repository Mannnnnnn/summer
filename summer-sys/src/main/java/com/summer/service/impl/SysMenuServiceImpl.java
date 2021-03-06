package com.summer.service.impl;

import com.summer.entity.SysMenu;
import com.summer.repository.SysMenuRepository;
import com.summer.service.SysMenuService;
import com.summer.utils.tree.TreeBo;
import com.summer.utils.tree.TreeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuRepository repository;


    @Override
    public List<TreeBo> findMenuTree(Integer type1, Integer type2) {
        List<SysMenu> menuList = repository.findByTypeEqualsOrTypeEquals(type1, type2);
        repository.findAll();
        List<TreeBo> treeBoList = new ArrayList<>();
        if (menuList != null && menuList.size() > 0) {
            menuList.forEach(t ->{
                TreeBo treeBo = new TreeBo();
                treeBo.setUrl(t.getUrl());
                treeBo.setParentId(t.getParentId());
                treeBo.setIcon(t.getIcon());
                treeBo.setId(t.getMenuId());
                treeBo.setName(t.getName());
                treeBo.setType(t.getType());
                treeBoList.add(treeBo);
            });
        }
        TreeBuilder builder = new TreeBuilder();
        return builder.bulidTree(treeBoList);
    }
}
