package AssignmentThree;

import java.util.*;

// @author Anurag Kolluru   

public class AssignmentThree {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		System.out.println("Problem01------------------");
		System.out.print("Enter the number of elements: ");
		int n = scnr.nextInt();
		System.out.print("Enter the elements: ");
		BST b1 = new BST();
		for (int i = 0; i < n; i++) {
			int element = scnr.nextInt();
			b1.insert(element);
		}
		Node root1 = b1.GetRootValue();

		System.out.print("Enter the number of elements: ");
		n = scnr.nextInt();
		System.out.print("Enter the elements: ");
		BST b2 = new BST();
		for (int i = 0; i < n; i++) {
			int e = scnr.nextInt();
			b2.insert(e);
		}
		Node root2 = b2.GetRootValue();
		boolean identicalTree = identical(root1, root2);
		System.out.println("Output: " + identicalTree);
		if (identicalTree) {
			System.out.println("Reason is that both the binary trees have same content and structure");
		} else {
			System.out.println("Reason is that both the binary trees have different structures");
		}
		System.out.println();
		System.out.println();

		System.out.println("Problem02------------------");
		System.out.print("Enter the number of elements: ");
		n = scnr.nextInt();
		System.out.print("Enter the elements: ");
		b1 = new BST();
		for (int i = 0; i < n; i++) {
			int element = scnr.nextInt();
			b1.insert(element);
		}
		root1 = b1.GetRootValue();
		System.out.print("Enter the value of K: ");
		int K = scnr.nextInt();
		int Sum = GetSumValue(root1, K);
		if (Sum == 0) {
			Sum = -1;
		}
		System.out.println("Output: " + Sum);
		System.out.println();
		System.out.println();

		System.out.println("Problem03------------------");
		System.out.print("Enter the number of elements: ");
		n = scnr.nextInt();
		System.out.print("Enter the elements: ");
		b1 = new BST();
		for (int i = 0; i < n; i++) {
			int element = scnr.nextInt();
			b1.insert(element);
		}
		root1 = b1.GetRootValue();
		System.out.print("Enter the value of K: ");
		K = scnr.nextInt();
		int value = large(root1, K);
		System.out.println("Output: " + value);
		System.out.println();
		System.out.println();

		System.out.println("Problem04------------------");
		System.out.print("Enter the Number of Elements: ");
		n = scnr.nextInt();
		System.out.print("Enter the Elements: ");
		b1 = new BST();
		for (int i = 0; i < n; i++) {
			int e = scnr.nextInt();
			b1.insert(e);
		}
		root1 = b1.GetRootValue();
		prntEvn(root1);

	}

	public static void prntEvn(Node root) {
		Queue<Node> q1 = new LinkedList<>();
		q1.add(root);
		System.out.print("Output: ");
		boolean isEven = true;
		while (!q1.isEmpty()) {
			int size = q1.size();
			for (int i = 0; i < size; i++) {
				Node node = q1.poll();

				if (node.left != null)
					q1.add(node.left);
				if (node.right != null)
					q1.add(node.right);
				if (isEven && q1.size() != 0)
					System.out.print(node.data + ",");
				else if (isEven)
					System.out.print(node.data);
			}
			isEven = !isEven;
		}
	}

	public static int large(Node root, int k) {

		Node curVal = root;
		Node large = null;
		int cnt = 0;
		while (curVal != null) {
			if (curVal.right == null) {
				cnt = cnt + 1;
				if (cnt == k)
					large = curVal;
				curVal = curVal.left;
			} else {
				Node Successor = curVal.right;
				while (Successor.left != null && Successor.left != curVal)
					Successor = Successor.left;
				if (Successor.left == null) {
					Successor.left = curVal;
					curVal = curVal.right;
				} else {
					Successor.left = null;
					cnt = cnt + 1;
					if (cnt == k)
						large = curVal;
					curVal = curVal.left;
				}
			}
		}
		return large.data;
	}

	public static int GetSumValue(Node root, int K) {
		if (root == null)
			return 0;
		int sumleft = GetSumValue(root.left, K);
		int sumright = GetSumValue(root.right, K);
		int sum = root.data <= K ? root.data : 0;
		return sumleft + sumright + sum;
	}

	public static boolean identical(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		else if (root1 != null && root2 == null)
			return false;
		else if (root1 == null && root2 != null)
			return false;
		else {

			if (root1.data == root2.data && identical(root1.left, root2.left)
					&& identical(root1.right, root2.right))
				return true;
			else
				return false;
		}

	}

}
