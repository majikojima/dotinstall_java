//http://www.javaroad.jp/java_collection4.htm
//List・・・重複要素を許可。要素の順番を保持
//Setインタフェースは重複要素を持たないオブジェクトの集合を実装します
//Mapインタフェースはキーと値が対になった要素を持ちます。
//キーの重複は許可されず各キーは1つの値のみに対応付けられます。
import java.util.*;

public class HelloWorld{
	void showFeature(Map exMap, String s){
		String[] tel = {"090", "06", "052"};
		String[] area = {"Fukuoka", "Osaka", "Nagoya"};
		for(int i=0; i<tel.length; i++){
			exMap.put(tel[i], area[i]);
		}
		System.out.println(s + "=" + exMap);
	}

	public static void main(String[] args){
		HelloWorld object = new HelloWorld();
		object.showFeature(new HashMap(), "HashMap");
		object.showFeature(new TreeMap(), "TreeMap");
		object.showFeature(new LinkedHashMap(), "LinkedHashMap");
	}
}
