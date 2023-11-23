import java.util.Scanner;
class Method2{
	static void checkage(int age){
		if (age<18){
			System.out.println("this age is minor");
		}else{
			System.out.println("this age is adult");
		}
	}
	public static void main(String[]args){
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter your age");
		int Age = myObj.nextInt();
		checkage(Age);
		
	}
}