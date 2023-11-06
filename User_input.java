import java.util.Scanner;
class User_input{
	public static void main(String[]args){
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter your name: ");
		
		String User_name = myobj.nextLine();
		System.out.println("name: "+User_name);
	}
	
}