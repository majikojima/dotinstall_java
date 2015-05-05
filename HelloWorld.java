//http://www.techscore.com/tech/DesignPattern/Adapter/Adapter1.html/
//委譲を利用した Adapter パターン

public class HelloWorld{
	public static void main(String[] args){
		//学級委員の花子さん
		Chairperson chairperson = new Hanako();
		//クラスをまとめて頂戴
		chairperson.organizeClass();
	}
}
