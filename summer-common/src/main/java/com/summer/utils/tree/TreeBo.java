package com.summer.utils.tree;

import java.util.List;

/**
 * @author black
 * @version 1.0
 * @Description 树形结构对象
 */
public class TreeBo {
    private Long id;//id
    private String name;//名称
    private String level;//级别
    private String icon;//图标
    private String url;//链接
    private Integer type;//0-存在子集；1-不存在子集
    private Long parentId;//父级
    private List<TreeBo> children;//子集

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<TreeBo> getChildren() {
        return children;
    }

    public void setChildren(List<TreeBo> children) {
        this.children = children;
    }

    public TreeBo() {
    }
}
