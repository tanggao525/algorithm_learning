package com.tanggao.algorithm.link;

// 链表相交
public class ListIntersection {

    // 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null

    // 思路：先找出两个链表的差距，再进行比较
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getListLength(headA);
        int len2 = getListLength(headB);

        // 设置长短链表
        ListNode longLink;
        ListNode shortLink;
        if (len1 >= len2) {
            longLink = headA;
            shortLink = headB;
        } else {
            longLink = headB;
            shortLink = headA;
        }

        // 将长链表移动到与短链表相同的位置
        for (int i = 0; i < Math.abs(len1 - len2); i++) {
            longLink = longLink.next;
        }

        // 比较是否有相等的节点
        while(longLink != null && shortLink != null) {
            if (longLink == shortLink) {
                return longLink;
            } else {
                longLink = longLink.next;
                shortLink = shortLink.next;
            }
        }
        return null;
    }

    private int getListLength(ListNode headB) {
        int n = 0;
        while (headB != null) {
            n++;
            headB = headB.next;
        }
        return n;
    }
}
