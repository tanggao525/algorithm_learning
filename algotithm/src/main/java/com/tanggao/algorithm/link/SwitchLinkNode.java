package com.tanggao.algorithm.link;

// 两两交换链表中的节点
public class SwitchLinkNode {

    //给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。

    // 虚拟头节点，操作会方便很多
    public ListNode swapPairs(ListNode head) {
        // 虚拟头节点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        // 当前节点
        ListNode cur = dummyHead;

        while(cur.next != null && cur.next.next != null) {
            ListNode firstNode = cur.next;
            ListNode secondNode = cur.next.next;
            ListNode tempNode = cur.next.next.next;

            // 交换first和second
            cur.next = secondNode;
            secondNode.next = firstNode;
            firstNode.next = tempNode;

            cur = firstNode;
        }
        return dummyHead.next;
    }
}
