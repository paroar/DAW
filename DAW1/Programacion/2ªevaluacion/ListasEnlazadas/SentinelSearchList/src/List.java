
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
	
	public void insertBeginning(int data) {
		Node newNode = new Node(data);
		if(this.firstNode == null) {
			this.firstNode = newNode;
			return;
		}
		newNode.setNext(this.firstNode);
		this.firstNode = newNode;
	}
	
	public void insertOrder(int data) {
		Node newNode = new Node(data);
		if(this.firstNode == null) {
			this.firstNode = newNode;
			return;
		}
		if(this.firstNode.getData() > data) {
			this.insertBeginning(data);
			return;
		}
		Node p = this.firstNode;
		while(p.getNext() != null) {
			p = p.getNext();
		}
		if(p.getData() < data ) {
			this.insertAfter(data);
			return;
		}
		p = this.firstNode;
		while(p.getNext() != null && p.getNext().getData() < data) {
			p = p.getNext();
		}
		newNode.setNext(p.getNext());
		p.setNext(newNode);
	}
	
	public void deleteData(int data) {
		Node p = this.firstNode;
		while(p.getNext() != null) {
			if(p.getNext().getData() == data) {
				p.setNext(p.getNext().getNext());
			}else {
				p = p.getNext();
			}
		}
		if(this.firstNode.getData() == data) {
			this.firstNode = this.firstNode.getNext();
		}
	}
	
	public void sentinelSearch(int data) {
		Node newNode = new Node(data);
		this.insertAfter(data);
		Node p = this.firstNode;
		boolean isIn= false;
		while(p.getNext() != null) {
			if(p.getNext().getData() == data) {
				if(p.getNext().getNext() != null) {
					isIn = true;
				}
				p.setNext(p.getNext().getNext());
				
			}else {
				p = p.getNext();
			}
			
		}
		if(isIn) {
			newNode.setNext(this.firstNode);
			this.firstNode = newNode;
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
	
	
}
