
public class BTNumberElements {
	
	private BinaryTreeNode btn;

	public BTNumberElements(BinaryTreeNode a) {
		this.btn = a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreeNode a = new BinaryTreeNode("23");
		BinaryTreeNode b = new BinaryTreeNode("44");
		BinaryTreeNode c = new BinaryTreeNode("45");
		BinaryTreeNode d = new BinaryTreeNode("56");
		BinaryTreeNode e = new BinaryTreeNode("666");
		
		a.setLeft(b);
		b.setLeft(c);
		c.setLeft(d);
		d.setRight(e);
		
		BTNumberElements bne = new BTNumberElements(a);
		System.out.println(bne.numElements());

	}

	private int numElements() {
		int numElements = 0;
		
		numElements = numElem(btn);
		
		return numElements;
	}
	
	private int numElem(BinaryTreeNode b)
	{
		if(b.getLeft()!=null)
		{
			return 1 + numElem(b.getLeft());
		}
		else if(b.getRight()!=null)
		{
			return 1 + numElem(b.getRight());
		}
		else if(b.getLeft() == null)
		{
			return 1;
		}
		else if(b.getRight() == null)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	

}
