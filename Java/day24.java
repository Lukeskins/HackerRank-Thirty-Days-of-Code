// Day 24 - More Linked Lists

class Solution {
public static Node removeDuplicates(Node head) {
        Node current = head;

        while(current!=null && current.next!=null) {
                Node node = current;
                while(node.next!=null) {
                        if(node.next.data==current.data) {
                                Node next = node.next.next;
                                Node temp= node.next;
                                node.next=next;
                                temp=null;

                        }
                        else {
                                node=node.next;
                        }
                }
                current=current.next;
        }
        return head;
}
}
