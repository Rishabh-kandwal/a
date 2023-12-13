package Stackquest;

import java.util.Stack;

public class revStr
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
	void rev() 
	{
		String g="Rajeiv";
		
		for(int i=0;i<g.length();i++) 
		{
			char c=g.charAt(i);
			PUSH(c);
		}
		String n = "";
		while(s.empty()!=true) 
		{
			n=n+POP();
		}
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		revStr r=new revStr();
		r.rev();
	}
}
