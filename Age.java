import java.util.Scanner;
class Age{
	public static void main(String[]args){
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Enter currentYear: ");
		int currentYear = myObj.nextInt();
		System.out.print("Enter your year of birth: ");
		int year = myObj.nextInt();
		int age = currentYear - year;
		
		System.out.println("your age is : "+age);
		
	}
}


