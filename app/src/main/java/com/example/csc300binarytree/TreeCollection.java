package com.example.csc300binarytree;

import java.util.LinkedList;

public class TreeCollection
{
    private LinkedList<TreeValue> theMappings;

    public TreeCollection()
    {
        this.theMappings = new LinkedList<TreeValue>();
    }

    public BinaryTree2 getTreeWithSuperSecretCode(String secretCode)
    {
        //for a tree value in this.mappings
        for(TreeValue tv : this.theMappings)
        {
            if(tv.secretCode.equals(secretCode))
            {
                return tv.tree;
            }
        }
        return null;

    }
    public void addTree(String secretCode, BinaryTree2 tree)
    {
        this.theMappings.add(new TreeValue(secretCode,tree));
    }
}
