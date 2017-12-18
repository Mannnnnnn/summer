package com.summer.utils.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeBuilder {
    public List<TreeBo> bulidTree(List<TreeBo> treeBoList) {
        List<TreeBo> trees = new ArrayList<>();
        treeBoList.forEach(treeBo -> {

            if (0 == treeBo.getParentId()) {
                List<TreeBo> childTrees = new ArrayList<>();
                treeBoList.forEach(t ->{

                    if (Objects.equals(t.getParentId(),treeBo.getId())){
                        childTrees.add(t);
                    }
                });
                treeBo.setChildren(childTrees);
                trees.add(treeBo);
            }
        });
        return trees;
    }
}
