# [1735. Count Ways to Make Array With Product][enTitle]

**Hard**

You are given a 2D integer array,  *queries* . For each  *queries[i]* , where  *queries[i] = [ni, ki]* , find the number of different ways you can place positive integers into an array of size  *ni*  such that the product of the integers is  *ki* . As the number of ways may be too large, the answer to the  *ith*  query is the number of ways **modulo**   *109 + 7* .

Return  *an integer array*  *answer*  *where*  *answer.length == queries.length*  *, and*  *answer[i]*  *is the answer to the*  *ith*  *query.* 



**Example 1:** 


<pre><strong>Input:</strong> queries = [[2,6],[5,1],[73,660]]
<strong>Output:</strong> [4,1,50734910]
<strong>Explanation:</strong> Each query is independent.
[2,6]: There are 4 ways to fill an array of size 2 that multiply to 6: [1,6], [2,3], [3,2], [6,1].
[5,1]: There is 1 way to fill an array of size 5 that multiply to 1: [1,1,1,1,1].
[73,660]: There are 1050734917 ways to fill an array of size 73 that multiply to 660. 1050734917 modulo 10<sup>9</sup> + 7 = 50734910.
</pre>

**Example 2:** 

```
Input: queries = [[1,1],[2,2],[3,3],[4,4],[5,5]]
Output: [1,2,3,10,5]

```



**Constraints:** 

-  *1 <= queries.length <= 104*  
-  *1 <= ni, ki <= 104* 


# [1735. 生成乘积数组的方案数][cnTitle]

**困难**

给你一个二维整数数组  *queries*  ，其中  *queries[i] = [ni, ki]*  。第  *i*  个查询  *queries[i]*  要求构造长度为  *ni*  、每个元素都是正整数的数组，且满足所有元素的乘积为  *ki* <sub> </sub>，请你找出有多少种可行的方案。由于答案可能会很大，方案数需要对  *109 + 7*  **取余**  。

请你返回一个整数数组 *answer* ，满足 *answer.length == queries.length*  ，其中 *answer[i]* 是第 *i*  个查询的结果。



**示例 1：** 


<pre><b>输入：</b>queries = [[2,6],[5,1],[73,660]]
<b>输出：</b>[4,1,50734910]
<b>解释：</b>每个查询之间彼此独立。
[2,6]：总共有 4 种方案得到长度为 2 且乘积为 6 的数组：[1,6]，[2,3]，[3,2]，[6,1]。
[5,1]：总共有 1 种方案得到长度为 5 且乘积为 1 的数组：[1,1,1,1,1]。
[73,660]：总共有 1050734917 种方案得到长度为 73 且乘积为 660 的数组。1050734917 对 10<sup>9</sup> + 7 取余得到 50734910 。
</pre>

**示例 2 ：** 

```
输入：queries = [[1,1],[2,2],[3,3],[4,4],[5,5]]
输出：[1,2,3,10,5]

```



**提示：** 

-  *1 <= queries.length <= 104*  
-  *1 <= ni, ki <= 104* 




# 算法思路

# 测试用例
```
1735. Count Ways to Make Array With Product 1735. 生成乘积数组的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/count-ways-to-make-array-with-product/
[cnTitle]: https://leetcode-cn.com/problems/count-ways-to-make-array-with-product/
