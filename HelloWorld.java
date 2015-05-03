//http://popp915.blog58.fc2.com/blog-entry-299.html
//防御的コピー

import java.util.Date;

public class HelloWorld{
	public static void main(String[] args){
		Date badDate = new Date();
		BadPeriod bad = new BadPeriod(badDate);
		//内部の値を変更する
		badDate.setYear(1000);

		Date goodDate = new Date();
		GoodPeriod good = new GoodPeriod(goodDate);
		//内部の値を変更する
		goodDate.setYear(1000);

		System.out.println(bad.getDate());
		System.out.println(good.getDate());
	}
}

//防御的コピーが出来ていないクラス
class BadPeriod{
	private final Date date;

	//コンストラクタ
	public BadPeriod(Date date){
		this.date = date;
	}

	public Date getDate(){
		return date;
	}
}

//防御的コピーが出来ているクラス
class GoodPeriod{
	private final Date date;

	//コンストラクタ
	public GoodPeriod(Date date){
		//引数として渡ってきた値を取り出し、新たにオブジェクトを生成しましょう。
		this.date = new Date(date.getTime());
	}

	public Date getDate(){
		return new Date(this.date.getTime());
	}
}