import java.util.Scanner;

class SimpleIntrest{
	public static void main(String[]args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter product Value");
		int Principal = Sc.nextInt();
		System.out.println("Enter Rate Value");
		double Rate = Sc.nextDouble();
		System.out.println("Enter Time");
		int Time = Sc.nextInt();
		
		int si = (int)(Principal*Time*Rate)/100;
		
		System.out.println("the simple intrest is : "+ si);
	}
}