# [1575. Count All Possible Routes][enTitle]

**Hard**

You are given an array of **distinct**  positive integers locations where  *locations[i]*  represents the position of city  *i* . You are also given integers  *start* ,  *finish*  and  *fuel*  representing the starting city, ending city, and the initial amount of fuel you have, respectively.

At each step, if you are at city  *i* , you can pick any city  *j*  such that  *j != i*  and  *0 <= j < locations.length*  and move to city  *j* . Moving from city  *i*  to city  *j*  reduces the amount of fuel you have by  *|locations[i] - locations[j]|* . Please notice that  *|x|*  denotes the absolute value of  *x* .

Notice that  *fuel*  **cannot**  become negative at any point in time, and that you are **allowed**  to visit any city more than once (including  *start*  and  *finish* ).

Return  *the count of all possible routes from*  *start*   *to*   *finish* .

Since the answer may be too large, return it modulo  *10^9 + 7* .



**Example 1:** 

```
Input: locations = [2,3,6,8,4], start = 1, finish = 3, fuel = 5
Output: 4
Explanation: The following are all possible routes, each uses 5 units of fuel:
1 -> 3
1 -> 2 -> 3
1 -> 4 -> 3
1 -> 4 -> 2 -> 3

```

**Example 2:** 

```
Input: locations = [4,3,1], start = 1, finish = 0, fuel = 6
Output: 5
Explanation:The following are all possible routes:
1 -> 0, used fuel = 1
1 -> 2 -> 0, used fuel = 5
1 -> 2 -> 1 -> 0, used fuel = 5
1 -> 0 -> 1 -> 0, used fuel = 3
1 -> 0 -> 1 -> 0 -> 1 -> 0, used fuel = 5

```

**Example 3:** 

```
Input: locations = [5,2,1], start = 0, finish = 2, fuel = 3
Output: 0
Explanation:It's impossible to get from 0 to 2 using only 3 units of fuel since the shortest route needs 4 units of fuel.
```

**Example 4:** 

```
Input: locations = [2,1,5], start = 0, finish = 0, fuel = 3
Output: 2
Explanation: There are two possible routes, 0 and 0 -> 1 -> 0.
```

**Example 5:** 

```
Input: locations = [1,2,3], start = 0, finish = 2, fuel = 40
Output: 615088286
Explanation:The total number of possible routes is 2615088300. Taking this number modulo 10^9 + 7 gives us 615088286.

```



**Constraints:** 

-  *2 <= locations.length <= 100*  
-  *1 <= locations[i] <= 10^9*  
- All integers in  *locations*  are **distinct** . 
-  *0 <= start, finish < locations.length*  
-  *1 <= fuel <= 200* 


# [1575. 统计所有可行路径][cnTitle]

**困难**

给你一个 **互不相同**  的整数数组，其中  *locations[i]*  表示第  *i*  个城市的位置。同时给你  *start* ， *finish*  和  *fuel*  分别表示出发城市、目的地城市和你初始拥有的汽油总量

每一步中，如果你在城市  *i*  ，你可以选择任意一个城市  *j*  ，满足  *j != i*  且  *0 <= j < locations.length*  ，并移动到城市  *j*  。从城市  *i*  移动到  *j*  消耗的汽油量为  *|locations[i] - locations[j]|* ， *|x|*  表示  *x*  的绝对值。

请注意，  *fuel*  任何时刻都 **不能**  为负，且你 **可以**  经过任意城市超过一次（包括  *start*  和  *finish*  ）。

请你返回从 *start*  到  *finish*  所有可能路径的数目。

由于答案可能很大， 请将它对  *10^9 + 7*  取余后返回。



**示例 1：** 

```
输入：locations = [2,3,6,8,4], start = 1, finish = 3, fuel = 5
输出：4
解释：以下为所有可能路径，每一条都用了 5 单位的汽油：
1 -> 3
1 -> 2 -> 3
1 -> 4 -> 3
1 -> 4 -> 2 -> 3

```

**示例 2：** 

```
输入：locations = [4,3,1], start = 1, finish = 0, fuel = 6
输出：5
解释：以下为所有可能的路径：
1 -> 0，使用汽油量为 fuel = 1
1 -> 2 -> 0，使用汽油量为 fuel = 5
1 -> 2 -> 1 -> 0，使用汽油量为 fuel = 5
1 -> 0 -> 1 -> 0，使用汽油量为 fuel = 3
1 -> 0 -> 1 -> 0 -> 1 -> 0，使用汽油量为 fuel = 5

```

**示例 3：** 

```
输入：locations = [5,2,1], start = 0, finish = 2, fuel = 3
输出：0
解释：没有办法只用 3 单位的汽油从 0 到达 2 。因为最短路径需要 4 单位的汽油。
```

**示例 4 ：** 

```
输入：locations = [2,1,5], start = 0, finish = 0, fuel = 3
输出：2
解释：总共有两条可行路径，0 和 0 -> 1 -> 0 。
```

**示例 5：** 

```
输入：locations = [1,2,3], start = 0, finish = 2, fuel = 40
输出：615088286
解释：路径总数为 2615088300 。将结果对 10^9 + 7 取余，得到 615088286 。

```



**提示：** 

-  *2 <= locations.length <= 100*  
-  *1 <= locations[i] <= 10^9*  
- 所有  *locations*  中的整数 **互不相同**  。 
-  *0 <= start, finish < locations.length*  
-  *1 <= fuel <= 200* 




# 算法思路

# 测试用例
```
1575. Count All Possible Routes 1575. 统计所有可行路径 Hard
```

[enTitle]: https://leetcode.com/problems/count-all-possible-routes/
[cnTitle]: https://leetcode-cn.com/problems/count-all-possible-routes/
