import java.util.Scanner;
class PrimeCheck
{
   public static void main(String args[])
   {		
	int v;
	boolean x=true;
	Scanner scan= new Scanner(System.in);
	
	int num=scan.nextInt();
	   num<=1000;
	for(int i=2;i<=num/2;i++)
	{
           v=num%i;
	   if(v==0)
	   {
	      x=false;
	      break;
	   }
	}

	if(x)
	   System.out.println("yes");
	else
	   System.out.println( "no");
   }
}
