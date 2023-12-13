package Stackquest;

import java.util.Stack;

public class remMid 
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
		void mid() 
		{
			//PUSH(0);
			PUSH(1);
			PUSH(2);
			PUSH(3);
			PUSH(4);
			int sz=s.size();
			int a[]=new int[sz/2-1];
			for(int i=0;i<a.length-1;i++) 
			{
				a[i]=POP();
			}
			POP();
			for(int i=a.length-1;i>0;i--) 
			{
				PUSH(a[i]);
			}
		 
			dis();
		}
		void dis() 
		{
			System.out.println(s);
		}
	
	public static void main(String[] args) 
	{
		remMid  r=new remMid();
		r.mid();
	}

}
