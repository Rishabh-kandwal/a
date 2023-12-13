package Linked_List_Imp_Quest;


public class ll 
{
	  node h;
	 int s;
	void insert1st(int a) 
	{
		node d=new node();
		d.data=a;
		d.nxt=h;
		h=d;
		s++;
	}
	//insert at end
	void rinsert(node j,int a) 
	{
		if(j==null) 
		{
			node d=new node(a);
			d.nxt=h;
			h=d;
			s++;
			return;
		}
//		System.out.println(j.data);
		if(j.nxt==null) 
		{
			node nn=new node(a);
			j.nxt=nn;
			s++;
			return;
		}
		
		rinsert(j.nxt, a);
	}
	void ri( int val, int in) 
	{
		r_i( h, val, in,0);
		s++;
	}
	void delete(int i) 
	{
		if(h==null) 
		{
			System.out.println("ELEMENTS ARE NOT IN THE LL");
			return;
		}
		if(i==0) 
		{
			
			h=h.nxt;
			return;
		}
		
		node q=h;
		int j=0;
		while(j!=(i-1) && q.nxt!=null && q!=null ) 
		{
			q=q.nxt;
			j++;
		}
		q.nxt=q.nxt.nxt;
		s--;
	}
	void recdel(int i) 
	{
		rd(i, h, 0);
		s--;
	}
	void rd(int i, node d,int sz) 
	{
		if(d==null) 
		{
			System.out.println("ELEMENTS ARE NOT IN THE LL");
			return;
		}
		
		if(i==0) 
		{
			
			h=h.nxt;
			return;
		}
		if(sz==(i-1)) 
		{
			d.nxt=d.nxt.nxt;
		}
		rd(i, d.nxt, sz+1);
	}
	private void r_i(node n, int val, int in,int size) 
	{
		if(in==0) 
		{
			node d=new node(val);
			d.nxt=h;
			h=d;
			return;
		}
		if(in-1==size) 
		{
			node nn=new node(val);
			nn.nxt=n.nxt;
			n.nxt=nn;
			return;
		}
		r_i(n.nxt, val, in,size+1); 
	}
	void insert(int a) 
	{
		if(h==null)
		{
			insert1st(a);
			return;
			
		}
		node nn=new node(a);
		node on=h;
		while(on.nxt!=null) 
		{
			on=on.nxt;
		}
		on.nxt=nn;
		s++;
	}
	void disp() 
	{
		node j=h;
		while(j.nxt!=null) 
		{
			System.out.println(j.data);
			j=j.nxt;
		}
		System.out.println(j.data);
	}
	void rdisp(node j) 
	{
		System.out.println(j.data);
		if(j.nxt==null) 
		{
			
			return;
		}
		//System.out.println(j.data);
		rdisp(j.nxt);
	}
//	void sort() 
//	{
//		node j=h;
//		while(j!=null && j.nxt!=null  ) 
//		{
//			node i=h;
//			while( i!=null && i.nxt!=null  ) 
//			{
//				if(i==h) 
//				{
//				if(i.data<=i.nxt.data) 
//				{
//					node t=i.nxt;
//					i.nxt=i.nxt.nxt;
//					t.nxt=i;
//					i=t;
//				}h=i;
//				j=h;
//				}
//				else 
//				{
//					if(i.data<=i.nxt.data) 
//					{
//						node t=i.nxt;
//						i.nxt=i.nxt.nxt;
//						t.nxt=i;
//						i=t;
//					}
//				}
//				System.out.println("i.data="+i.data);
//				i=i.nxt;
//			}
//			System.out.println("j.data= "+j.data);
//			
//			j=j.nxt;
//		}
//		
//	}
	
	
	
	
	
	void Bsort() 
	{
		node i=h;
		
		while(i.nxt!=null && i!=null) 
		{
			node j=h;
			
			while(j.nxt!=null && j!=null) 
			{
				
					if(j.data<j.nxt.data) 
					{
						int t=j.data;
						j.data=j.nxt.data;
						j.nxt.data=t;
						
					}
				j=j.nxt;
			}
			i=i.nxt;
		}
	}
	
	void max(int r) 
	{
		int i=0,m=0;
		node j=h;
		while(r--!=0 && j.nxt !=null) 
		{
			if(j.data > m) 
			{
				m=j.data;
			}
			j=j.nxt;
		}
	}
	public static void main(String[] args)
	{
		ll l=new ll();
		//l.delete(0);
		l.insert(0);
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		l.Bsort();
		//l.delete(7);
		//l.recdel(3);
		//l.ri(122,8);
		//System.out.println("disp()");
		l.disp();
		//l.rinsert(h, 12);
		//System.out.println("rdisp()");
		//System.out.println("size is "+l.s);
//			
			//l.rdisp(h);
//		
	}

}
class node
{
	int data;
	node nxt;
	node()
	{
		data=0;
		nxt=null;
	}
	node(int a)
	{
		data=a;
		nxt=null;
	}
	
}