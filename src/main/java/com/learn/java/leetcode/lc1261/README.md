# [1261. Find Elements in a Contaminated Binary Tree][enTitle]

**Medium**

Given a binary tree with the following rules:

1.  *root.val == 0*  
2. If  *treeNode.val == x*  and  *treeNode.left != null* , then  *treeNode.left.val == 2 * x + 1*  
3. If  *treeNode.val == x*  and  *treeNode.right != null* , then  *treeNode.right.val == 2 * x + 2* 

Now the binary tree is contaminated, which means all  *treeNode.val*  have been changed to  *-1* .

You need to first recover the binary tree and then implement the  *FindElements*  class:

-  *FindElements(TreeNode* root)*  Initializes the object with a contamined binary tree, you need to recover it first. 
-  *bool find(int target)*  Return if the  *target*  value exists in the recovered binary tree.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/11/06/untitled-diagram-4-1.jpg)

```
Input
["FindElements","find","find"]
[[[-1,null,-1]],[1],[2]]
Output
[null,false,true]
Explanation
FindElements findElements = new FindElements([-1,null,-1]); 
findElements.find(1); // return False 
findElements.find(2); // return True 
```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2019/11/06/untitled-diagram-4.jpg)

```
Input
["FindElements","find","find","find"]
[[[-1,-1,-1,-1,-1]],[1],[3],[5]]
Output
[null,true,true,false]
Explanation
FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
findElements.find(1); // return True
findElements.find(3); // return True
findElements.find(5); // return False
```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2019/11/07/untitled-diagram-4-1-1.jpg)

```
Input
["FindElements","find","find","find","find"]
[[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
Output
[null,true,false,false,true]
Explanation
FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
findElements.find(2); // return True
findElements.find(3); // return False
findElements.find(4); // return False
findElements.find(5); // return True

```



**Constraints:** 

-  *TreeNode.val == -1*  
- The height of the binary tree is less than or equal to  *20*  
- The total number of nodes is between  *[1, 10^4]*  
- Total calls of  *find()*  is between  *[1, 10^4]*  
-  *0 <= target <= 10^6* 


# [1261. 在受污染的二叉树中查找元素][cnTitle]

**中等**

给出一个满足下述规则的二叉树：

1.  *root.val == 0*  
2. 如果  *treeNode.val == x*  且  *treeNode.left != null* ，那么  *treeNode.left.val == 2 * x + 1*  
3. 如果  *treeNode.val == x*  且  *treeNode.right != null* ，那么  *treeNode.right.val == 2 * x + 2* 

现在这个二叉树受到「污染」，所有的  *treeNode.val*  都变成了  *-1* 。

请你先还原二叉树，然后实现  *FindElements*  类：

-  *FindElements(TreeNode* root)*  用受污染的二叉树初始化对象，你需要先把它还原。 
-  *bool find(int target)*  判断目标值  *target*  是否存在于还原后的二叉树中并返回结果。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/16/untitled-diagram-4-1.jpg)

```
输入：
["FindElements","find","find"]
[[[-1,null,-1]],[1],[2]]
输出：
[null,false,true]
解释：
FindElements findElements = new FindElements([-1,null,-1]); 
findElements.find(1); // return False 
findElements.find(2); // return True 
```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/16/untitled-diagram-4.jpg)

```
输入：
["FindElements","find","find","find"]
[[[-1,-1,-1,-1,-1]],[1],[3],[5]]
输出：
[null,true,true,false]
解释：
FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
findElements.find(1); // return True
findElements.find(3); // return True
findElements.find(5); // return False
```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/16/untitled-diagram-4-1-1.jpg)

```
输入：
["FindElements","find","find","find","find"]
[[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
输出：
[null,true,false,false,true]
解释：
FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
findElements.find(2); // return True
findElements.find(3); // return False
findElements.find(4); // return False
findElements.find(5); // return True

```



**提示：** 

-  *TreeNode.val == -1*  
- 二叉树的高度不超过  *20*  
- 节点的总数在  *[1, 10^4]*  之间 
- 调用  *find()*  的总次数在  *[1, 10^4]*  之间 
-  *0 <= target <= 10^6* 




# 算法思路

# 测试用例
```
1261. Find Elements in a Contaminated Binary Tree 1261. 在受污染的二叉树中查找元素 Medium
```

[enTitle]: https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
[cnTitle]: https://leetcode-cn.com/problems/find-elements-in-a-contaminated-binary-tree/
