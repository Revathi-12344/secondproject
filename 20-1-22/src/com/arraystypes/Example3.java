package com.arraystypes;

public class Example3
{

		//MultiDimensional Array in one line
		public static void main(String[] args)
		{

			//declaration, instantiation and initialization of an array in one line
			
			int customerIds[][] = {{7575, 7575}, {6568, 3657}};//2x2 = 4

			for(int i = 0; i < customerIds.length; i++)
			{
				for(int j = 0; j < customerIds.length; j++)
				{
					System.out.println(customerIds[i][j]);
				}
			}
			
			System.out.println("===================");
			
			for(int i = 0; i < customerIds.length; i++)
			{
				for(int j = 0; j < customerIds.length; j++)
				{
					System.out.print(customerIds[i][j]+"\t");
				}
				System.out.println("\n\n\n\n");
			}



		

	

	}

}
