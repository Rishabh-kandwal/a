package Stackquest;

import java.util.Stack;

public class revword
{
	Stack<Character> s=new Stack<>();
	void PUSH(char d) 
	{
		s.push(d);
		
	}
	char POP() 
	{
		return s.pop();
	}
	
	void word(String ss) 
	{
		ss=ss+" ";
		String ns="";
		for(int i=0;i<ss.length();i++) 
		{
			char c=ss.charAt(i);
			if(c==' ') 
			{
				while(s.empty()!=true) 
				{
					ns=ns+POP();
				}
				ns=ns+' ';
			}
			PUSH(c);
			
		}
		System.out.println(ns);
	}
	public static void main(String[] args) {
		revword r=new revword();
		r.word("geek for geek");
	}
	
}
