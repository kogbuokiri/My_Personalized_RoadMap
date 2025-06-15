package Two_Pointers;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode nodeTest = head;
        System.out.println("Original List");
        for(int i = 1; i < 5; i++){
            System.out.println(nodeTest.val);
            nodeTest.next = new ListNode(i);
            nodeTest = nodeTest.next;
        }
        System.out.println(nodeTest.val);
        System.out.println("------------------------");
        System.out.println("New List w/ nth Node removed");
        ListNode returnListNode = Solution.removeNthLastNode(head, 2);
        while(returnListNode!=null){
            System.out.println(returnListNode.val);
            returnListNode = returnListNode.next;
        }
        


    }
}
