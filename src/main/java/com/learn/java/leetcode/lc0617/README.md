# [617. Merge Two Binary Trees][enTitle]

**Easy**

Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:

```
Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7

```



Note: The merging process must start from the root nodes of both trees.
# [617. 合并二叉树][cnTitle]

**简单**

给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则**不为** NULL 的节点将直接作为新二叉树的节点。

**示例 1:** 

```
输入: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
输出: 
合并后的树:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7

```

**注意:**  合并必须从两个树的根节点开始。


# 算法思路

# 测试用例
```
617. Merge Two Binary Trees 617. 合并二叉树 Easy
Solution.mergeTrees
---
[1,3,2,5]
[2,1,3,null,4,null,7]

=[3,4,5,5,4,null,7]
```

[enTitle]: https://leetcode.com/problems/merge-two-binary-trees/
[cnTitle]: https://leetcode-cn.com/problems/merge-two-binary-trees/


