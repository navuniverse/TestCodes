/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author naveen
 *
 * @date 21-Jul-2019
 */
public class Algo144_PreOrderTraversal {

	public static void main(String[] args) {

		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);

		one.right = two;
		two.left = three;

		System.out.println(preorderTraversal(one));
	}

	public static List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> order = new ArrayList<>();

		if (root == null) {
			return order;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;

		while (node != null || !stack.empty()) {

			while (node != null) {
				stack.push(node);
				node = node.left;
			}

			node = stack.pop();

			order.add(node.val);

			node = node.right;
		}

		return order;

	}
}