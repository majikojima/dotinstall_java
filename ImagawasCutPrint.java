public class ImagawasCutPrint extends CutPrint{

	public void draw(Cuttable hanzai){
		System.out.println("漫画を描く");
	}
	public void cut(Cuttable hanzai){
		System.out.println("彫刻刀で切る");
	}
	public void print(Cuttable hanzai){
		System.out.println("自分の血でプリントする");
	}

	//FactoryMethod(インスタンス生成を柔軟に行う)
	protected Cuttable createCuttable(){
		//今川は芋
		return new Potato();
	}
}