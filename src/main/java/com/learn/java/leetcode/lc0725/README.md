# [725. Split Linked List in Parts][enTitle]

**Medium**

Given a (singly) linked list with head node  *root* , write a function to split the linked list into  *k*  consecutive linked list "parts".

The length of each part should be as equal as possible: no two parts should have a size differing by more than 1. This may lead to some parts being null.

The parts should be in order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal parts occurring later.

Return a List of ListNode's representing the linked list parts that are formed.

Example 1:

```
Input: 
root = [1, 2, 3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The input and each element of the output are ListNodes, not arrays.
For example, the input root has root.val = 1, root.next.val = 2, \root.next.next.val = 3, and root.next.next.next = null.
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but it's string representation as a ListNode is [].

```



Example 2:

```
Input: 
root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
Output: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
Explanation:
The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.

```



Note:





# [725. 分隔链表][cnTitle]

**中等**

给定一个头结点为  *root*  的链表, 编写一个函数以将链表分隔为  *k*  个连续的部分。

每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。

这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。

返回一个符合上述规则的链表的列表。

举例： 1->2->3->4, k = 5 // 5 结果 [ [1], [2], [3], [4], null ]

**示例 1：** 

```
输入: 
root = [1, 2, 3], k = 5
输出: [[1],[2],[3],[],[]]
解释:
输入输出各部分都应该是链表，而不是数组。
例如, 输入的结点 root 的 val= 1, root.next.val = 2, \root.next.next.val = 3, 且 root.next.next.next = null。
第一个输出 output[0] 是 output[0].val = 1, output[0].next = null。
最后一个元素 output[4] 为 null, 它代表了最后一个部分为空链表。

```

**示例 2：** 

```
输入: 
root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
输出: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
解释:
输入被分成了几个连续的部分，并且每部分的长度相差不超过1.前面部分的长度大于等于后面部分的长度。

```



**提示:** 

-  *root*  的长度范围：  *[0, 1000]* . 
- 输入的每个节点的大小范围： *[0, 999]* . 
-  *k*  的取值范围：  *[1, 50]* .




# 算法思路

# 测试用例
```
725. Split Linked List in Parts 725. 分隔链表 Medium
Solution.splitListToParts
---
[1,2,3]
5

=[[1],[2],[3],[],[]]
---
[1,2,3,4,5,6,7,8,9,10]
3

=[[1,2,3,4],[5,6,7],[8,9,10]]
---
[]
3

=[[],[],[]]
---
[1,2,3,4,5,6,7]
3

=[[1,2,3],[4,5],[6,7]]
```

[enTitle]: https://leetcode.com/problems/split-linked-list-in-parts/
[cnTitle]: https://leetcode-cn.com/problems/split-linked-list-in-parts/
