//http://www.techscore.com/tech/DesignPattern/Prototype.html/
//Prototypeパターン

public class HelloWorld{
	//この関数は時間がかかる
	// public Paper[] createManyCrystals(){
	// 	Peper[] papers = new Paper[100];
	// 	for(int i=0; i<papers.length; i++){
	// 		//時間がかかる処理
	// 	}
	// 	return papers;
	// }

	//こっちの方が良い
	public Paper[] createManyCrystals(){
		Paper prototype = new Paper("snow");
		//時間がかかる処理は一度

		Paper[] papers = new Paper[100];

		for(int i=0; i<papers.length; i++){
			papers[i] = (Paper)prototype.createClone();
			System.out.println(i + "\t" + papers[i].getName());
		}
		return papers;
	}

	public static void main(String[] args){
		HelloWorld object = new HelloWorld();
		Paper[] papers = object.createManyCrystals();
	}
}
