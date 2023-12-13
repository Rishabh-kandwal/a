package tree;

import java.util.Scanner;

public class binarytree {
	nodes root;

	void rootnode(Scanner sc) {
		System.out.println("enter value in root of the tree");
		int a = sc.nextInt();
		root = new nodes(a);
		System.out.println("Press true for entering data into left node" + root.value);
		boolean l = sc.nextBoolean();
		if (l)
		rootLeft(root, sc);
		System.out.println("Press true for entering data into right node "+root.value);
		boolean r=sc.nextBoolean();
		if(r)
		rootRight(root,sc);
	}

	private void rootRight(nodes n, Scanner sc) {
		System.out.println("Enter data in the right" + n.value);
		int a = sc.nextInt();
		n.right = new nodes(a);
		System.out.println("Press true for entering data into right node " + n.right.value);
		boolean r = sc.nextBoolean();

		if (r)
			rootRight(n.right, sc);

		System.out.println("Press true for entering data into right sibling " + n.right.value);

		boolean l = sc.nextBoolean();
		if (l)
			rootLeft(n, sc);
		 System.out.println("Press true for entering data into right node"+n.left.value);

	}

	private void rootLeft(nodes n, Scanner sc) {
		System.out.println("Enter data in the left" + n.value);
		int a = sc.nextInt();
		n.left = new nodes(a);
		System.out.println("Press true for entering data into left node " + n.left.value);
		boolean l = sc.nextBoolean();

		if (l)
			rootLeft(n.left, sc);

		System.out.println("Press true for entering data into right sibling " + n.left.value);

		l = sc.nextBoolean();
		if (l)
			rootRight(n, sc);
	}

	public void display() {
		display(root, "");
	}

	private void display(nodes node, String i) {
		if (node == null) {
			return;
		}
		System.out.println(i + node.value);
		display(node.left, i + '\t');
		display(node.right, i + '\t');

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		binarytree b = new binarytree();
		b.rootnode(sc);
		b.display();
		System.out.println();
	}

}

class nodes {
	int value;
	nodes left;
	nodes right;

	nodes(int v) {
		this.value = v;
	}
}