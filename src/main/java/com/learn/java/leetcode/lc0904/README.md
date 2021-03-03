# [904. Fruit Into Baskets][enTitle]

**Medium**

In a row of trees, the  *i* -th tree produces fruit with type  *tree[i]* .

You **start at any tree of your choice** , then repeatedly perform the following steps:

1. Add one piece of fruit from this tree to your baskets. If you cannot, stop. 
2. Move to the next tree to the right of the current tree. If there is no tree to the right, stop.

Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?



**Example 1:** 

```
Input:[1,2,1]
Output: 3
Explanation: We can collect [1,2,1].
```


**Example 2:** 

```
Input:[0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].
```


**Example 3:** 

```
Input:[1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].
```


**Example 4:** 

```
Input:[3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.
```









**Note:** 

1.  *1 <= tree.length <= 40000*  
2.  *0 <= tree[i] < tree.length* 


# [904. 水果成篮][cnTitle]

**中等**

在一排树中，第  *i*  棵树产生  *tree[i]*  型的水果。 你可以**从你选择的任何树开始** ，然后重复执行以下步骤：

1. 把这棵树上的水果放进你的篮子里。如果你做不到，就停下来。 
2. 移动到当前树右侧的下一棵树。如果右边没有树，就停下来。

请注意，在选择一颗树后，你没有任何选择：你必须执行步骤 1，然后执行步骤 2，然后返回步骤 1，然后执行步骤 2，依此类推，直至停止。

你有两个篮子，每个篮子可以携带任何数量的水果，但你希望每个篮子只携带一种类型的水果。

用这个程序你能收集的水果树的最大总量是多少？



**示例 1：** 

```
输入：[1,2,1]
输出：3
解释：我们可以收集 [1,2,1]。

```

**示例 2：** 

```
输入：[0,1,2,2]
输出：3
解释：我们可以收集 [1,2,2]
如果我们从第一棵树开始，我们将只能收集到 [0, 1]。

```

**示例 3：** 

```
输入：[1,2,3,2,2]
输出：4
解释：我们可以收集 [2,3,2,2]
如果我们从第一棵树开始，我们将只能收集到 [1, 2]。

```

**示例 4：** 

```
输入：[3,3,3,1,2,1,1,2,3,3,4]
输出：5
解释：我们可以收集 [1,2,1,1,2]
如果我们从第一棵树或第八棵树开始，我们将只能收集到 4 棵水果树。

```



**提示：** 

-  *1 <= tree.length <= 40000*  
-  *0 <= tree[i] < tree.length* 




# 算法思路

# 测试用例
```
904. Fruit Into Baskets 904. 水果成篮 Medium
```

[enTitle]: https://leetcode.com/problems/fruit-into-baskets/
[cnTitle]: https://leetcode-cn.com/problems/fruit-into-baskets/
