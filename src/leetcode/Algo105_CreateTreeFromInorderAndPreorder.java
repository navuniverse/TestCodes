/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author naveen
 *
 * @date 21-Jul-2019
 */
public class Algo105_CreateTreeFromInorderAndPreorder {

	public static void main(String[] args) {

		int[] inorder = { 9, 3, 15, 20, 7 };
		int[] preorder = { 3, 9, 20, 15, 7 };

		System.out.println(Algo144_PreOrderTraversal.preorderTraversal(buildTree(inorder, preorder)));
	}

	public static TreeNode buildTree(int[] inorder, int[] preorder) {

		if (inorder.length == 0) {
			return null;
		}

		Map<Integer, Integer> inOrderMap = new HashMap<>();

		for (int i = 0; i < inorder.length; i++) {
			inOrderMap.put(inorder[i], i);
		}

		return makeBTree(preorder, 0, inorder.length - 1, 0, preorder.length - 1, inOrderMap);
	}

	public static TreeNode makeBTree(
			int[] preOrder, int inStart, int inEnd, int preStart, int preEnd, Map<Integer, Integer> inOrderMap) {

		System.out.println("InStart: " + inStart + ", InEnd: " + inEnd + ", PreStart: " + preStart + ", PreEnd: " + preEnd);

		if (inStart > inEnd || preStart > preEnd) {
			return null;
		}

		TreeNode root = new TreeNode(preOrder[preStart]);

		System.out.println("InStart: " + inStart + ", InEnd: " + inEnd + ", PreStart: " + preStart + ", PreEnd: " + preEnd + ", Value: " + root.val);

		if (inStart == inEnd) {
			return root;
		}

		int splitIndex = inOrderMap.get(root.val);

		System.out.println("InStart: " + inStart + ", InEnd: " + inEnd + ", PreStart: " + preStart + ", PreEnd: " + preEnd + ", Split: " + splitIndex + ", Value: " + root.val);

		System.out.println("Going Left of " + root.val);
		root.left = makeBTree(preOrder, inStart, splitIndex - 1, preStart + 1, preStart + (splitIndex - inStart), inOrderMap);
		System.out.println("Going Right of " + root.val);
		root.right = makeBTree(preOrder, splitIndex + 1, inEnd, preStart + (splitIndex - inStart) + 1, preEnd, inOrderMap);

		return root;
	}
}