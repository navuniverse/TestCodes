/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author naveen
 *
 * @date 26-Jul-2019
 */
public class Algo102_BFSTraversal {

	public static void main(String[] args) {

		TreeNode one = new TreeNode(3);
		TreeNode two = new TreeNode(9);
		TreeNode three = new TreeNode(20);
		TreeNode four = new TreeNode(15);
		TreeNode five = new TreeNode(7);

		one.left = two;
		one.right = three;

		three.left = four;
		three.right = five;

		System.out.println(levelOrder(one));
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> order = new ArrayList<>();

		Queue<TreeNode> nodes = new LinkedList<>();

		if (root != null) {
			nodes.add(root);
		}

		while (!nodes.isEmpty()) {

			List<Integer> levelOrder = new ArrayList<>();

			Queue<TreeNode> tempQueue = new LinkedList<>();

			System.out.println("Current Nodes Size: " + nodes.size());

			while (!nodes.isEmpty()) {

				TreeNode node = nodes.poll();

				if (node.left != null) {
					tempQueue.add(node.left);
				}

				if (node.right != null) {
					tempQueue.add(node.right);
				}

				levelOrder.add(node.val);
			}

			System.out.println("New Nodes Size: " + tempQueue.size());

			while (!tempQueue.isEmpty()) {
				TreeNode tempNode = tempQueue.poll();
				nodes.add(tempNode);
			}

			order.add(levelOrder);
		}

		return order;
	}

}