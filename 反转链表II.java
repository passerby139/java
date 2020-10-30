package leeCode;

public class ·´×ªÁ´±íII {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        //ListNode node4 = new ListNode(4);
        //ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        //node4.next = node5;
        //node5.next = null;
        ListNode node = reverseBetween(node1,1,2);
        while(node != null){
            System.out.print(node.val+"->");
            node = node.next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int m, int n) {
    	int sum = 0;
        ListNode temp = head;
        while (head.next != null){
        	sum++;
            if(m >= n)
                break;
            if(sum == m){
                change(head,n-m,head);
                m++;
                n--;
            }
            head = head.next;
        }
        return temp;
    }
    public static void change(ListNode node, int temp,ListNode node2){
        if(temp == 0){
            int t = node.val;
            node.val = node2.val;
            node2.val = t;
        }else{
            change(node,temp-1,node2.next);
        }
    }
}
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) {
       val = x;
   }
}