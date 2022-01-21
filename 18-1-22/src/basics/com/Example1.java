package basics.com;

import java.util.Scanner;

public class Example1
{

	public static void main(String[] args)
	{
   
     Scanner scanner =new Scanner (System.in);
     System.out.println("enter amount");
     int amount=scanner .nextInt();
   
   for (int i=1;i<4;i++)
   {
	   int loan=(amount *10)/100;
	   amount=amount-loan;
	   
   }
   
       System.out.println(amount);
       scanner.close();
	}

}

