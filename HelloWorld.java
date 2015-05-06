//http://www.techscore.com/tech/DesignPattern/Builder.html/
//Builderパターン

public class HelloWorld{
	public static void main(String[] args){
		Builder builder = new SaltWaterBuilder();
		Director dir = new Director(builder);
		dir.constract();
		SaltWater saltWater = (SaltWater)builder.getResult();
		System.out.println("salt="+saltWater.salt);
		System.out.println("water="+saltWater.water);
	}
}
