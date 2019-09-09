/**
 * 
 */
package leetcode;

/**
 * @author naveen
 *
 * @date 26-Jul-2019
 */
public class Algo104_TreeDepth {

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

		System.out.println(maxDepth(one));
	}

	public static int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		return getDepth(root, 0);
	}

	static int depth;

	private static int getDepth(TreeNode node, int current) {

		if (node != null) {

			System.out.println("Before -> Node Value: " + node.val + ", Current: " + current + ", Depth: " + depth + ", (depth < current): " + (depth < current));

			if (depth < current) {
				depth = current;
			}

			System.out.println("After -> Node Value: " + node.val + ", Current: " + current + ", Depth: " + depth);

			getDepth(node.left, current + 1);
			getDepth(node.right, current + 1);

		}

		return depth + 1;
	}
}