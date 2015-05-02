//クラス

/*
クラス：設計図
-メンバー変数（フィールド）
-メソッド

インスタンス：実体化
*/

class User{
	String name;
	String email;

	//コンストラクタ
	User(String name, String email){
		this.name = name;
		this.email = email;
	}

	void sayHi(){
		System.out.println("Hi " + this.name);
	}
}

class SuperUser extends User{
	SuperUser(String name, String email){
		super(name,email);
	}

	//メソッドのオーバーライド
	void sayHi(){
		System.out.println("HIIIIIIIIIII " + this.name);
	}
}

public class HelloWorld{
	public static void main(String[] args){
		User tom = new User("tom","tomtom");
		SuperUser bob = new SuperUser("bob","bobbob");
		tom.sayHi();
		bob.sayHi();
	}
}