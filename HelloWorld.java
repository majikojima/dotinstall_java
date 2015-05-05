//http://www.techscore.com/tech/DesignPattern/Adapter/Adapter1.html/
//継承を利用した Adapter パターン

public class HelloWorld{
	public static void main(String[] args){
		//学級委員の太郎君
		Chairperson chairperson = new NewTaro();
		//クラスをまとめて頂戴
		chairperson.organizeClass();
	}
}
