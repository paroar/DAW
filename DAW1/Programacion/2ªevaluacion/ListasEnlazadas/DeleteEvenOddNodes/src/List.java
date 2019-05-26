
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
	
	public int countNodes() {
		Node p = this.firstNode;
		int parity = 0;
		while(p != null) {
			parity++;
			p = p.getNext();
		}
		if(parity % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public void deleteEvenOddNodes() {
		Node p = this.firstNode;
		if(this.countNodes() == 0) {
			while(p != null) {
				p.setNext(p.getNext().getNext());
				p = p.getNext();
			}
		}else {
			p = p.getNext();
			while(p != null) {
				p.setNext(p.getNext().getNext());
				p = p.getNext();
			}
			this.firstNode = this.firstNode.getNext();
		} 
	}

}
