
public class List {

	private Node firstNode;
	
	public List() {
		this.firstNode = null;
	}
	
	public void insertAfter(int data) {
		Node newNode = new Node(data);
		if(this.firstNode == null) {
			this.firstNode = newNode;
		}else {
			Node p = this.firstNode;
			while(p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(newNode);
		}
	}
	
	public String showContent() {
		String output = "";
		Node p = this.firstNode;
		while(p.getNext() != null) {
			output += p.getData() + "-->";
			p = p.getNext();
		}
		p.getNext();
		output += p.getData();
		return output;
	}
	
	public int sumData() {
		int sum = 0;
		Node p = this.firstNode;
		while(p != null) {
			sum += p.getData();
			p = p.getNext();
		}
		return sum;
	}
	
	public void insertCeroAfterSum() {
		int sum = this.sumData();
		Node p = this.firstNode;
		int count = sum-1;
		while(p.getNext() != null) {
			p = p.getNext();
			count --;
			if(count == 0 ) {
				Node newNode = new Node(0);
				newNode.setNext(p.getNext());
				p.setNext(newNode);
				count = sum;
				p = p.getNext();
			}
		}
	}

}
