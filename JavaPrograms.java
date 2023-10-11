package in.anudeep.mod;
public class Sum_odd 
{

	public static void main(String[] args) 
	{
		int sum=0;
		int num1=7;
		int num2=21;
		for(int i=num1;i<=num2;i++)
		{
			if(i%2!=0)
				sum=sum+i;
		}
			
		System.out.println(">>>sum of odd numbers between 7 and 21 is::"+sum);
	}

}
