//メソッド

/*

*/
public class HelloWorld{
	public static void main(String[] args){
		sayHi("ooo");
		sayHi();
	}

	public static void sayHi(String name){
		System.out.println("Hi " + name);
	}

	//メソッドのオーバーロード
	public static void sayHi(){
		System.out.println("Hi nobody");
	}
}