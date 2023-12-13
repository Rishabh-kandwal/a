package SEARCHING;

public class BST 
{
	public static void main(String[] args) 
	{
		int a[]=new int[]{10,11,22,33,44,55,76,87,98,100};
		
		System.out.println( new BST().rbs(a,0,a.length-1,33)  );
	}
	int rbs(int a[],int low,int high,int s) 
	{
		if(low<=high) 
		{
			int m=(low+high)/2;
			if(a[m]==s) 
			{
				System.out.println("element is found at index:"+m);
			
				return m;
			}
			if(a[m]>s)
			{
				high=m-1;
				//return rbs(a,low,high, s); 
			}
			else 
			{
				low=m+1;
				//return rbs(a, low, high, s);
			}
			return rbs(a,low,high, s); 
		}
		else {
			return -1;
		}
	}
	int bs(int a[],int s)
	{
		int l=0,h=a.length-1;
		while(l<=h) 
		{
			int mid=(l+h)/2;
			if(s==a[mid]) 
			{
				System.out.println("element found at index ="+mid);
				return mid;
				
			}
			if(a[mid]>s)
			{
				h=mid-1;
			}
			else 
			{
				l=mid+1;
			}
		}
		System.out.println("element do not exist");
		return -1;
	}
}
