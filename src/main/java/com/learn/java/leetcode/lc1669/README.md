# [1669. Merge In Between Linked Lists][enTitle]

**Medium**

You are given two linked lists:  *list1*  and  *list2*  of sizes  *n*  and  *m*  respectively.

Remove  *list1* 's nodes from the  *ath*  node to the  *bth*  node, and put  *list2*  in their place.

The blue edges and nodes in the following figure incidate the result:

![img](https://assets.leetcode.com/uploads/2020/11/05/fig1.png)

 *Build the result list and return its head.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/11/05/merge_linked_list_ex1.png)

```
Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [0,1,2,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/11/05/merge_linked_list_ex2.png)

```
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.

```



**Constraints:** 

-  *3 <= list1.length <= 104*  
-  *1 <= a <= b < list1.length - 1*  
-  *1 <= list2.length <= 104* 


# [1669. 合并两个链表][cnTitle]

**中等**

给你两个链表  *list1*  和  *list2*  ，它们包含的元素分别为  *n*  个和  *m*  个。

请你将  *list1*  中第  *a*  个节点到第  *b*  个节点删除，并将 *list2*  接在被删除节点的位置。

下图中蓝色边和节点展示了操作后的结果：

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/28/fig1.png)

请你返回结果链表的头指针。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/28/merge_linked_list_ex1.png)

```
输入：list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
输出：[0,1,2,1000000,1000001,1000002,5]
解释：我们删除 list1 中第三和第四个节点，并将 list2 接在该位置。上图中蓝色的边和节点为答案链表。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/28/merge_linked_list_ex2.png)

```
输入：list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
输出：[0,1,1000000,1000001,1000002,1000003,1000004,6]
解释：上图中蓝色的边和节点为答案链表。

```



**提示：** 

-  *3 <= list1.length <= 104*  
-  *1 <= a <= b < list1.length - 1*  
-  *1 <= list2.length <= 104* 




# 算法思路

# 测试用例
```
1669. Merge In Between Linked Lists 1669. 合并两个链表 Medium
```

[enTitle]: https://leetcode.com/problems/merge-in-between-linked-lists/
[cnTitle]: https://leetcode-cn.com/problems/merge-in-between-linked-lists/
