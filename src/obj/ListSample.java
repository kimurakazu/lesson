package obj;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

//		names.add("るる");
//		names.add("めい");
//		names.add("みる");
//
//		for(String name:names) {
//			System.out.println(name);
//		}
		//System.out.println(names.get(1));



//
//		ArrayList<Sankaku> sList = new ArrayList<Sankaku>();
//		sList.add(new Sankaku(10,5));
//		sList.add(new Sankaku(8,5));
//		sList.add(new Sankaku(20,10));
//
//		for(Sankaku s : sList) {
//			s.menseki();
//		}

		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		ilist.set(0,50);
		System.out.println(ilist.get(2));
		ilist.remove(2);
		for(int n : ilist) {
			System.out.println(n);
		}

		List<String> llist = new LinkedList<>();
		llist.add("abc");
		llist.add("def");
		llist.add("ghi");
		for(String l : llist) {
			System.out.println(l);
		}
	}


}
