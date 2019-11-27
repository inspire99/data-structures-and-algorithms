
public class BinaryTreeNode {
	
	String data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(String data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public BinaryTreeNode(String data, BinaryTreeNode pleft, BinaryTreeNode pright)
	{
		this.data = data;
		left = pleft;
		right = pright;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public BinaryTreeNode getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BinaryTreeNode getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
	

}
