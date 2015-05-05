public class Hanako implements Chairperson{
	//太郎君をコンポジション
	private Taro taro = new Taro();

	public void organizeClass(){
		//花子は太郎を操りクラスをまとめる（委譲）
		taro.enjoyWithAllClassmate();
	}
}