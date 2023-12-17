import java.util.Scanner;

class LargestNum{
	public static void main(String[]args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = Sc.nextInt();
		System.out.println("Enter second number");
		int num2 = Sc.nextInt();
		
		if(num1==num2){
			System.out.println("both numbers are equal");
		}
		else if(num1>num2){
			System.out.println(num1+" is greater");
		}else{
			System.out.println(num2+" is greater");
		}
	}
}