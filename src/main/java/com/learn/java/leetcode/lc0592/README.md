# [592. Fraction Addition and Subtraction][enTitle]

**Medium**

Given a string representing an expression of fraction addition and subtraction, you need to return the calculation result in string format. The final result should be irreducible fraction. If your final result is an integer, say  *2* , you need to change it to the format of fraction that has denominator  *1* . So in this case,  *2*  should be converted to  *2/1* .

Example 1:

```
Input:"-1/2+1/2"
Output: "0/1"

```



Example 2:

```
Input:"-1/2+1/2+1/3"
Output: "1/3"

```



Example 3:

```
Input:"1/3-1/2"
Output: "-1/6"

```



Example 4:

```
Input:"5/3+1/3"
Output: "2/1"

```



Note:

1. The input string only contains  *'0'*  to  *'9'* ,  *'/'* ,  *'+'*  and  *'-'* . So does the output. 
2. Each fraction (input and output) has format  *±numerator/denominator* . If the first input fraction or the output is positive, then  *'+'*  will be omitted. 
3. The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above. 
4. The number of given fractions will be in the range [1,10]. 
5. The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.




# [592. 分数加减运算][cnTitle]

**中等**

给定一个表示分数加减运算表达式的字符串，你需要返回一个字符串形式的计算结果。 这个结果应该是不可约分的分数，即最简分数。 如果最终结果是一个整数，例如  *2* ，你需要将它转换成分数形式，其分母为  *1* 。所以在上述例子中,  *2*  应该被转换为  *2/1* 。

**示例 1:** 

```
输入:"-1/2+1/2"
输出: "0/1"

```

**示例 2:** 

```
输入:"-1/2+1/2+1/3"
输出: "1/3"

```

**示例 3:** 

```
输入:"1/3-1/2"
输出: "-1/6"

```

**示例 4:** 

```
输入:"5/3+1/3"
输出: "2/1"

```

**说明:** 

1. 输入和输出字符串只包含  *'0'*  到  *'9'*  的数字，以及  *'/'* ,  *'+'*  和  *'-'* 。  
2. 输入和输出分数格式均为  *±分子/分母* 。如果输入的第一个分数或者输出的分数是正数，则  *'+'*  会被省略掉。 
3. 输入只包含合法的**最简分数** ，每个分数的**分子** 与**分母** 的范围是 [1,10]。 如果分母是1，意味着这个分数实际上是一个整数。 
4. 输入的分数个数范围是 [1,10]。 
5. **最终结果** 的分子与分母保证是 32 位整数范围内的有效整数。




# 算法思路

# 测试用例
```
592. Fraction Addition and Subtraction 592. 分数加减运算 Medium
```

[enTitle]: https://leetcode.com/problems/fraction-addition-and-subtraction/
[cnTitle]: https://leetcode-cn.com/problems/fraction-addition-and-subtraction/
