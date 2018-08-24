package leetcode.problems;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumber {

    public static void main(String[] args) {
        AddTwoNumber twoNumber = new AddTwoNumber();
        twoNumber.addTwoNumber();
    }

    public void addTwoNumber(){
        Node head1 = new Node(2);
        Node second1 = new Node(4);
        Node third1 = new Node(3);
        Node four1 = new Node(3);
        head1.setNext(second1);
        second1.setNext(third1);
        third1.setNext(four1);

        Node head2 = new Node(5);
        Node second2 = new Node(6);
        Node third2 = new Node(4);
        head2.setNext(second2);
        second2.setNext(third2);

        Node ret = addTwoList(head1, head2);
        while(ret != null) {
            System.out.print(ret.getVal());
            if (ret.getNext() != null) {
                System.out.print(" -> ");
            }
            ret = ret.getNext();
        }
    }

    public Node addTwoList(Node head1, Node head2) {
        Node newHead = new Node(0);
        Node alwaysHead = newHead;
        int retVal = getIntFromList(head1) + getIntFromList(head2);
        int[] arr = new int[]{};
        while (retVal > 10 ) {
            int first = retVal % 10;
            Node cur = new Node(first);
            newHead.setNext(cur);
            newHead = cur;
            retVal = retVal / 10;
        }
        newHead.setNext(new Node(retVal));
        return alwaysHead.getNext();
    }

    public int getIntFromList(Node head) {
        int ret = 0;
        int cal = 1;
        while (head != null) {
            ret = ret + head.getVal() * cal;
            cal = cal * 10;
            head = head.getNext();
        }
        System.out.println("Get Int from List: " + ret);
        return ret;
    }

    public class Node {
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
