//http://www.techscore.com/tech/DesignPattern/TemplateMethod.html/
//TemplateMethod パターン

public class HelloWorld{
	public static void main(String[] args){
		//細かいことは今川に任せる
		CutPrint wcp = new ImagawasCutPrint();
		//大まかな流れは教える
		wcp.createWoodCutPrint();
	}
}
