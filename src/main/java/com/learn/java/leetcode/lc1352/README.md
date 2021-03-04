# [1352. Product of the Last K Numbers][enTitle]

**Medium**

Implement the class  *ProductOfNumbers*  that supports two methods:

1. *add(int num)* 

- Adds the number  *num*  to the back of the current list of numbers.

2. *getProduct(int k)* 

- Returns the product of the last  *k*  numbers in the current list. 
- You can assume that always the current list has **at least**   *k*  numbers.

At any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing.



**Example:** 

```
Input
["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]
[[],[3],[0],[2],[5],[4],[2],[3],[4],[8],[2]]

Output
[null,null,null,null,null,null,20,40,0,null,32]

Explanation
ProductOfNumbers productOfNumbers = new ProductOfNumbers();
productOfNumbers.add(3);        // [3]
productOfNumbers.add(0);        // [3,0]
productOfNumbers.add(2);        // [3,0,2]
productOfNumbers.add(5);        // [3,0,2,5]
productOfNumbers.add(4);        // [3,0,2,5,4]
productOfNumbers.getProduct(2); // return 20. The product of the last 2 numbers is 5 * 4 = 20
productOfNumbers.getProduct(3); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
productOfNumbers.getProduct(4); // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
productOfNumbers.add(8);        // [3,0,2,5,4,8]
productOfNumbers.getProduct(2); // return 32. The product of the last 2 numbers is 4 * 8 = 32 

```



**Constraints:** 

- There will be at most  *40000*  operations considering both  *add*  and  *getProduct* . 
-  *0 <= num <= 100*  
-  *1 <= k <= 40000* 


# [1352. 最后 K 个数的乘积][cnTitle]

**中等**

请你实现一个「数字乘积类」 *ProductOfNumbers* ，要求支持下述两种方法：

1. *add(int num)* 

- 将数字  *num*  添加到当前数字列表的最后面。

2. *getProduct(int k)* 

- 返回当前数字列表中，最后  *k*  个数字的乘积。 
- 你可以假设当前列表中始终 **至少**  包含  *k*  个数字。

题目数据保证：任何时候，任一连续数字序列的乘积都在 32-bit 整数范围内，不会溢出。



**示例：** 

```
输入：
["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]
[[],[3],[0],[2],[5],[4],[2],[3],[4],[8],[2]]

输出：
[null,null,null,null,null,null,20,40,0,null,32]

解释：
ProductOfNumbers productOfNumbers = new ProductOfNumbers();
productOfNumbers.add(3);        // [3]
productOfNumbers.add(0);        // [3,0]
productOfNumbers.add(2);        // [3,0,2]
productOfNumbers.add(5);        // [3,0,2,5]
productOfNumbers.add(4);        // [3,0,2,5,4]
productOfNumbers.getProduct(2); // 返回 20 。最后 2 个数字的乘积是 5 * 4 = 20
productOfNumbers.getProduct(3); // 返回 40 。最后 3 个数字的乘积是 2 * 5 * 4 = 40
productOfNumbers.getProduct(4); // 返回  0 。最后 4 个数字的乘积是 0 * 2 * 5 * 4 = 0
productOfNumbers.add(8);        // [3,0,2,5,4,8]
productOfNumbers.getProduct(2); // 返回 32 。最后 2 个数字的乘积是 4 * 8 = 32 

```



**提示：** 

-  *add*  和  *getProduct*  两种操作加起来总共不会超过  *40000*  次。 
-  *0 <= num <= 100*  
-  *1 <= k <= 40000* 




# 算法思路

# 测试用例
```
1352. Product of the Last K Numbers 1352. 最后 K 个数的乘积 Medium
```

[enTitle]: https://leetcode.com/problems/product-of-the-last-k-numbers/
[cnTitle]: https://leetcode-cn.com/problems/product-of-the-last-k-numbers/
