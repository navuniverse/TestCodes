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
public class Algo145_PostOrderTraversal {

	public static void main(String[] args) {

		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);

		one.right = two;
		two.left = three;

		System.out.println(postorderTraversal(one));
	}

	private static List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> order = new ArrayList<>();

		if (root == null) {
			return order;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		TreeNode last = null;

		while (node != null || !stack.empty()) {

			while (node != null) {
				stack.push(node);
				node = node.left;
			}

			TreeNode temp = stack.peek();

			System.out.println("Stack: " + stack);
			System.out.println("Order: " + order);
			System.out.println("Last Node: " + last);
			System.out.println("Processing Node: " + temp);
			System.out.println("Terminating conditions - one - " + (temp.right == null) + " or two - " + (temp.right == last));

			if (temp.right == null || temp.right == last) {
				order.add(temp.val);
				last = stack.pop();
			} else {
				//stack.push(temp.right);
				node = temp.right;
			}
		}

		return order;
	}
}