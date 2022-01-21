package com.arraystypes;

public class Example4

	{
		//MultiDimensional Array in multiple lines
		public static void main(String[] args)
		{

			//declaration and instantiation(An array object creation)
			int customerIds[][] = new int[3][3];
			
			//initialization
			customerIds[0][0] = 8765;
			customerIds[0][1] =6543;
			customerIds[0][2] = 6564;
			
			customerIds[1][0] = 2222;
			customerIds[1][1] = 3989;
			customerIds[1][2] = 9999;
			
			customerIds[2][0] = 5453;
			customerIds[2][1] = 2338;
			customerIds[2][2] = 3647;

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
				System.out.println("\n\n\n");
			}
			


	}

}
