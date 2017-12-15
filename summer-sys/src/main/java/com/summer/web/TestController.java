package com.summer.web;

import com.summer.service.SysMenuService;
import com.summer.utils.tree.TreeBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping(value = "/1")
    public Map<String, Object> list() {
        //查询列表数据
        Map<String, Object> map = new HashMap<>();
        Long parentId = 0L;
        List<TreeBo> treeList = sysMenuService.findMenuTree(0, 1);
        map.put("menuList", treeList);
        return map;
    }
}
