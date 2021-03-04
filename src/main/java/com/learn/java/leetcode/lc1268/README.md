# [1268. Search Suggestions System][enTitle]

**Medium**

Given an array of strings  *products*  and a string  *searchWord* . We want to design a system that suggests at most three product names from  *products*  after each character of  *searchWord*  is typed. Suggested products should have common prefix with the searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.

Return  *list of lists*  of the suggested  *products*  after each character of  *searchWord*  is typed.



**Example 1:** 

```
Input: products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
Output: [
["mobile","moneypot","monitor"],
["mobile","moneypot","monitor"],
["mouse","mousepad"],
["mouse","mousepad"],
["mouse","mousepad"]
]
Explanation: products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"]
After typing m and mo all products match and we show user ["mobile","moneypot","monitor"]
After typing mou, mous and mouse the system suggests ["mouse","mousepad"]

```

**Example 2:** 

```
Input: products = ["havana"], searchWord = "havana"
Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]

```

**Example 3:** 

```
Input: products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]

```

**Example 4:** 

```
Input: products = ["havana"], searchWord = "tatiana"
Output: [[],[],[],[],[],[],[]]

```



**Constraints:** 

-  *1 <= products.length <= 1000*  
- There are no repeated elements in  *products* . 
-  *1 <= Σ products[i].length <= 2 * 10^4*  
- All characters of  *products[i]*  are lower-case English letters. 
-  *1 <= searchWord.length <= 1000*  
- All characters of  *searchWord*  are lower-case English letters.


# [1268. 搜索推荐系统][cnTitle]

**中等**

给你一个产品数组  *products*  和一个字符串  *searchWord*  ， *products*  数组中每个产品都是一个字符串。

请你设计一个推荐系统，在依次输入单词  *searchWord*  的每一个字母后，推荐  *products*  数组中前缀与  *searchWord*  相同的最多三个产品。如果前缀相同的可推荐产品超过三个，请按字典序返回最小的三个。

请你以二维列表的形式，返回在输入  *searchWord*  每个字母后相应的推荐产品的列表。



**示例 1：** 

```
输入：products = ["mobile","mouse","moneypot","monitor","mousepad"], searchWord = "mouse"
输出：[
["mobile","moneypot","monitor"],
["mobile","moneypot","monitor"],
["mouse","mousepad"],
["mouse","mousepad"],
["mouse","mousepad"]
]
解释：按字典序排序后的产品列表是 ["mobile","moneypot","monitor","mouse","mousepad"]
输入 m 和 mo，由于所有产品的前缀都相同，所以系统返回字典序最小的三个产品 ["mobile","moneypot","monitor"]
输入 mou， mous 和 mouse 后系统都返回 ["mouse","mousepad"]

```

**示例 2：** 

```
输入：products = ["havana"], searchWord = "havana"
输出：[["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]]

```

**示例 3：** 

```
输入：products = ["bags","baggage","banner","box","cloths"], searchWord = "bags"
输出：[["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]]

```

**示例 4：** 

```
输入：products = ["havana"], searchWord = "tatiana"
输出：[[],[],[],[],[],[],[]]

```



**提示：** 

-  *1 <= products.length <= 1000*  
-  *1 <= Σ products[i].length <= 2 * 10^4*  
-  *products[i]*  中所有的字符都是小写英文字母。 
-  *1 <= searchWord.length <= 1000*  
-  *searchWord*  中所有字符都是小写英文字母。




# 算法思路

# 测试用例
```
1268. Search Suggestions System 1268. 搜索推荐系统 Medium
```

[enTitle]: https://leetcode.com/problems/search-suggestions-system/
[cnTitle]: https://leetcode-cn.com/problems/search-suggestions-system/
