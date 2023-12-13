package Stackquest;

import java.util.Stack;

public class revArray 
{
	 Stack<Integer> s=new Stack<>();
	void PUSH(int d) 
	{
		s.push(d);
		
	}
	int POP() 
	{
		return s.pop();
	}
	void rev(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			PUSH(a[i]);
		}
		int b[]=new int[a.length];
		int j=0;
		while(s.empty()!=true) 
		{
			b[j++]=POP();
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
	}
	public static void main(String[] args) 
	{
		revArray ra=new revArray();
		ra.rev(new int[] {11,12,13,14,15,16});
		
	}
}
