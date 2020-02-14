package day7;

public class A {
	public static void main(String[] args) {
		STree t = new STree();
		t.setRoot('A');
		System.out.println(t.search(t.root, 'A'));
		t.addLeft('A','B');
		System.out.println(t.search(t.root, 'A'));
		t.addRight('A', 'C');
		System.out.println(t.search(t.root, 'A'));
		t.addLeft('B', 'D');
		t.addRight('B', 'E');
		t.addLeft('E', 'H');
		t.addRight('E', 'I');
		t.addLeft('C', 'F');
		t.addRight('C', 'G');
		System.out.println(t.search(t.root, 'H'));
		t.preOrder(t.root);
		System.out.println();
		t.inOrder(t.root);
		System.out.println();
		t.postOrder(t.root);
	}
	static class STree{
		Node root;
		public void setRoot(char ch) {
			Node temp = new Node(ch);
			root = temp;

		}
		
		void  preOrder(Node node) {
			if(node==null)
				return;
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
		
		void  inOrder(Node node) {
			if(node==null)
				return;
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
		
		void  postOrder(Node node) {
			if(node==null)
				return;
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);

		}
		
		void addLeft(char parent, char data) {
			Node p = search(root, parent);
			if(p==null) {
				System.out.println("못찾음");
				return;
			}
			Node temp = new Node(data);
			p.left = temp;
		}
		
		void addRight(char parent, char data) {
			Node p = search(root, parent);
			if(p==null) {
				System.out.println("못찾음");
				return;
			}
			Node temp = new Node(data);
			p.right = temp;
		}
		
		static Node search(Node p, char parent) {
			if(p != null) {
				if(p.data==parent)
					return p;
			}
			Node nLeft = p.left;
			Node nRight = p.right;
			if(nLeft==null&nRight==null) {
				return null;
			}
			if(nLeft!=null&nRight!=null) {
				if(nLeft.data==parent)
					return nLeft;
				if(nRight.data==parent)
					return nRight;
				Node t1 = search(nLeft, parent);
				Node t2 = search(nRight, parent);
				if(t1==null&&t2==null) {
					return null;
				}else if(t1==null) {
					return t2;
				}else {
					return t1;
				}
			}
			if(nLeft!=null) {
				if(nLeft.data==parent) {
					return nLeft;
				}
				return search(nLeft,parent);
			}
			if(nRight!=null) {
				if(nRight.data==parent) {
					return nRight;
				}
				return search(nRight,parent);
			}
			return null;
		}
		
	}
	
	static class Node{
		char data;
		Node left;
		Node right;
		public Node(char data) {
			super();
			this.data = data;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
	}

	
}
