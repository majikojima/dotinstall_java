//細かいことは生徒に任せ、大まかな流れは教える
public abstract class CutPrint{
	public abstract void draw(Cuttable hanzai);
	public abstract void cut(Cuttable hanzai);
	public abstract void print(Cuttable hanzai);

	//FactoryMethod(インスタンス生成を柔軟に行う)
	protected Cuttable createCuttable(){
		return new Wood();
	}

	/*
	1.版材を用意する
	2.版材となる板に絵を描く
	3.絵にあわせて版材を彫る
	4.プリントする
	*/
	public void createWoodCutPrint(){
		//Cuttableインターフェイスを実装している
		Cuttable hanzai = createCuttable();
		draw(hanzai);
		cut(hanzai);
		print(hanzai);
	}
}