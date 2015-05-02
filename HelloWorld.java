//クラス

/*
アクセス修飾子

public
protected
private
*/

class User{
	protected String name;
	protected String email;

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