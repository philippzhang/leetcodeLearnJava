# [1672. Richest Customer Wealth][enTitle]

**Easy**

You are given an  *m x n*  integer grid  *accounts*  where  *accounts[i][j]*  is the amount of money the  *ith*  customer has in the  *jth* ​​​​ bank. Return *the wealth that the richest customer has.* 

A customer's **wealth**  is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum **wealth** .



**Example 1:** 

```
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 62nd customer has wealth = 3 + 2 + 1 = 6Both customers are considered the richest with a wealth of 6 each, so return 6.

```

**Example 2:** 

```
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
```

**Example 3:** 

```
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17

```



**Constraints:** 

-  *m == accounts.length*  
-  *n == accounts[i].length*  
-  *1 <= m, n <= 50*  
-  *1 <= accounts[i][j] <= 100* 


# [1672. 最富有客户的资产总量][cnTitle]

**简单**

给你一个  *m x n*  的整数网格  *accounts*  ，其中  *accounts[i][j]*  是第  *i*  位客户在第  *j*  家银行托管的资产数量。返回最富有客户所拥有的 **资产总量**  。

客户的 **资产总量**  就是他们在各家银行托管的资产数量之和。最富有客户就是 **资产总量**  最大的客户。



**示例 1：** 

```
输入：accounts = [[1,2,3],[3,2,1]]
输出：6
解释：
第 1 位客户的资产总量 = 1 + 2 + 3 = 6
第 2 位客户的资产总量 = 3 + 2 + 1 = 6两位客户都是最富有的，资产总量都是 6 ，所以返回 6 。

```

**示例 2：** 

```
输入：accounts = [[1,5],[7,3],[3,5]]
输出：10
解释：
第 1 位客户的资产总量 = 6
第 2 位客户的资产总量 = 10 
第 3 位客户的资产总量 = 8
第 2 位客户是最富有的，资产总量是 10
```

**示例 3：** 

```
输入：accounts = [[2,8,7],[7,1,3],[1,9,5]]
输出：17

```



**提示：** 

-  *m == accounts.length*  
-  *n == accounts[i].length*  
-  *1 <= m, n <= 50*  
-  *1 <= accounts[i][j] <= 100* 




# 算法思路

# 测试用例
```
1672. Richest Customer Wealth 1672. 最富有客户的资产总量 Easy
```

[enTitle]: https://leetcode.com/problems/richest-customer-wealth/
[cnTitle]: https://leetcode-cn.com/problems/richest-customer-wealth/
