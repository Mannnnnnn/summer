package com.summer.utils.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeBuilder {
    public List<TreeBo> bulidTree(List<TreeBo> treeBoList) {
        List<TreeBo> trees = new ArrayList<>();
        for (TreeBo treeBo : treeBoList) {
            if (0 == treeBo.getParentId()) {
                trees.add(treeBo);
            }
            for (TreeBo it : treeBoList) {
                if (Objects.equals(it.getParentId(), treeBo.getId())) {
                    if (treeBo.getChildren() == null) {
                        treeBo.setChildren(new ArrayList<TreeBo>());
                    }
                    treeBo.getChildren().add(it);
                }
            }
        }
        return trees;
    }
}
