package myfirst;
import java.util.Scanner;
public class example2 {
	public static void main(String args[]){
		Scanner first=new Scanner(System.in);
		double fnum,nnum,answer;
		System.out.println("Enter first number:");
		fnum=first.nextDouble();
		System.out.println("Enter Second number:");
		nnum=first.nextDouble();
		answer=fnum+nnum;
		System.out.print("answer is:");
		System.out.println(answer);
		
		
	}
		
	

}
