# [1029. Two City Scheduling][enTitle]

**Medium**

A company is planning to interview  *2n*  people. Given the array  *costs*  where  *costs[i] = [aCosti, bCosti]* , the cost of flying the  *ith*  person to city  *a*  is  *aCosti* , and the cost of flying the  *ith*  person to city  *b*  is  *bCosti* .

Return  *the minimum cost to fly every person to a city*  such that exactly  *n*  people arrive in each city.



**Example 1:** 

```
Input: costs = [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation:
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.

```

**Example 2:** 

```
Input: costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
Output: 1859

```

**Example 3:** 

```
Input: costs = [[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]
Output: 3086

```



**Constraints:** 

-  *2 * n == costs.length*  
-  *2 <= costs.length <= 100*  
-  *costs.length*  is even. 
-  *1 <= aCosti, bCosti <= 1000* 


# [1029. 两地调度][cnTitle]

**中等**

公司计划面试  *2N*  人。第  *i*  人飞往  *A*  市的费用为  *costs[i][0]* ，飞往  *B*  市的费用为  *costs[i][1]* 。

返回将每个人都飞到某座城市的最低费用，要求每个城市都有  *N*  人抵达**。** 



**示例：** 

```
输入：[[10,20],[30,200],[400,50],[30,20]]
输出：110
解释：
第一个人去 A 市，费用为 10。
第二个人去 A 市，费用为 30。
第三个人去 B 市，费用为 50。
第四个人去 B 市，费用为 20。

最低总费用为 10 + 30 + 50 + 20 = 110，每个城市都有一半的人在面试。

```



**提示：** 

1.  *1 <= costs.length <= 100*  
2.  *costs.length*  为偶数 
3.  *1 <= costs[i][0], costs[i][1] <= 1000* 




# 算法思路

# 测试用例
```
1029. Two City Scheduling 1029. 两地调度 Medium
```

[enTitle]: https://leetcode.com/problems/two-city-scheduling/
[cnTitle]: https://leetcode-cn.com/problems/two-city-scheduling/
