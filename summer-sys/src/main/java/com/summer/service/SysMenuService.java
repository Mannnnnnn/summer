package com.summer.service;


import com.summer.utils.tree.TreeBo;

import java.util.List;

/**
 * 菜单管理
 *
 * @author Jhua
 * @date 2017-12-06 13:19:19
 */
public interface SysMenuService {

    List<TreeBo> findMenuTree(Integer type1, Integer type2);
}
