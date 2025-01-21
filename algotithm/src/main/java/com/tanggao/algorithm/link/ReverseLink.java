package com.tanggao.algorithm.link;

// 反转链表
public class ReverseLink {

    // 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
    // 思路： 只需更改指针的方向
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while(cur != null) {
            // 保存当前节点的下一个节点
            ListNode temp = cur.next;
            // cur的next指向pre，pre = cur， cur = temp
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
