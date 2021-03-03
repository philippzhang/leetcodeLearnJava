# [886. Possible Bipartition][enTitle]

**Medium**

Given a set of  *N*  people (numbered  *1, 2, ..., N* ), we would like to split everyone into two groups of **any**  size.

Each person may dislike some other people, and they should not go into the same group.

Formally, if  *dislikes[i] = [a, b]* , it means it is not allowed to put the people numbered  *a*  and  *b*  into the same group.

Return  *true*  if and only if it is possible to split everyone into two groups in this way.












**Example 1:** 

```
Input:N = 4, dislikes = [[1,2],[1,3],[2,4]]
Output: true
Explanation: group1 [1,4], group2 [2,3]
```


**Example 2:** 

```
Input:N = 3, dislikes = [[1,2],[1,3],[2,3]]
Output: false
```


**Example 3:** 

```
Input:N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
Output: false
```









**Constraints:** 

-  *1 <= N <= 2000*  
-  *0 <= dislikes.length <= 10000*  
-  *dislikes[i].length == 2*  
-  *1 <= dislikes[i][j] <= N*  
-  *dislikes[i][0] < dislikes[i][1]*  
- There does not exist  *i != j*  for which  *dislikes[i] == dislikes[j]* .


# [886. 可能的二分法][cnTitle]

**中等**

给定一组  *N*  人（编号为  *1, 2, ..., N* ）， 我们想把每个人分进**任意** 大小的两组。

每个人都可能不喜欢其他人，那么他们不应该属于同一组。

形式上，如果  *dislikes[i] = [a, b]* ，表示不允许将编号为  *a*  和  *b*  的人归入同一组。

当可以用这种方法将所有人分进两组时，返回  *true* ；否则返回  *false* 。





**示例 1：** 

```
输入：N = 4, dislikes = [[1,2],[1,3],[2,4]]
输出：true
解释：group1 [1,4], group2 [2,3]

```

**示例 2：** 

```
输入：N = 3, dislikes = [[1,2],[1,3],[2,3]]
输出：false

```

**示例 3：** 

```
输入：N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
输出：false

```



**提示：** 

-  *1 <= N <= 2000*  
-  *0 <= dislikes.length <= 10000*  
-  *dislikes[i].length == 2*  
-  *1 <= dislikes[i][j] <= N*  
-  *dislikes[i][0] < dislikes[i][1]*  
- 对于  *dislikes[i] == dislikes[j]*  不存在  *i != j* 




# 算法思路

# 测试用例
```
886. Possible Bipartition 886. 可能的二分法 Medium
```

[enTitle]: https://leetcode.com/problems/possible-bipartition/
[cnTitle]: https://leetcode-cn.com/problems/possible-bipartition/
