package Stackquest;
import java.util.Stack;

public class REMCHAR 
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
	void remChar(String s1,String s2) 
	{
		for(int i=0;i<s1.length();i++) 
		{
			char a=s1.charAt(i);
			PUSH(a);
			for(int j=0; j<s2.length();j++) 
			{
				if(a==s2.charAt(j)) 
				{
					POP();
				}
				continue;
			}
		}
		
		String g="";
		while(s.empty()!=true) 
		{
			g=POP()+g;
		}
		System.out.println(g);
		
	}
	public static void main(String[] args) 
	{
		REMCHAR r=new REMCHAR();
		r.remChar("computer", "cat");
	}
}
