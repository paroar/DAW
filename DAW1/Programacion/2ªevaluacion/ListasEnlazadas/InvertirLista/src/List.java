
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
	
	public static boolean equalData(Node p, Node q) {
		if(p.getData() == q.getData()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isContained(List l) {
		Node p = this.firstNode;
		Node q = l.firstNode;
		while(q != null && p != null) {
			if(List.equalData(p, q)) {
				q = q.getNext();
			}else {
				p = p.getNext();
			}
		}
		if(q == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void generateListComunNode(List a, List b) {
		Node p = a.firstNode;
		Node q = b.firstNode;
		while(q.getNext() != null) {
			q = q.getNext();
		}
		while(p != null && p.getData() < q.getData()) {
			p = p.getNext();
		}
		if(p == null) {
			return;
		}else {
			if(a.firstNode.getData() > q.getData()) {
				q.setNext(a.firstNode);
			}else {
				q.setNext(p.getNext());
			}
		}
	}
	
	public static void breakListComunNode(List a, List b) {
		Node p = a.firstNode;
		Node q = b.firstNode;
		while(p != null) {
			q = b.firstNode;
			while(q.getNext() != null) {
				q = q.getNext();
				if(q.getNext() == p.getNext()) {
					q.setNext(null);
					p = p.getNext();
					while(p != null) {
						b.insertAfter(p.getData());
						p = p.getNext();
					}
					return;
				}
			}
			p = p.getNext();
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
	
	public void invertir() {
		Node p = this.firstNode;
		Node q = this.firstNode.getNext();
		Node r = this.firstNode;
		int aux;
		while(r.getNext() != null) {
			r = r.getNext(); 
		}
		while(p != r) {
			while(q.getNext() != r && q != r) {
				q = q.getNext();
			}
			aux = r.getData();
			r.setData(p.getData());
			p.setData(aux);
			p = p.getNext();
			r = q;
			q = p.getNext();
		}	
	}
	
	
}
