# [430. Flatten a Multilevel Doubly Linked List][enTitle]

**Medium**

You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.

Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.



**Example:** 

```
Input:
 1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL

Output:
1-2-3-7-8-11-12-9-10-4-5-6-NULL

```



**Explanation for the above example:** 

Given the following multilevel doubly linked list:


<pre><img src="https://assets.leetcode.com/uploads/2018/10/12/multilevellinkedlist.png" style="width: 640px;"></pre>



We should return the following flattened doubly linked list:


<pre><img src="https://assets.leetcode.com/uploads/2018/10/12/multilevellinkedlistflattened.png" style="width: 1100px;"></pre>
# [430. 扁平化多级双向链表][cnTitle]

**中等**

您将获得一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。这些子列表可能有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。

扁平化列表，使所有结点出现在单级双链表中。您将获得列表第一级的头部。



**示例:** 

```
输入:
 1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL

输出:
1-2-3-7-8-11-12-9-10-4-5-6-NULL

```



**以上示例的说明:** 

给出以下多级双向链表:


<pre><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/multilevellinkedlist.png" style="width: 640px;"></pre>



我们应该返回如下所示的扁平双向链表:


<pre><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/multilevellinkedlistflattened.png" style="width: 1100px;"></pre>


# 算法思路

# 测试用例
```
430. Flatten a Multilevel Doubly Linked List 430. 扁平化多级双向链表 Medium
Solution.flatten
---
{"$id":"1","child":null,"next":{"$id":"2","child":null,"next":{"$id":"3","child":{"$id":"7","child":null,"next":{"$id":"8","child":{"$id":"11","child":null,"next":{"$id":"12","child":null,"next":null,"prev":{"$ref":"11"},"val":12},"prev":null,"val":11},"next":{"$id":"9","child":null,"next":{"$id":"10","child":null,"next":null,"prev":{"$ref":"9"},"val":10},"prev":{"$ref":"8"},"val":9},"prev":{"$ref":"7"},"val":8},"prev":null,"val":7},"next":{"$id":"4","child":null,"next":{"$id":"5","child":null,"next":{"$id":"6","child":null,"next":null,"prev":{"$ref":"5"},"val":6},"prev":{"$ref":"4"},"val":5},"prev":{"$ref":"3"},"val":4},"prev":{"$ref":"2"},"val":3},"prev":{"$ref":"1"},"val":2},"prev":null,"val":1}

={"$id":"1","child":null,"next":{"$id":"2","child":null,"next":{"$id":"3","child":null,"next":{"$id":"4","child":null,"next":{"$id":"5","child":null,"next":{"$id":"6","child":null,"next":{"$id":"7","child":null,"next":{"$id":"8","child":null,"next":{"$id":"9","child":null,"next":{"$id":"10","child":null,"next":{"$id":"11","child":null,"next":{"$id":"12","child":null,"next":null,"prev":{"$ref":"11"},"val":6},"prev":{"$ref":"10"},"val":5},"prev":{"$ref":"9"},"val":4},"prev":{"$ref":"8"},"val":10},"prev":{"$ref":"7"},"val":9},"prev":{"$ref":"6"},"val":12},"prev":{"$ref":"5"},"val":11},"prev":{"$ref":"4"},"val":8},"prev":{"$ref":"3"},"val":7},"prev":{"$ref":"2"},"val":3},"prev":{"$ref":"1"},"val":2},"prev":null,"val":1}
```

[enTitle]: https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
[cnTitle]: https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/
