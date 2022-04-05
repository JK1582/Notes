import java.util.List;

public class LinkedList{
    public static void main(String args[]){
    System.out.println(Sbuilder(""));
    }
    public static String Sbuilder(String s){
        StringBuilder str= new StringBuilder(s);
        str.append("hello");
        str.insert(0, "s");
        str.delete(0, 1);
        return str.toString();
    }
    /*
    public void deleteNode(ListNode node) {
        if(node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
    ListNode<Integer> solution(ListNode<Integer> l, int k) {
    ListNode<Integer> newHead = new ListNode<>(null)/*,p=newHead ;
    ///that is using an already defined
    newHead.next = l;
    
    ListNode<Integer> current = l;
    ListNode<Integer> previous = newHead;
    while(current != null) {
        if(current.value == k) {
            previous.next = current.next;
            current = current.next;
        }
        else {
            previous = current;
            current = current.next;
        }
    }
   // p.next = l1 != null ? l1 : l2;
    return newHead.next;
}*/
}
