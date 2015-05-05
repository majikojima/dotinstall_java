//http://www.javaroad.jp/java_collection3.htm
//List・・・重複要素を許可。要素の順番を保持
//Setインタフェースは重複要素を持たないオブジェクトの集合を実装します
import java.util.*;

public class HelloWorld{
	void showFeature(Set exSet, String s){
		int[] intArray = {5,8,2,9,1};
		for(int i=0; i<intArray.length; i++){
			exSet.add(intArray[i]);
		}
		System.out.println(s + "=" + exSet);
	}

	public static void main(String[] args){
		HelloWorld object = new HelloWorld();
		//順序はランダム
		object.showFeature(new HashSet(), "HashSet");
		//順序は昇順
		object.showFeature(new TreeSet(), "TreeSet");
		//順序は挿入順
		object.showFeature(new LinkedHashSet(), "LinkedHashSet");
	}
}
