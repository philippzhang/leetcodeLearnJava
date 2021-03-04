# [1488. Avoid Flood in The City][enTitle]

**Medium**

Your country has an infinite number of lakes. Initially, all the lakes are empty, but when it rains over the  *nth*  lake, the  *nth*  lake becomes full of water. If it rains over a lake which is **full of water** , there will be a **flood** . Your goal is to avoid the flood in any lake.

Given an integer array  *rains*  where:

-  *rains[i] > 0*  means there will be rains over the  *rains[i]*  lake. 
-  *rains[i] == 0*  means there are no rains this day and you can choose **one lake**  this day and **dry it** .

Return  *an array ans*  where:

-  *ans.length == rains.length*  
-  *ans[i] == -1*  if  *rains[i] > 0* . 
-  *ans[i]*  is the lake you choose to dry in the  *ith*  day if  *rains[i] == 0* .

If there are multiple valid answers return **any**  of them. If it is impossible to avoid flood return **an empty array** .

Notice that if you chose to dry a full lake, it becomes empty, but if you chose to dry an empty lake, nothing changes. (see example 4)



**Example 1:** 

```
Input: rains = [1,2,3,4]
Output: [-1,-1,-1,-1]
Explanation: After the first day full lakes are [1]
After the second day full lakes are [1,2]
After the third day full lakes are [1,2,3]
After the fourth day full lakes are [1,2,3,4]
There's no day to dry any lake and there is no flood in any lake.

```

**Example 2:** 

```
Input: rains = [1,2,0,0,2,1]
Output: [-1,-1,2,1,-1,-1]
Explanation: After the first day full lakes are [1]
After the second day full lakes are [1,2]
After the third day, we dry lake 2. Full lakes are [1]
After the fourth day, we dry lake 1. There is no full lakes.
After the fifth day, full lakes are [2].
After the sixth day, full lakes are [1,2].
It is easy that this scenario is flood-free. [-1,-1,1,2,-1,-1] is another acceptable scenario.

```

**Example 3:** 

```
Input: rains = [1,2,0,1,2]
Output: []
Explanation: After the second day, full lakes are  [1,2]. We have to dry one lake in the third day.
After that, it will rain over lakes [1,2]. It's easy to prove that no matter which lake you choose to dry in the 3rd day, the other one will flood.

```

**Example 4:** 

```
Input: rains = [69,0,0,0,69]
Output: [-1,69,1,1,-1]
Explanation: Any solution on one of the forms [-1,69,x,y,-1], [-1,x,69,y,-1] or [-1,x,y,69,-1] is acceptable where 1 <= x,y <= 10^9

```

**Example 5:** 

```
Input: rains = [10,20,20]
Output: []
Explanation: It will rain over lake 20 two consecutive days. There is no chance to dry any lake.

```



**Constraints:** 

-  *1 <= rains.length <= 105*  
-  *0 <= rains[i] <= 109* 


# [1488. 避免洪水泛滥][cnTitle]

**中等**

你的国家有无数个湖泊，所有湖泊一开始都是空的。当第  *n*  个湖泊下雨的时候，如果第  *n*  个湖泊是空的，那么它就会装满水，否则这个湖泊会发生洪水。你的目标是避免任意一个湖泊发生洪水。

给你一个整数数组  *rains*  ，其中：

-  *rains[i] > 0*  表示第  *i*  天时，第  *rains[i]*  个湖泊会下雨。 
-  *rains[i] == 0*  表示第  *i*  天没有湖泊会下雨，你可以选择 **一个**  湖泊并 **抽干**  这个湖泊的水。

请返回一个数组 *ans*  ，满足：

-  *ans.length == rains.length*  
- 如果  *rains[i] > 0*  ，那么 *ans[i] == -1*  。 
- 如果  *rains[i] == 0*  ， *ans[i]*  是你第  *i*  天选择抽干的湖泊。

如果有多种可行解，请返回它们中的 **任意一个**  。如果没办法阻止洪水，请返回一个 **空的数组**  。

请注意，如果你选择抽干一个装满水的湖泊，它会变成一个空的湖泊。但如果你选择抽干一个空的湖泊，那么将无事发生（详情请看示例 4）。



**示例 1：** 

```
输入：rains = [1,2,3,4]
输出：[-1,-1,-1,-1]
解释：第一天后，装满水的湖泊包括 [1]
第二天后，装满水的湖泊包括 [1,2]
第三天后，装满水的湖泊包括 [1,2,3]
第四天后，装满水的湖泊包括 [1,2,3,4]
没有哪一天你可以抽干任何湖泊的水，也没有湖泊会发生洪水。

```

**示例 2：** 

```
输入：rains = [1,2,0,0,2,1]
输出：[-1,-1,2,1,-1,-1]
解释：第一天后，装满水的湖泊包括 [1]
第二天后，装满水的湖泊包括 [1,2]
第三天后，我们抽干湖泊 2 。所以剩下装满水的湖泊包括 [1]
第四天后，我们抽干湖泊 1 。所以暂时没有装满水的湖泊了。
第五天后，装满水的湖泊包括 [2]。
第六天后，装满水的湖泊包括 [1,2]。
可以看出，这个方案下不会有洪水发生。同时， [-1,-1,1,2,-1,-1] 也是另一个可行的没有洪水的方案。

```

**示例 3：** 

```
输入：rains = [1,2,0,1,2]
输出：[]
解释：第二天后，装满水的湖泊包括 [1,2]。我们可以在第三天抽干一个湖泊的水。
但第三天后，湖泊 1 和 2 都会再次下雨，所以不管我们第三天抽干哪个湖泊的水，另一个湖泊都会发生洪水。

```

**示例 4：** 

```
输入：rains = [69,0,0,0,69]
输出：[-1,69,1,1,-1]
解释：任何形如 [-1,69,x,y,-1], [-1,x,69,y,-1] 或者 [-1,x,y,69,-1] 都是可行的解，其中 1 <= x,y <= 10^9

```

**示例 5：** 

```
输入：rains = [10,20,20]
输出：[]
解释：由于湖泊 20 会连续下 2 天的雨，所以没有没有办法阻止洪水。

```



**提示：** 

-  *1 <= rains.length <= 10^5*  
-  *0 <= rains[i] <= 10^9* 




# 算法思路

# 测试用例
```
1488. Avoid Flood in The City 1488. 避免洪水泛滥 Medium
```

[enTitle]: https://leetcode.com/problems/avoid-flood-in-the-city/
[cnTitle]: https://leetcode-cn.com/problems/avoid-flood-in-the-city/
