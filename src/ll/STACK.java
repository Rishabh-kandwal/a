package ll;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class STACK {

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>(); 
		s.push(33);
		s.push(22);
		s.push(11);
		s.push(1);
		s.push(2222);
		
		System.out.println( s.pop());
		
		
		Queue<Integer> q=new LinkedList<>();
		q.add(12);
		q.add(11);
		q.add(2);
		q.add(3);
		q.remove();
		q.remove();
		Deque<Integer> d=new ArrayDeque<>();
		d.add(12);
		d.add(22);
		d.add(11);
		d.add(2);
		d.add(123);
		d.addLast(23);
		d.addFirst(1);
		
		
		
		
	}
	

}
