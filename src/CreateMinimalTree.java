import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class CreateMinimalTree {
	static public TreeNode createTree(int[] numbers) {
		int len = numbers.length;
		if (len==1) { return new TreeNode(numbers[0]);}
		if (len == 0 ) return null;
		TreeNode root = new TreeNode(numbers[len/2]);
		root.left = createTree(Arrays.copyOfRange(numbers, 0, len/2 - 1));
		root.right = createTree(Arrays.copyOfRange(numbers, len/2 + 1, len));
		return root;
	}
	static public TreeNode createMinmalTree(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start+end) /2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left = createMinmalTree(arr, start, mid-1);
		n.right = createMinmalTree(arr, mid+1, end);
		return n;
	}
	static public ArrayList<LinkedList<TreeNode>> listsOfDepth(TreeNode root) {
		LinkedList<TreeNode> q = new LinkedList<>();

		ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
		if(root == null) return null;
		q.addLast(root);
//		LinkedList<TreeNode> t = new LinkedList<TreeNode>();
//		t.add(root);
//		res.add(t);
		while(!q.isEmpty()) {
			LinkedList<TreeNode> temp = q;
			res.add(temp);
			while(!temp.isEmpty()) {
				TreeNode r = q.removeFirst();
				if(r.left != null) q.addLast(r.left);
				if(r.right != null) q.addLast(r.right);
			}
			
		}
		return res;
	}
	static public void inOrder(TreeNode node) {
		if(node == null) return;
		inOrder(node.left);
		node.printTreeNode();
		inOrder(node.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,3,4,5,6};
		TreeNode r = createTree(test);
		TreeNode v = createMinmalTree(test, 0, test.length-1);
		inOrder(v);
	}
}
