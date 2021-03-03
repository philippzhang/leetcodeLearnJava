# [951. Flip Equivalent Binary Trees][enTitle]

**Medium**

For a binary tree **T** , we can define a **flip operation**  as follows: choose any node, and swap the left and right child subtrees.

A binary tree **X**  is  *flip equivalent*  to a binary tree **Y**  if and only if we can make **X**  equal to **Y**  after some number of flip operations.

Given the roots of two binary trees  *root1*  and  *root2* , return  *true*  if the two trees are flip equivelent or  *false*  otherwise.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2018/11/29/tree_ex.png)

```
Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
Output: true
Explanation:We flipped at nodes with values 1, 3, and 5.

```

**Example 2:** 

```
Input: root1 = [], root2 = []
Output: true

```

**Example 3:** 

```
Input: root1 = [], root2 = [1]
Output: false

```

**Example 4:** 

```
Input: root1 = [0,null,1], root2 = []
Output: false

```

**Example 5:** 

```
Input: root1 = [0,null,1], root2 = [0,1]
Output: true

```



**Constraints:** 

- The number of nodes in each tree is in the range  *[0, 100]* . 
- Each tree will have **unique node values**  in the range  *[0, 99]* .


# [951. 翻转等价二叉树][cnTitle]

**中等**

我们可以为二叉树 T 定义一个翻转操作，如下所示：选择任意节点，然后交换它的左子树和右子树。

只要经过一定次数的翻转操作后，能使 X 等于 Y，我们就称二叉树 X  *翻转等价* 于二叉树 Y。

编写一个判断两个二叉树是否是 *翻转等价* 的函数。这些树由根节点  *root1*  和  *root2*  给出。



**示例：** 


<pre><strong>输入：</strong>root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
<strong>输出：</strong>true
<strong>解释：</strong>我们翻转值为 1，3 以及 5 的三个节点。
<img style="height: 220px; width: 500px;" src="https://assets.leetcode.com/uploads/2018/11/29/tree_ex.png" alt="Flipped Trees Diagram">
</pre>



**提示：** 

1. 每棵树最多有  *100*  个节点。 
2. 每棵树中的每个值都是唯一的、在  *[0, 99]*  范围内的整数。






# 算法思路

# 测试用例
```
951. Flip Equivalent Binary Trees 951. 翻转等价二叉树 Medium
```

[enTitle]: https://leetcode.com/problems/flip-equivalent-binary-trees/
[cnTitle]: https://leetcode-cn.com/problems/flip-equivalent-binary-trees/
