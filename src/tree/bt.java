package tree;

import java.util.Scanner;

public class bt
{
	private node root;
	bt()
	{
		
	}
	//inserting into binary tree
	public void populating(Scanner sc) 
	{
		System.out.println("ENTER THE ROOT NODE VALUE");
		int value=sc.nextInt();
		root=new node(value);
		populating(sc,root ); 
	}
	public void populating(Scanner sc,node n) 
	{
		System.out.println("Do you want to enter left of "+n.value);
		boolean left=sc.nextBoolean();
		if(left) 
		{
			System.out.println("enter the value for left of "+n.value);
			n.left=new node(sc.nextInt());
			populating(sc, n.left) ;
		}
		System.out.println("Do you want to enter right of "+n.value);
		boolean right=sc.nextBoolean();
		if(right) 
		{
			System.out.println("enter the value for right of "+n.value);
			n.right=new node(sc.nextInt());
			populating(sc, n.right) ;

		}
		
	}
	public void display() 
	{
		display(root,"");
	}
	private void display(node node, String i) 
	{
		if(node==null) 
		{
			return;
		}
		System.out.println(i+node.value);
		display(node.left,i+'\t');
		display(node.right,i+'\t');
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		bt t=new bt();
		t.populating(sc);
		t.display();
	}
}
class node 
{
	int value;
	node left;
	node right;
	node(int v)
	{ 
		this.value=v;
	}
}