// BST are not allowed to contain multiple items 
// will have to add option to book into an existing customer account
// aka can't create a new BST node every time someone books

public class BSTNode {
	Customer newCustomer;
	BSTNode parent;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(Customer newCustomer) {
		this.newCustomer = newCustomer;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public BSTNode() {
		// 
	}
}


