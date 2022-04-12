import java.util.ArrayList;
import java.util.List;

public class LinkedList{
    public static void main(String args[]){
    System.out.println(threePalindromicSubstrings("radarnoonlevel"));
    }
    public static List<String> threePalindromicSubstrings(String word) {
        int n = word.length();
        List<String> res = new ArrayList<>();
        
        boolean isPal[][] = new boolean[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(j) == word.charAt(i)){
                    isPal[j][i] = true;
                }
                else
                isPal[j][i] = false;
        
            }
            
        }
        List<Integer> last = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isPal[i][n-1] == true)
                last.add(i);
        }
        
        for(int l:last){
            for(int i=0;i<l;i++){
                if(isPal[0][i] && isPal[i+1][l-1]){
                    res.add(word.substring(0,i+1));
                    res.add(word.substring(i+1,l));
                    res.add(word.substring(l));
                    return res;
                }
            }
        }
        
        res.add("Impossible");
        return res;
        
        
        
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
