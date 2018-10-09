package com.guruofjava.deloitte2.basics;

public class ArraysDemo {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int[] a={45,33,90,7,12,22,44,1};
		int i,j,temp=0;
		/*for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}*/
		for(i=0;i<a.length;i++){
		for(j=0;j<a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}}
		public static void main2(String[] args)
		{
			Marker[] m ;
			m = new Marker[3];
			m[2] = new Marker();
			System.out.println(m[2].getPrice());
		}
		public static void main(String[] args)
		{
			int i,j;
			
			
			int[][] a={{12,15}, {16,20,36,84},{37,21,22},{16}};
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
	

}
