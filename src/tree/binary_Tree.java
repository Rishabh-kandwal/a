package tree;

import java.util.Scanner;

public class binary_Tree 
{
	nd root;
	void insert() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value in node");
		int a=sc.nextInt();
		insert(a,root);
	}
	void insert(int a,nd n) 
	{
		if(n==null) 
		{
			 n=new nd(a);
			 return;
		}
		if(a<n.val)
		{
			insert(a,n.lt);
		}
		else 
		{
			insert(a,n.rt);
		}
	}
	public void display() {
		display(root, "");
	}

	private void display(nd node, String i) {
		if (node == null) {
			return;
		}
		System.out.println(i + node.val);
		display(node.lt, i );
		display(node.rt, i );

	}
	public static void main(String[] args) 
	{
		binary_Tree b=new binary_Tree ();
		b.insert();
		System.out.println("hi");
		b.display();
	}
}
class nd
{
	int val;
	nd lt;
	 nd rt;
	int ht=0;
	nd(int v)
	{
		this.val=v;
		ht++;
	}
}