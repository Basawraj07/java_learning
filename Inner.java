class Outer{
	int x = 5;
	
	class Inner{
		int y = 10;
	}
	
	public static void main(String[]args){
		Outer myOuter = new Outer();
		Outer.Inner myInner = myOuter.new Inner();
		
		System.out.println(myOuter.x +""+ myInner.y);
	}
}