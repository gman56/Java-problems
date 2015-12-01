import java.util.Arrays;


public class test {
	
	
	public static int factorial(int n) {
		  
		  if (n == 0)
		  {
		    return n;
		  }
		  
		  if (n == 1)
		  {
		    return n;
		  }
		  
		  else 
		  {
		    return n * factorial(n-1);
		  }
		  
		} 
	
	public static String[] fizzBuzz(int start, int end) {

		  
		  int arrayLength = end - start;
		  
		  int[] x = new int[arrayLength];
		  
		  int count = 0;
		  
		  for (int i=start; i <= end-1; i++)
		  {
		    x[count] = i;
		    count++;
		  }
		  
		  String[] str = new String[x.length];
		  
		  
		  for(int i = 0; i<x.length;++i)
		  {
		     str[i] = Integer.toString(x[i]);
		  }
		  
		  
		  for (int i=0; i<str.length;i++)
		  {
		  
		      int both=0;
		      int five=0;
		      int three=0;
		     
		     if (Integer.parseInt(str[i])%5 == 0) 
		      {
		        both+=1;
		        five++;
		      }
		     if (Integer.parseInt(str[i])%3 == 0)
		      {
		       both+=1; 
		       three++;   
		      }
		  
		 
		     if (three == 1)
		      {
		        str[i] ="Fizz";
		      }
		     if (five == 1)
		     {
		        str[i] ="Buzz";
		     }
		     if (both == 2)
		      {
		        str[i]="FizzBuzz";
		      }
		     
		    
		  }

		  System.out.println(Arrays.toString(str));
		return str;

		  
		}
	
	
	
	public static int[] revArr(int[] a)
	{
		int[] x = new int[a.length];
		int count = 0;
		for (int i = a.length-1; i >= 0; i--)
		{
			x[count] = a[i];
			count++;
		}
		System.out.println(Arrays.toString(x));
		return x;
		
	}
	
	public static void mult(int a, int b)
	{
	

		
		System.out.println(Math.pow(10,(Math.log10(a) + Math.log10(b))));
	}
	
	
	public static void fib(long x)
	{
		if (x==0)
		{
			System.out.println(0);
		}
		if(x==1 || x==2)
		{
			System.out.println(1);

		}
		System.out.println(0);
		System.out.println(1);
		System.out.println(1);
		//print nums not being used in loop
		//ordinarily put into array before others
		
		long a=0,b=1,c=1;
		for(long i=3; i < x; i++) //i=2 if you dont want to include 0 as part of total fibonacci #
		{

			long z;
			z=b+c;		
			a=b;
			b=c;
			c=z;
			System.out.println(z);
		}
		
	}
	
	
	public static int trial(int n)
	{
		if (n==1)
		{
			return 1;
			
		}
		
		else
		{
			return n +dumb(n-1);
		}
		
	}
	
	public static boolean armstrong(int a)
	{
		String num = String.valueOf(a);
		
		char[] x = num.toCharArray();
		
		int power = x.length;
		int count = 0;
		
		for (int i=0; i < x.length; i++)
		{
			int z = Character.getNumericValue(x[i]);
			count += Math.pow(z, power);
		}
		if (count == a)
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
	
	public static boolean canBalance(int[] nums) {
		 for (int i = 0; i < nums.length; i++) { 
		        int sum = 0;
		        for (int j = 0; j < i; j++) sum += nums[j];
		        for (int j = i; j < nums.length; j++) sum -= nums[j];
		        if (sum == 0) return true;
		    }
		    return false;
		}
	
	
	public static int[] fix34(int[] nums)
	{
		int track=0;

		
		for(int i=0; i<nums.length; i++)
		{
			
			if(nums[i] == 3)
			{
				int temp = i;
				
				
				for (int j=0; j<nums.length; j++)
				{
					
					if(nums[j] == 4 && j != track)
					{
						int toMove = nums[temp+1];
						int four = nums[j];
						
						nums[j] = toMove;
						nums[temp+1] = four;
						
						track = temp+1;
						break;
					}
				}
				
				
			}
		}
		return nums;
		
	}
	
	public static boolean canBalance2(int[] nums)
	{
		int isMore=0;
		int temp = 0;
		
		for(int i=0; i<nums.length-1; i++)
		{
			isMore=0;
			temp += nums[i];
			
			
			for(int j=i+1;j<nums.length; j++)
			{
				isMore += nums[j];
				
			
			}
			
			if(isMore == temp)
			{
				return true;
			}
			
		}
		return false;
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		//System.out.println(factorial(5)); 
		//fizzBuzz(15,17);
		
		int[] pop = {1,3,2,4,4,3,1};
		//System.out.print(canBalance2(pop));
		
		for(int num: fix34(pop))
		{
			System.out.print(num + " ");
		}

		//System.out.println(revArr(pop));
		//revArr(pop);
		//mult(5,5);
		//fib(100); 
		//System.out.print(armstrong(407));
	}

	
}
