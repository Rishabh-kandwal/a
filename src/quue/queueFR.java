package quue;

public class queueFR 
{
	int f=-1,r=-1;
	int a[];
	public queueFR() {
		this(10);
	}
	public queueFR(int i) {
		this.a=new int[i];
	}
	boolean isfull() 
	{
		return a.length==r;
		
	}
	boolean isempty() 
	{
		if(f==-1 && r==-1 )
			return true;
		return false;
	}
	void insert(int q) 
	{
		if(isfull()) 
		{
			System.out.println("array is full");
			return ;
		}
		if(f==-1 && r==-1)
			f+=1;
		a[++r]=q;
	}
	void disp() 
	{
		for(int i=f;i<=r;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args)
	{
		queueFR f=new queueFR ();
		f.insert(10);
		f.insert(11);
		f.insert(12);
		f.insert(13);
		f.insert(14);
		f.insert(15);
		f.insert(16);
		f.insert(17);
		f.insert(18);
		f.disp();
		f.remove();
		System.out.println();
		f.disp();
	}
	void remove() 
	{
		if(isempty()) 
		{
			System.out.println("array is empty");
			return ;
		}
		a[f]=0;
		f+=1;
	}
	
}
