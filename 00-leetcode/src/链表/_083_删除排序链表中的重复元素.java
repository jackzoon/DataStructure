package 链表;

/**
 * Created By Halen 2020/5/11 17:28
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class _083_删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
