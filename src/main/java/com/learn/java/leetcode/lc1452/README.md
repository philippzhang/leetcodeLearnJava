# [1452. People Whose List of Favorite Companies Is Not a Subset of Another List][enTitle]

**Medium**

Given the array  *favoriteCompanies*  where  *favoriteCompanies[i]*  is the list of favorites companies for the  *ith*  person (**indexed from 0** ).

 *Return the indices of people whose list of favorite companies is not a subset of any other list of favorites companies* . You must return the indices in increasing order.



**Example 1:** 

```
Input: favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
Output: [0,1,4] 
Explanation: 
Person with index=2 has favoriteCompanies[2]=["google","facebook"] which is a subset of favoriteCompanies[0]=["leetcode","google","facebook"] corresponding to the person with index 0. 
Person with index=3 has favoriteCompanies[3]=["google"] which is a subset of favoriteCompanies[0]=["leetcode","google","facebook"] and favoriteCompanies[1]=["google","microsoft"]. 
Other lists of favorite companies are not a subset of another list, therefore, the answer is [0,1,4].

```

**Example 2:** 

```
Input: favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
Output: [0,1] 
Explanation: In this case favoriteCompanies[2]=["facebook","google"] is a subset of favoriteCompanies[0]=["leetcode","google","facebook"], therefore, the answer is [0,1].

```

**Example 3:** 

```
Input: favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
Output: [0,1,2,3]

```



**Constraints:** 

-  *1 <= favoriteCompanies.length <= 100*  
-  *1 <= favoriteCompanies[i].length <= 500*  
-  *1 <= favoriteCompanies[i][j].length <= 20*  
- All strings in  *favoriteCompanies[i]*  are **distinct** . 
- All lists of favorite companies are **distinct** , that is, If we sort alphabetically each list then  *favoriteCompanies[i] != favoriteCompanies[j].*  
- All strings consist of lowercase English letters only.


# [1452. 收藏清单][cnTitle]

**中等**

给你一个数组  *favoriteCompanies*  ，其中  *favoriteCompanies[i]*  是第  *i*  名用户收藏的公司清单（**下标从 0 开始** ）。

请找出不是其他任何人收藏的公司清单的子集的收藏清单，并返回该清单下标 *。* 下标需要按升序排列 *。* 



**示例 1：** 

```
输入：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
输出：[0,1,4] 
解释：
favoriteCompanies[2]=["google","facebook"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集。
favoriteCompanies[3]=["google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 和 favoriteCompanies[1]=["google","microsoft"] 的子集。
其余的收藏清单均不是其他任何人收藏的公司清单的子集，因此，答案为 [0,1,4] 。

```

**示例 2：** 

```
输入：favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
输出：[0,1] 
解释：favoriteCompanies[2]=["facebook","google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集，因此，答案为 [0,1] 。

```

**示例 3：** 

```
输入：favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
输出：[0,1,2,3]

```



**提示：** 

-  *1 <= favoriteCompanies.length <= 100*  
-  *1 <= favoriteCompanies[i].length <= 500*  
-  *1 <= favoriteCompanies[i][j].length <= 20*  
-  *favoriteCompanies[i]*  中的所有字符串 **各不相同**  。 
- 用户收藏的公司清单也 **各不相同**  ，也就是说，即便我们按字母顺序排序每个清单，  *favoriteCompanies[i] != favoriteCompanies[j]* 仍然成立。 
- 所有字符串仅包含小写英文字母。




# 算法思路

# 测试用例
```
1452. People Whose List of Favorite Companies Is Not a Subset of Another List 1452. 收藏清单 Medium
```

[enTitle]: https://leetcode.com/problems/people-whose-list-of-favorite-companies-is-not-a-subset-of-another-list/
[cnTitle]: https://leetcode-cn.com/problems/people-whose-list-of-favorite-companies-is-not-a-subset-of-another-list/
