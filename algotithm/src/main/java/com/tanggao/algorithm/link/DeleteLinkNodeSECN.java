package com.tanggao.algorithm.link;

// 删除链表的倒数第N个节点
public class DeleteLinkNodeSECN {

    // 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。

    // 思路：双指针
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //新建一个虚拟头节点指向head
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        //快慢指针指向虚拟头节点
        ListNode fastIndex = dummyNode;
        ListNode slowIndex = dummyNode;

        // 快指针多走 n+1 步
        for (int i = 0; i <= n; i++) {
            fastIndex = fastIndex.next;
        }
        while (fastIndex != null) {
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }

        slowIndex.next = slowIndex.next.next;
        return dummyNode.next;
    }
}
