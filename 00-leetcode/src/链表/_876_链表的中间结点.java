package 链表;

/**
 * Created By Halen 2020/5/11 17:30
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class _876_链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        int num = count / 2;
        while(num-->0){
            head = head.next;
        }

        return head;
    }
}
