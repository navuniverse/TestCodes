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
public class Algo106_CreateTreeFromInorderAndPostorder {

	public static void main(String[] args) {

		int[] inorder = { 9, 3, 15, 20, 7 };
		int[] postorder = { 9, 15, 7, 20, 3 };

		System.out.println(Algo144_PreOrderTraversal.preorderTraversal(buildTree(inorder, postorder)));
	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {

		if (inorder.length == 0) {
			return null;
		}

		Map<Integer, Integer> inOrderMap = new HashMap<>();

		for (int i = 0; i < inorder.length; i++) {
			inOrderMap.put(inorder[i], i);
		}

		return makeBTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, inOrderMap);
	}

	public static TreeNode makeBTree(
			int[] inOrder, int[] postOrder, int inStart, int inEnd, int postStart, int postEnd, Map<Integer, Integer> inOrderMap) {

		System.out.println("InStart: " + inStart + ", InEnd: " + inEnd + ", PostStart: " + postStart + ", PostEnd: " + postEnd);

		if (inStart > inEnd || postStart > postEnd) {
			return null;
		}

		TreeNode root = new TreeNode(postOrder[postEnd]);

		System.out.println("InStart: " + inStart + ", InEnd: " + inEnd + ", PostStart: " + postStart + ", PostEnd: " + postEnd + ", Value: " + root.val);

		if (inStart == inEnd) {
			return root;
		}

		int splitIndex = inOrderMap.get(root.val);

		System.out.println("InStart: " + inStart + ", InEnd: " + inEnd + ", PostStart: " + postStart + ", PostEnd: " + postEnd + ", Split: " + splitIndex + ", Value: " + root.val);

		root.left = makeBTree(inOrder, postOrder, inStart, splitIndex - 1, postStart, postStart + splitIndex - (inStart + 1), inOrderMap);
		root.right = makeBTree(inOrder, postOrder, splitIndex + 1, inEnd, postStart + splitIndex - inStart, postEnd - 1, inOrderMap);

		return root;
	}
}