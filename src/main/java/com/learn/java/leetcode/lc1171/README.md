# [1171. Remove Zero Sum Consecutive Nodes from Linked List][enTitle]

**Medium**

Given the  *head*  of a linked list, we repeatedly delete consecutive sequences of nodes that sum to  *0*  until there are no such sequences.

After doing so, return the head of the final linked list. You may return any such answer.



(Note that in the examples below, all sequences are serializations of  *ListNode*  objects.)

**Example 1:** 

```
Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.

```

**Example 2:** 

```
Input: head = [1,2,3,-3,4]
Output: [1,2,4]

```

**Example 3:** 

```
Input: head = [1,2,3,-3,-2]
Output: [1]

```



**Constraints:** 

- The given linked list will contain between  *1*  and  *1000*  nodes. 
- Each node in the linked list has  *-1000 <= node.val <= 1000* .


# [1171. 从链表中删去总和值为零的连续节点][cnTitle]

**中等**

给你一个链表的头节点  *head* ，请你编写代码，反复删去链表中由 **总和**  值为  *0*  的连续节点组成的序列，直到不存在这样的序列为止。

删除完毕后，请你返回最终结果链表的头节点。



你可以返回任何满足题目要求的答案。

（注意，下面示例中的所有序列，都是对  *ListNode*  对象序列化的表示。）

**示例 1：** 

```
输入：head = [1,2,-3,3,1]
输出：[3,1]
提示：答案 [1,2,1] 也是正确的。

```

**示例 2：** 

```
输入：head = [1,2,3,-3,4]
输出：[1,2,4]

```

**示例 3：** 

```
输入：head = [1,2,3,-3,-2]
输出：[1]

```



**提示：** 

- 给你的链表中可能有  *1*  到  *1000*  个节点。 
- 对于链表中的每个节点，节点的值： *-1000 <= node.val <= 1000* .




# 算法思路

# 测试用例
```
1171. Remove Zero Sum Consecutive Nodes from Linked List 1171. 从链表中删去总和值为零的连续节点 Medium
```

[enTitle]: https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
[cnTitle]: https://leetcode-cn.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
