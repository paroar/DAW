
public class Test {

	public static void main(String[] args) {
		List list = new List();
		int count = InputData.readInteger();
		for(int i = 0; i < count; i++) {
			list.insertAfter(InputData.readInteger());
		}
		System.out.println(list.showContent());
		list.insertCeroAfterSum();
		System.out.println(list.showContent());
	}

}
