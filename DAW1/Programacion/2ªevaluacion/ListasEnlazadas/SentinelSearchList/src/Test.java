
public class Test {

	public static void main(String[] args) {
		List list1 = new List();
		int count = InputData.readInteger();
		for(int i = 0; i < count; i++) {
			list1.insertOrder(InputData.readInteger());
		}
		System.out.println(list1.showContent());
		list1.sentinelSearch(InputData.readInteger());
		System.out.println(list1.showContent());
	}
}
