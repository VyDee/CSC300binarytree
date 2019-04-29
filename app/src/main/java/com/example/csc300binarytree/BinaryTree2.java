package com.example.csc300binarytree;

import java.io.Serializable;

public class BinaryTree2 implements Serializable
{
    public int payload;
    public BinaryTree2 left;
    public BinaryTree2 right;

    public BinaryTree2(int payload)
    {
        this.payload=payload;
        this.left = null;
        this.right = null;
    }
    public BinaryTree2()
    {
        //exists so this can be rebuild
    }

    public void visitInOrder()
    {
       if(this.left!=null)
       {
           this.left.visitInOrder();
       }
       System.out.println("*****"+this.payload);
       if(this.right!=null)
       {
           this.right.visitInOrder();
       }
    }

    public void add( int payloadToAdd)
    {
        if (payloadToAdd<= this.payload)
        {
            //add to the left
            if (this.left==null)
            {
                this.left = new BinaryTree2(payloadToAdd);
            }
            else
            {
                this.left.add(payloadToAdd);
            }
        }
        else
        {
            if(this.right ==null)
            {
                this.right = new BinaryTree2(payloadToAdd);
            }
            else
            {
                this.right.add(payloadToAdd);
            }
        }
    }

}
