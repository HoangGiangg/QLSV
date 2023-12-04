public class Tree {
	int label;
	Tree left;
	Tree right;
	Tree(int data){
		this.label=data;
		this.left=null;
		this.right=null;
	}
	public static void read(Tree N) {
		if (N!=null) {
			
			read(N.left);
			
			read(N.right);
			System.out.print(N.label+" ");
		}
	}
	public static int countnode(Tree N) {
		if (N==null) return 0;
		else return 1+countnode(N.left)+countnode(N.right);
	}
	public static int countleaf(Tree N) {
		if (N==null) return 0;
		if (N.left==null&&N.right==null) return 1;
		else return countleaf(N.left)+countleaf(N.right);
	}
	public static int highttree(Tree N) {
		if (N==null) return 0;
		else {
			if (highttree(N.left)>highttree(N.right)) return 1+highttree(N.left);
			else return 1+highttree(N.right);
		}
	}
	public static Tree nodeleft(Tree N) {
		if (N==null) return null;
		if (N.left==null) return N;
		else return nodeleft(N.left);
	}
	public static Tree noderight(Tree N) {
		if (N==null) return null;
		if (N.right==null) return N;
		else return noderight(N.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree N7 = new Tree(7);
		Tree N5 = new Tree(5);
		Tree N12 = new Tree(12);
		Tree N3 = new Tree(3);
		Tree N6 = new Tree(6);
		Tree N9 = new Tree(9);
		Tree N15 = new Tree(15);
		Tree N1 = new Tree(1);
		Tree N4 = new Tree(4);
		Tree N8 = new Tree(8);
		Tree N10 = new Tree(10);
		Tree N13 = new Tree(13);
		Tree N17 = new Tree(17);
		N7.left=N5;N7.right=N12;
		N5.left=N3;N5.right=N6;N12.left=N9;N12.right=N15;
		N3.left=N1;N3.right=N4;N9.left=N8;N9.right=N10;N15.left=N13;N15.right=N17;
		read(N7);
		System.out.println();
		System.out.println("So node cua cay: "+countnode(N7));
		System.out.println("So la cua cay: "+countleaf(N7));
		System.out.println("Chieu cao cay la: "+highttree(N7));
		System.out.println("Gia tri nho nhat: "+nodeleft(N7).label);
		System.out.println("Gia tri lon nhat: "+noderight(N7).label);
	}

}
