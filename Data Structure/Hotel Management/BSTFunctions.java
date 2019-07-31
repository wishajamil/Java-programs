public class BSTFunctions {
	BSTNode ROOT;
	
	public BSTFunctions() {
		this.ROOT = null;
	}
	
	void insertNode(BSTNode node, Customer newCustomer) {
		if (node == null) {
			node = new BSTNode(newCustomer);
			ROOT = node;
		} else if (newCustomer.getPhoneNumber() < node.newCustomer.getPhoneNumber() && node.left == null ) {
			node.left = new BSTNode(newCustomer);
			node.left.parent = node;
		} else if (newCustomer.getPhoneNumber() >= node.newCustomer.getPhoneNumber() && node.right == null) {
			node.right = new BSTNode(newCustomer);
			node.right.parent = node;
		} else {
			if (newCustomer.getPhoneNumber() < node.newCustomer.getPhoneNumber()) {
				insertNode(node.left, newCustomer);
			} else {
				insertNode(node.right, newCustomer);
			}
		}
	} // end insertNode method
	
	public boolean search(BSTNode node, Customer newCustomer) {
		if (node == null) {
			return false;
		} else if (node.newCustomer.getPhoneNumber() == newCustomer.getPhoneNumber()) {
			return true;
		} else {
			if (newCustomer.getPhoneNumber() < node.newCustomer.getPhoneNumber()) {
				return search(node.left, newCustomer); 
			} else {
				return search(node.right, newCustomer);
			}
		}
	} // end search method
	
	// inOrder method because it presents information in sorted, ascending order
	public void printInOrder(BSTNode node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.print(node.newCustomer.toString()+"\n");
			printInOrder(node.right);
		}
	} // end printInOrder method
	
	
}