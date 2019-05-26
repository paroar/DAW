
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
	
	public int checkLastNode() {
		if(this.firstNode == null) {
			return 0;
		}
		int numNodes=1;
		Node p = this.firstNode;
		while(p.getNext() != null) {
			p = p.getNext();
			numNodes++;
		}
		int lastData = p.getData();
		if(lastData == numNodes) {
			return 0;
		}else if(lastData < numNodes){
			return -1;
		}else {
			return 1;
		}
		
	}
}
