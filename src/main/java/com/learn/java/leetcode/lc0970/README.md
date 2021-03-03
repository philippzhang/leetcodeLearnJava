# [970. Powerful Integers][enTitle]

**Medium**

Given three integers  *x* ,  *y* , and  *bound* , return  *a list of all the powerful integers that have a value less than or equal to*   *bound* .

An integer is **powerful**  if it can be represented as  *xi + yj*  for some integers  *i >= 0*  and  *j >= 0* .

You may return the answer in **any order** . In your answer, each value should occur **at most once** .



**Example 1:** 


<pre><strong>Input:</strong> x = 2, y = 3, bound = 10
<strong>Output:</strong> [2,3,4,5,7,9,10]
<strong>Explanation:</strong>
2 = 2<sup>0</sup> + 3<sup>0</sup>
3 = 2<sup>1</sup> + 3<sup>0</sup>
4 = 2<sup>0</sup> + 3<sup>1</sup>
5 = 2<sup>1</sup> + 3<sup>1</sup>
7 = 2<sup>2</sup> + 3<sup>1</sup>
9 = 2<sup>3</sup> + 3<sup>0</sup>
10 = 2<sup>0</sup> + 3<sup>2</sup>
</pre>

**Example 2:** 

```
Input: x = 3, y = 5, bound = 15
Output: [2,4,6,8,10,14]

```



**Constraints:** 

-  *1 <= x, y <= 100*  
-  *0 <= bound <= 106* 


# [970. 强整数][cnTitle]

**中等**

给定两个正整数  *x*  和  *y* ，如果某一整数等于  *x^i + y^j* ，其中整数  *i >= 0*  且  *j >= 0* ，那么我们认为该整数是一个 *强整数* 。

返回值小于或等于  *bound*  的所有 *强整数* 组成的列表。

你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。



**示例 1：** 

```
输入：x = 2, y = 3, bound = 10
输出：[2,3,4,5,7,9,10]
解释：
2 = 2^0 + 3^0
3 = 2^1 + 3^0
4 = 2^0 + 3^1
5 = 2^1 + 3^1
7 = 2^2 + 3^1
9 = 2^3 + 3^0
10 = 2^0 + 3^2

```

**示例 2：** 

```
输入：x = 3, y = 5, bound = 15
输出：[2,4,6,8,10,14]

```



**提示：** 

-  *1 <= x <= 100*  
-  *1 <= y <= 100*  
-  *0 <= bound <= 10^6* 




# 算法思路

# 测试用例
```
970. Powerful Integers 970. 强整数 Medium
```

[enTitle]: https://leetcode.com/problems/powerful-integers/
[cnTitle]: https://leetcode-cn.com/problems/powerful-integers/
