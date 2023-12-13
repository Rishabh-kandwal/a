package ll;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class DynamicStack extends Stack_i
{
	//int a;

	public DynamicStack() 
	{
		super();
	}
	public DynamicStack( int a) 
	{
		super(a);
	}
	public void s() 
	{
		System.out.println("DynamicStack");
	}
	
	@Override
	boolean Push(int i)
	{
		if (isFull())
		{
			int temp[]=new int[default_size*2]; 
			int s=0;
			for(int j:a)
			{
				temp[s++]=j;
			}
			a=temp;
		}
		return super.Push(i);
		
		
	}
}
