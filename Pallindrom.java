import java.util.Scanner;
class Pallindrom{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a word to check pallindrom:");
		String s1 = sc.nextLine();
		String rev = "";
		
		for(int i = s1.length()-1;i>=0;i--){
			rev = rev + s1.charAt(i);
			
		}
		if(s1.equals(rev)){
			System.out.println("its a pallindrom");
		}else{
			System.out.println("its not a pallindrom");
		}
	}
}