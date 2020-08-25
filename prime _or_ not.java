import java.io.*;
import java.util.Scanner;
public class Controlflow12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean f=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{	
			f=false;
			break;
			}
		}
		if(f==false)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");

	}

}
