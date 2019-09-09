/**
 * 
 */
package leetcode;

/**
 * @author naveen
 *
 * @date 21-Jul-2019
 */
public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TreeNode [val=").append(val).append("]");
		return builder.toString();
	}

}