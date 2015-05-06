//細かいことは生徒に任せ、大まかな流れは教える
public abstract class WoodCutPrint{
	public abstract void draw(Cuttable hanzai);
	public abstract void cut(Cuttable hanzai);
	public abstract void print(Cuttable hanzai);
	/*
	1.版材を用意する
	2.版材となる板に絵を描く
	3.絵にあわせて版材を彫る
	4.プリントする
	*/
	public void createWoodCutPrint(){
		//WoodクラスはCuttableインターフェイスを実装している
		Wood hanzai = new Wood();
		draw(hanzai);
		cut(hanzai);
		print(hanzai);
	}
}