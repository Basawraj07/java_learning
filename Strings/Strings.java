class Strings{
	public static void main(String[]args){
		String s1 = "Basu";
		String s2 = "Mat";
		String fullname = s1 + s2 +"@"+"gmail.com";
		
		System.out.println(fullname.length());
		
		for(int i=0 ; i<fullname.length();i++){
			System.out.println(fullname.charAt(i));
		}
	}
}