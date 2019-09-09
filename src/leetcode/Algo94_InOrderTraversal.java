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
public class Algo94_InOrderTraversal {

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
		stack.push(root);

		while (!stack.empty()) {

			TreeNode node = stack.peek();
			order.add(node.val);
			stack.pop();

			if (node.right != null) {
				stack.push(node.right);
			}

			if (node.left != null) {
				stack.push(node.left);
			}
		}

		return order;
	}
}