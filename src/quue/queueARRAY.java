package quue;

public class queueARRAY 
{
	int a[];
	public final static int sz=10;
	int e;
	int remove() 
	{
		if(empty()) 
		{
			System.out.println("queue is empty");
			return -1;
		}
		int f=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		return f;
	}
	boolean insert(int b) 
	{
		if(full()) 
		{
			System.out.println("queue is full");
			return false;
		}
		a[e++]=b;
		return true; 
	}
	void disp() 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	queueARRAY()
	{
		this(sz);
	}
	
	public queueARRAY(int sz2) {
		this.a=new int[sz2];
	}
	
	boolean full() 
	{
		return e==a.length;
		
	}
	
	boolean empty() 
	{
		return e==0;
	}
public static void main(String[] args) {
		
	queueARRAY u=new queueARRAY();
		u.insert(10);
		u.insert(12);
		u.insert(1);
		u.insert(20);
		u.disp();
		u.remove();
		u.disp();
	}

}
