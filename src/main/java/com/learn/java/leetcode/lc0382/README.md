# [382. Linked List Random Node][enTitle]

**Medium**

Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.

Follow up: What if the linked list is extremely large and its length is unknown to you? Could you solve this efficiently without using extra space?

Example:

```
// Init a singly linked list [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
solution.getRandom();

```




# [382. 链表随机节点][cnTitle]

**中等**

给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点**被选的概率一样** 。

**进阶:**  如果链表十分大且长度未知，如何解决这个问题？你能否使用常数级空间复杂度实现？

**示例:** 

```
// 初始化一个单链表 [1,2,3].
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
Solution solution = new Solution(head);

// getRandom()方法应随机返回1,2,3中的一个，保证每个元素被返回的概率相等。
solution.getRandom();

```




# 算法思路

# 测试用例
```
382. Linked List Random Node 382. 链表随机节点 Medium
Main.funcListTest
---
["Solution","getRandom"]
[[[1,2,3]],[]]

=[null,1]
=[null,2]
=[null,3]
```

[enTitle]: https://leetcode.com/problems/linked-list-random-node/
[cnTitle]: https://leetcode-cn.com/problems/linked-list-random-node/
