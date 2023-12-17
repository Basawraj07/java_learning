import java.util.Scanner;

class EvenOdd{
	public static void main(String[]args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = Sc.nextInt();
		
		if(num%2==0){
			System.out.println("the number is even");		
	}
	else{
		System.out.println("The number is odd");
	}
}
}