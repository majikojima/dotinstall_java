//http://www.techscore.com/tech/DesignPattern/Singleton.html/
//Singletonパターン

public class HelloWorld{
	public static void main(String[] args){
		RegisterNote note = RegisterNote.getInstance();
		RegisterNote note2 = RegisterNote.getInstance();
		if(note == note2){
			System.out.println("same Instance");
		}
	}
}
