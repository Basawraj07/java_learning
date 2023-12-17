import java.util.Scanner;

class AreaOfCircle{
	public static void main(String[]args){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		double Radius = Sc.nextDouble();
		
		double Area = (double)Math.PI*Radius*Radius;
		
		System.out.println("Area of the circle is :"+Area);
}
}