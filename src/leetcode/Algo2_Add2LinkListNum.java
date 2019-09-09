/**
 * 
 */
package leetcode;

/**
 * @author naveen
 *
 * @date 20-Jul-2019
 */
public class Algo2_Add2LinkListNum {

	public static void main(String[] args) {

		Algo2_Add2LinkListNum algo2 = new Algo2_Add2LinkListNum();

		ListNode listNode1 = algo2.new ListNode(9);

		ListNode listNode2 = algo2.new ListNode(1);
		ListNode listNode21 = algo2.new ListNode(9);
		ListNode listNode22 = algo2.new ListNode(9);
		ListNode listNode23 = algo2.new ListNode(9);
		ListNode listNode24 = algo2.new ListNode(9);
		ListNode listNode25 = algo2.new ListNode(9);
		ListNode listNode26 = algo2.new ListNode(9);
		ListNode listNode27 = algo2.new ListNode(9);
		ListNode listNode28 = algo2.new ListNode(9);
		ListNode listNode29 = algo2.new ListNode(9);
		ListNode listNode30 = algo2.new ListNode(9);
		ListNode listNode31 = algo2.new ListNode(9);
		ListNode listNode32 = algo2.new ListNode(9);
		ListNode listNode33 = algo2.new ListNode(9);
		ListNode listNode34 = algo2.new ListNode(9);
		ListNode listNode35 = algo2.new ListNode(9);
		ListNode listNode36 = algo2.new ListNode(9);
		ListNode listNode37 = algo2.new ListNode(9);
		ListNode listNode38 = algo2.new ListNode(9);

		listNode2.next = listNode21;
		listNode21.next = listNode22;
		listNode22.next = listNode23;
		listNode23.next = listNode24;
		listNode24.next = listNode25;
		listNode25.next = listNode26;
		listNode26.next = listNode27;
		listNode27.next = listNode28;
		listNode28.next = listNode29;
		listNode29.next = listNode30;
		listNode30.next = listNode31;
		listNode31.next = listNode32;
		listNode32.next = listNode33;
		listNode33.next = listNode34;
		listNode34.next = listNode35;
		listNode35.next = listNode36;
		listNode36.next = listNode37;
		listNode37.next = listNode38;

		ListNode output = addTwoNumbersSolved(listNode1, listNode2);

		System.out.println(output.val);

		while (output.next != null) {
			System.out.println(output.next.val);
			output = output.next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		Algo2_Add2LinkListNum algo2 = new Algo2_Add2LinkListNum();

		long number1 = l1.val;
		int multiplier1 = 1;

		while (l1.next != null) {
			l1 = l1.next;

			number1 += (l1.val * (long) Math.pow(10, multiplier1));
			multiplier1++;
		}

		long number2 = l2.val;
		int multiplier2 = 1;

		while (l2.next != null) {
			l2 = l2.next;

			number2 += (l2.val * (long) Math.pow(10, multiplier2));
			multiplier2++;
		}

		System.out.println("number1: " + number1);
		System.out.println("number2: " + number2);

		long sum = number1 + number2;

		ListNode result = null;
		ListNode last = null;

		while (sum > 9) {

			System.out.println("sum: " + sum);
			System.out.println("result: " + result);
			System.out.println("last: " + last);

			int mod = (int) (sum % 10);

			if (result == null) {
				result = algo2.new ListNode(mod);
			} else {

				if (last == null) {
					last = algo2.new ListNode(mod);
					result.next = last;
				} else {
					ListNode temp = algo2.new ListNode(mod);
					last.next = temp;
					last = last.next;
				}
			}
			sum = sum / 10;

		}

		if (result == null) {
			result = algo2.new ListNode((int) sum);
			sum = sum / 10;
		}

		if (last != null) {
			last.next = algo2.new ListNode((int) sum);
		} else if (sum > 0) {
			last = algo2.new ListNode((int) sum);
			result.next = last;
		}
		return result;
	}

	public static ListNode addTwoNumbersSolved(ListNode l1, ListNode l2) {
		Algo2_Add2LinkListNum algo2 = new Algo2_Add2LinkListNum();

		ListNode temp = algo2.new ListNode(0);
		ListNode node1 = l1;
		ListNode node2 = l2;
		ListNode curr = temp;

		int carry = 0;

		while (node1 != null || node2 != null) {

			int num1 = (node1 != null) ? node1.val : 0;
			int num2 = (node2 != null) ? node2.val : 0;

			int sum = carry + num1 + num2;
			carry = sum / 10;
			curr.next = algo2.new ListNode(sum % 10);
			curr = curr.next;

			if (node1 != null) {
				node1 = node1.next;
			}
			if (node2 != null) {
				node2 = node2.next;
			}
		}

		if (carry > 0) {
			curr.next = algo2.new ListNode(carry);
		}

		return temp.next;
	}

	class ListNode {

		int val;
		ListNode next;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ListNode [val=").append(val).append(", next=").append(next).append("]");
			return builder.toString();
		}

		ListNode(int x) {
			val = x;
		}
	}
}
