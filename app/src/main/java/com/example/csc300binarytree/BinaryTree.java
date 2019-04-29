package com.example.csc300binarytree;

public class BinaryTree
{
    private Node root;

    public BinaryTree()
    {
        this.root = null;
    }

    public void add(int payload)
    {
        Node n = new Node(payload);
        if(this.root == null)
        {
            this.root = n;
        }
        else
        {
            if(n.getPayload() <= this.root.getPayload())
            {
                // add to the left
                if (this.root.getLeftChild()==null)
                {
                    this.root.setLeftChild(n);
                }

            }
            else
            {
                //add to the right
                if (this.root.getRightChild() == null)
                {
                    this.root.setRightChild(n);
                }
            }
        }


    }
}
