import java.util.ArrayList;
import java.util.LinkedList;

public class ListsOfNodes {
	void createLevelList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if (root == null) return; // base case
		LinkedList<TreeNode> list = null;
		if(lists.size() == level) {
			list = new LinkedList<TreeNode>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelList(root.left, lists, level+1);
		createLevelList(root.right, lists, level+1);
	}
	ArrayList<LinkedList<TreeNode>> createLevelList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelList(root, lists, 0);
		return lists;
	}
}
