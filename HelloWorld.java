<<<<<<< HEAD
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
=======
//http://www.javaroad.jp/java_collection2.htm
//List
import java.util.*;

public class HelloWorld{
	void addhead(List exList){
		for(int i=0; i<10000; i++){
			exList.add(0, new Integer(i));
		}
	}

	void addend(List exList){
		for(int i=0; i<10000; i++){
			exList.add(new Integer(i));
		}
	}

	void select(List exList){
		for(int i=0; i<10000; i++){
			exList.get(i);
		}
	}

	public static void main(String[] args){
		long start, stop;
		HelloWorld object = new HelloWorld();
		List al1 = new ArrayList();
		List ll1 = new LinkedList();
		List al2 = new ArrayList();
		List ll2 = new LinkedList();

		//ArrayList先頭追加処理
		start = System.currentTimeMillis();
		object.addhead(al1);
		stop = System.currentTimeMillis();
		System.out.println("ArrayLsitの先頭追加処理：" + (stop-start));

		//LinkedList先頭追加処理
		start = System.currentTimeMillis();
		object.addhead(ll1);
		stop = System.currentTimeMillis();
		System.out.println("LinkedLsitの先頭追加処理：" + (stop-start));
		//先頭追加はLinkedListが早い

		//ArrayList最後追加処理
		start = System.currentTimeMillis();
		object.addend(al2);
		stop = System.currentTimeMillis();
		System.out.println("ArrayLsitの最後追加処理：" + (stop-start));

		//LinkedList最後追加処理
		start = System.currentTimeMillis();
		object.addend(ll2);
		stop = System.currentTimeMillis();
		System.out.println("LinkedLsitの最後追加処理：" + (stop-start));
		//最後追加の速度は変わらない

		//ArrayList検索処理
		start = System.currentTimeMillis();
		object.select(al1);
		stop = System.currentTimeMillis();
		System.out.println("ArrayLsitの検索処理：" + (stop-start));

		//LinkedList検索処理
		start = System.currentTimeMillis();
		object.select(ll1);
		stop = System.currentTimeMillis();
		System.out.println("LinkedLsitの検索処理：" + (stop-start));
		//検索はArrayListが早い

	}
>>>>>>> d085d89eef6966f0f12395638afffb734ec3e825
}
