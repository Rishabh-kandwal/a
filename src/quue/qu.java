package quue;
public class qu 
{
	int a[];
	private static final int sz=10;
	int end=0;
	qu(){
		this(sz);
	}
	qu(int s)
	{
		this.a=new int[s];
	}
	private boolean isfull() 
	{
		return sz==end;
	}
	private boolean isEMpty() 
	{
		return end==0;
	}
	boolean insert(int i)
	{
		if(isfull()) 
		{
			return false;
		}
		a[end++]=i;
		return true;
	}
	boolean remove() 
	{
		if(isEMpty()) 
		{
			System.out.println("Queue is empty");
			return false;
		}
		int r=a[0];
		for(int i=1;i<a.length;i++) 
		{
			a[i-1]=a[i];
		}
		end--;
		return true;
	}
	int front() 
	{
		if(isEMpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return a[0];
	}
	void display() 
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		qu u=new qu();
		u.insert(10);
		u.insert(12);
		u.insert(1);
		u.insert(20);
		u.display();
	}
	
}
