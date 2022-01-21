package com.arraystypes;

public class Example2 {

	
	
		//single dimensional array in multiple lines
		public static void main(String[] args)
		{

			//declaration and instantiation(An array object creation)
			int customerIds[] = new int[5];
			
			//initialization
			customerIds[0] = 5767;
			customerIds[1] =4656;
			customerIds[2] = 2323;
			customerIds[3] = 3365;
			customerIds[4] = 6666;

			for(int i = 0; i < customerIds.length; i++)
			{
				System.out.println(customerIds[i]);
			}

	}

}
