package AssignmentThree;

import java.util.*;

public class BST {

	private Node root;

	public Node GetRootValue() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BST() {
		root = null;
	}

	public void insert(int data) {
		if (root == null)
			root = new Node(data);
		else {
			Node temp = root;
			while (true) {
				
				if (data < temp.data) {
					if (temp.left == null) {
						temp.left = new Node(data);
						break;
					} else {
						temp = temp.left;
					}
				} else {
				
					if (temp.right == null) {
						temp.right = new Node(data);
						break;
					} else {
						temp = temp.right;
					}

				}
			}
		}

	}

	public void addRecursive(Node objNode, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data < objNode.data) {
			if (objNode.left != null)
				addRecursive(objNode.left, data);
			else {
				objNode.left = new Node(data);
			}
		} else {
			if (objNode.right != null)
				addRecursive(objNode.right, data);
			else {
				objNode.right = new Node(data);
			}
		}
	}

	public Node ImmediateSuccessor(Node objNode) {
		if (objNode.right == null) {
			return null;
		} else {
			return ImmediateSuccessorRec(objNode.right);
		}
	}

	private Node ImmediateSuccessorRec(Node objNode) {
		if (objNode.left == null)
			return objNode;
		else
			return ImmediateSuccessorRec(objNode.left);
	}

	public Node find(int data) {
		if (root == null)
			return null;
		else
			return FindRecursion(root, data);
	}

	private Node FindRecursion(Node objNode, int data) {
		if (objNode == null)
			return null;
		else if (data == objNode.data)
			return objNode;
		else if (data < objNode.data)
			return FindRecursion(objNode.left, data);
		else
			return FindRecursion(objNode.right, data);
	}
	
	public Node FindParent(int data) {
		if (root == null)
			return null;
		else if (root.data == data)
			return root;
		else
			return findParentRec(root, root, data);
	}

	public Node findParentRec(Node parentNode, Node objNode, int data) {
		if (objNode == null)
			return null;
		else if (data == objNode.data)
			return parentNode;
		else if (data < objNode.data) {
			return findParentRec(objNode, objNode.left, data);
		} else {
			return findParentRec(objNode, objNode.right, data);
		}
	}

	public void delete(int data) {

		if (root == null) {
		} else {
			Node objNode = find(data);
			Node ObjNodeParent = FindParent(data);
			if (objNode == null) {
			} else if (objNode == ObjNodeParent) {
				ObjNodeParent = null;
			} else if (objNode.left == null && objNode.right == null) {
				if (ObjNodeParent.left.data == objNode.data) {
					ObjNodeParent.left = null;
				} else
					ObjNodeParent.right = null;
			} else if (objNode.left != null && objNode.right == null) {
				if (ObjNodeParent.left.data == objNode.data) {
					ObjNodeParent.left = objNode.left;
				} else
					ObjNodeParent.right = objNode.left;
			} else if (objNode.right != null && objNode.left == null) {
				if (ObjNodeParent.left.data == objNode.data) {
					ObjNodeParent.left = objNode.right;
				} else
					ObjNodeParent.right = objNode.right;
			} else {
				Node objNodeSuccessor = ImmediateSuccessor(objNode);
				ObjNodeParent = FindParent(objNodeSuccessor.data);
				objNode.data = objNodeSuccessor.data;
				if (ObjNodeParent.left.data == objNodeSuccessor.data) {
					ObjNodeParent.left = objNodeSuccessor.right;
				} else
					ObjNodeParent.right = objNodeSuccessor.right;

			}
		}
	}

	public void inorderTraversal(Node objNode) {

		if (objNode == null) {
		} else {
			inorderTraversal(objNode.left);
			System.out.print(objNode.data + " ");
			inorderTraversal(objNode.right);
		}

	}

	public void preorderTraversal(Node objNode) {
		if (objNode == null) {
		} else {
			System.out.print(objNode.data + " ");
			preorderTraversal(objNode.left);
			preorderTraversal(objNode.right);
		}

	}

	public void postorderTraversal(Node objNode) {
		if (objNode == null) {
		} else {
			postorderTraversal(objNode.left);
			postorderTraversal(objNode.right);
			System.out.print(objNode.data + " ");
		}

	}

	public void BFT(Node objNode) {

		Deque<Node> objDeque = new ArrayDeque<>();
		if (objNode != null) {
			objDeque.add(objNode);
		}
		while (!objDeque.isEmpty()) {
			Node temp = objDeque.remove();
			System.out.print(temp.data + " ");
			if (temp.left != null)
				objDeque.add(temp.left);
			if (temp.right != null)
				objDeque.add(temp.right);
		}

	}

	
}
