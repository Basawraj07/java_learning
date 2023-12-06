interface Firstname{
	public void animalSound();
}
interface Secondname{
	public void dinoSound();
}

class Pig implements Firstname,Secondname{
	public void animalSound(){
		System.out.println("roarrrrrr!!!!");
	}
		public void dinoSound(){
		System.out.println("whwhhwhwhhwh!!!!");
	}
}
class main{
	public static void main(String[]args){
		Pig mypig =new Pig();
		mypig.animalSound();
		mypig.dinoSound();
		
	}
}