package week2day1;

public class PrimeNumbers 
{
	public static void main(String[] args)
   {
	   int i,x=13;
	   boolean flag=false;
	   for(i=2;i<=x/2;i++)
	   { 
		   if(x%i==0)
			flag=true;
	    }
	   if(flag==false)
	      System.out.println("13 is prime");
	   else
		   System.out.println("13 is not prime");
		   
    }

}
