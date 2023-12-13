package ll;

public class queueLL 
{
	int sz;
	Qnode qhd;
	private void insertAt1st(int a) 
	{
		Qnode q=new Qnode();
		q.data=a;
		q.nxt=qhd;
		qhd=q;
		sz++;
		
	}
	void cq() 
	{
		Qnode b=new Qnode();
		b=qhd;
		while(b.nxt!=null) 
		{
			//System.out.println(b.data);
			b=b.nxt;
		}
		b.nxt=qhd;
	}
	void icq(int a)
	{
		Qnode q=new Qnode(a);
		
		Qnode b=new Qnode();
		b=qhd;
		while(b.nxt!=qhd) 
		{
			//System.out.println(b.data);
			b=b.nxt;
		}
		q.nxt=b.nxt;
		b.nxt=q;
	}
	void disp() 
	{
		Qnode b=new Qnode();
		b=qhd;
		while(b.nxt!=qhd) 
		{
			System.out.println(b.data);
			b=b.nxt;
		}
		System.out.println(b.data);
	}
	public static void main(String[] args) 
	{
		queueLL q=new queueLL();
		q.insert(0);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		q.insert(8);
		q.insert(9);
		q.insert(10);
		q.insert(11);
		q.cq();
		//q.remove();
		q.disp();
		q.icq(100);
		q.disp();
		//q.cq();
		q.dispcq();
	}
	private void dispcq() 
	{
		Qnode b=new Qnode();
		b=qhd;
		while(b.nxt!=qhd) 
		{
			System.out.println(b.data);
			b=b.nxt;
		}
		System.out.println(b.data);
		
	}
	void insert(int a) 
	{
		insertAtend(a);
	}
	private void insertAtend(int a)
	{
		if(qhd==null) 
		{
			insertAt1st(a);
			return;
		}
		
			Qnode q=new Qnode(a);
			
			Qnode b=qhd;
			while(b.nxt!=null) 
			{
				b=b.nxt;
			
			}
			b.nxt=q;
			sz++;
		
	}
	private void remove() 
	{
		qhd=qhd.nxt;
		sz--;
		
	}
}

class Qnode
{
	Qnode nxt;
	int data;
	Qnode(int data) 
	{
		this.data = data;
//		this.nxt = null;
	}
	public Qnode()
	{
		super();
		this.nxt = null;
		this.data = 0;
	}
	
}