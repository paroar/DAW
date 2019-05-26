
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
	
	public void deleteEvenOddNodes(int parity) {
		Node p = this.firstNode;
		if(parity == 0) {
			while(p != null) {
				if(p.getNext() != null) {
					p.setNext(p.getNext().getNext());
					p = p.getNext();
				}else {
					break;
				}
			}
		}else {
			p = p.getNext();
			while(p != null) {
				if(p.getNext() != null) {
					p.setNext(p.getNext().getNext());
					p = p.getNext();
				}else {
					break;
				}
			}
			this.firstNode = this.firstNode.getNext();
		} 
	}
	
	public int oddNodesSum() {
		int oddSum = 0;
		Node p = this.firstNode;
		p = p.getNext();
		while(p != null) {
			oddSum += p.getData();
			if(p.getNext() != null) {
				p = p.getNext().getNext();
			}else {
				return oddSum;
			}
		}
		return oddSum;
	}
	
	public int evenNodesSum() {
		int evenSum = 0;
		Node p = this.firstNode.getNext();
		while(p != null) {
			evenSum += p.getData();
			if(p.getNext() != null) {
				p = p.getNext().getNext();
			}else {
				return evenSum;
			}
		}
		return evenSum;
	}
	
	public void deleteEvenOddNodesSum() {
		if(this.oddNodesSum() == this.evenNodesSum()) {
			this.deleteEvenOddNodes(0);
		}else {
			this.deleteEvenOddNodes(1);
		}
	}
}
