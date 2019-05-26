
public class Test {

	public static void main(String[] args) {
		List list1 = new List();
		int count = InputData.readInteger();
		for(int i = 0; i < count; i++) {
			list1.insertOrder(InputData.readInteger());
		}
		List list2 = new List();
		count = InputData.readInteger();
		for(int i = 0; i < count; i++) {
			list2.insertOrder(InputData.readInteger());
		}
		System.out.println(list1.showContent());
		System.out.println(list2.showContent());
		System.out.println("-----------------");
		List.generateListComunNode(list1, list2);
		System.out.println(list1.showContent());
		System.out.println(list2.showContent());
		System.out.println("-----------------");
		List.breakListComunNode(list1, list2);
		list1.insertAfter(7);
		System.out.println(list1.showContent());
		System.out.println(list2.showContent());
	}
}
