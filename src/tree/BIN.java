package tree;

import java.util.Scanner;

public class BIN 
{
	nde root;
	void rtnode() 
	{
		System.out.println("enter the element in root node");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		root=new nde(a);
		lr( root,sc); 
	}
	void lr(nde rt,Scanner sc) 
	{
		
		System.out.println("if you want to enter left node press true of "+rt.data);
		boolean t=sc.nextBoolean();
		int a;
		if(t)
		{
			a=sc.nextInt();
			rt.l=new nde(a);
			System.out.println("if you want to enter left node type true of "+rt.l.data);
			boolean tt=sc.nextBoolean();
			if(tt)
				lr(rt.l, sc) ;
		}
		System.out.println("if you want to enter right node press true"+rt.data);
		boolean at=sc.nextBoolean();
		if(at)
		{
			a=sc.nextInt();
			rt.r=new nde(a);
			System.out.println("if you want to enter left node press true of "+rt.r.data);
			boolean tt=sc.nextBoolean();
			if(tt)
				lr(rt.l, sc) ;
		}
	}
	void disp() {
		disp(root);
	}
	void disp(nde n) 
	{
		if(n==null) 
		{
			System.out.println("TREE IS NULL");
			return;
		}
		System.out.println(n.data);
		disp(n.l);
		disp(n.r);
		
	}
	public static void main(String[] args)
	{
		BIN b=new BIN();
		b.rtnode() ;
		b.disp();
	}
}
class nde
{
	int data;
	nde l,r;
	nde(int d)
	{
		this.data=d;
	}
	
}