package ll;

//import java.awt.DisplayMode;

public class single_ll 
{
	private Node head;
	private int size=0;
	
	private void insertatfirst( int data) 
	{
		Node n=new Node(data);
			n.nxt=head;
			head=n;
			size++;
		
	}
	void delete1st() 
	{
		if(head.nxt==null) 
		{
			head=null;
			return;
		}
		head=head.nxt;
	}
	void deleteMid() 
	{
		Node m=head;
		Node j=m.nxt.nxt;
		
		while(j!=null && j.nxt!=null ) 
		{

			m=m.nxt;
			j=j.nxt.nxt;

			
		}
		System.out.println("Linked list mid is"+m.nxt.data);
		m.nxt=m.nxt.nxt;
		
		
	}
	void deleteDuplicates() 
	{
		if(head==null)
			return;
		Node j=head;
		while(j.nxt!=null) 
		{
			if(j.data==)
		}
		
	}
	void deleteByValue(int val) 
	{
		if(head.data==val)
		{head=head.nxt;}
		Node m=head;
		while(m.nxt!=null && m.nxt.nxt.data==val) 
		{
			m=m.nxt;
		}
		m.nxt=m.nxt.nxt;
	}
	void deleteAtgivenpos(int d) 
	{
		if(d==size/2) 
		{
			deleteMid();
		}
		if(d==0) 
		{
			delete1st();
		}
		if(d>=size)
			delete() ;
		
		Node m=head;
		int p=0;
		while(m.nxt!=null && p++!=(d-1) )
		{
			m=m.nxt;
		}
		if(m.nxt!=null && m.nxt.nxt!=null)
		m.nxt=m.nxt.nxt;
		
	}
	void delete() 
	{
		
		if(head==null) 
		{
			System.out.println("Linked list is empty so stop deleting elements");
			return;
		}
		Node m=head;
		Node j=m.nxt;
		while(j.nxt!=null) 
		{
			m=m.nxt;
			j=j.nxt;
			
		}
		System.out.println("warning this element is going to be removed"+j.data);
		m.nxt=null;
	}
	void insert(int d)
	{
		
		
			if(head==null)
			{
				insertatfirst( d);
				return;
			}
			
			Node n=new Node(d);
			Node m=head;
			while(m.nxt!=null) 
			{
				m=m.nxt;
			}
			m.nxt=n;
			size++;
		
	}
	void insertAtGivenPos(int d,int pos) 
	{
		Node m=head;
		Node node=new Node(d);
		if(pos==0) 
		{
			insertatfirst( d);
			return;
		}
		if(pos>=size) 
		{
			insert(d);
			return;
		}
		int i=0;
		while(m!=null) 
		{
			i++;
			if(i==pos)
				break;
			m=m.nxt;
		}
		node.nxt=m.nxt;
		m.nxt=node;
		size++;
		
	}
	
	
	public static void main(String[] args) 
	{
		single_ll ll=new single_ll();
		ll.insert(10);
		ll.insert(11);
		ll.insert(12);
		ll.insert(12);
		ll.insert(13);
		
		ll.insert(14);
		ll.insert(15);
		//ll.deleteByValue(13);
		//ll.insertatfirst(0);
		//ll.insertAtGivenPos(11,0);
		ll.disp();
		//ll.deleteAtgivenpos(3);  
		//ll.deleteMid();
		//ll.disp();
//		ll.delete();
//		ll.delete();
//		ll.delete();
		
		
		
		//ll.disp();
		
	}


	private void disp() 
	{
			
			Node m=head;
			while(m!=null) 
			{
				System.out.println(m.data);
				m=m.nxt;
			}
			//System.out.println(m.data);
	}
	
	
}
class Node 
{
	int data;
	Node nxt;
	
	 Node(int data) 
	{
		this.data = data;
		this.nxt = null;
	}
}