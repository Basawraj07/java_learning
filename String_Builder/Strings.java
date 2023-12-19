class Strings{
	public static void main(String[]args){
		StringBuilder sb = new StringBuilder("hello");
		//get char
		sb.setCharAt(0,'O');
		sb.setCharAt(2,'b');
		System.out.println(sb);
		
		//set char
		System.out.println(sb.charAt(2));
		
		//insert
		sb.insert(0,'p');
		sb.insert(1,'a');
		System.out.println(sb);
		
		//delete
		
		sb.delete(2,4);
		System.out.println(sb);
		
		//append
		sb.append(" ");
		sb.append('E');
		sb.append("scobar");
		System.out.println(sb);
		
	}
}