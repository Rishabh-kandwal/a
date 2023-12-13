package ll;


public class Stack_i 
{
	 int a[];
	 static final int default_size=10;
	int ptr=-1;
	public Stack_i()
	{
		this(default_size);
	}
	public Stack_i(int s)
	{
		this.a=new int[s];
	}
	public  boolean isEmpty() 
	{
		if(ptr==-1)
			return true;
		else 
			return false;
		
	}
	public boolean isFull() 
	{
		if(ptr==default_size-1)
		return true;
		return false;
	}
	public void s() {System.out.println("stack_i");}
	boolean Push(int i)
	{
		try {
			if(ptr>10) 
			{
				System.out.println("STACK IS OVERFLOW");
				return false;
			}
			
		}
		catch (Exception e) {
			System.out.println("System.out.println(\"STACK IS OVERFLOW\");");
		}
		ptr++;
		a[ptr]=i;
		return true;
	}
	int Pop()
	{
		if(ptr==-1) 
		{
			System.out.println("STACK IS UNDERFLOW");
			return 0;
		}
		
		
		return a[ptr--];
	}
	int peek() 
	{
		if(ptr==-1) 
		{
			System.out.println("CAN'T PEAK FROM EMPTY STACK");
			return 213149324;
		}
		return a[ptr];
	}
	
	
}























