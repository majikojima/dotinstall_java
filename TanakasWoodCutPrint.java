//田中のやり方
public class TanakasWoodCutPrint extends WoodCutPrint{
	public void draw(Cuttable hanzai){
		System.out.println("版材に田中の絵を描く");
	}
	public void cut(Cuttable hanzai){
		System.out.println("彫刻刀で版材を彫る");
	}
	public void print(Cuttable hanzai){
		System.out.println("判子でプリント");
	}
}