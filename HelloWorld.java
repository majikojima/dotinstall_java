//http://www.techscore.com/tech/DesignPattern/TemplateMethod.html/
//TemplateMethod パターン

public class HelloWorld{
	public static void main(String[] args){
		//細かいことは田中に任せる
		WoodCutPrint wcp = new TanakasWoodCutPrint();
		//大まかな流れは教える
		wcp.createWoodCutPrint();
	}
}
