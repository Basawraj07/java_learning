import java.util.Scanner;
class Percentage{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("marks in English");
		int eng = sc.nextInt();
		System.out.println("marks in maths");
		int maths = sc.nextInt();
		System.out.println("marks in science");
		int science = sc.nextInt();
		int total = eng + maths + science;
		
		int percent = (total/300)*100; 
		
		System.out.println("your percentage is :"+percent+"%");
	}
}