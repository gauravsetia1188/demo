

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int data;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
}

 class Bst{
	
	public static Node root;
	public Bst(){
		this.root=null;
	}

	public void insert(int id)
	{
		Node newNode=new Node(id); 
		if(root==null) 
		{
			root=newNode;
			return;
		}
		Node current=root;
		Node parent=null;
		while(true){

			parent=current;
			if(current.data<id)
			{
				current=current.right;
				if(current==null)
				{
					parent.right=newNode;
					return;
				}
			}
			else{
				current=current.left;
				if(current==null)
				{
					parent.left=newNode;
					return;
				}
			}
				
		}
	}

	public void display(Node root){
		if(root!=null)
		{
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

	public static void main(String[] args){
		Bst tree=new Bst();
		tree.insert(134);
		tree.insert(234);
		tree.insert(12);
		tree.insert(432);
		tree.insert(23);
		tree.insert(655);
		tree.display(tree.root);

	}


}