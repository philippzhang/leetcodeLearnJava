# [981. Time Based Key-Value Store][enTitle]

**Medium**

Create a timebased key-value store class  *TimeMap* , that supports two operations.

1.  *set(string key, string value, int timestamp)* 

- Stores the  *key*  and  *value* , along with the given  *timestamp* .

2.  *get(string key, int timestamp)* 

- Returns a value such that  *set(key, value, timestamp_prev)*  was called previously, with  *timestamp_prev <= timestamp* . 
- If there are multiple such values, it returns the one with the largest  *timestamp_prev* . 
- If there are no values, it returns the empty string ( *""* ).




**Example 1:** 

```
Input:inputs = ["TimeMap","set","get","get","set","get","get"], inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
Output: [null,null,"bar","bar",null,"bar2","bar2"]
Explanation:   
TimeMap kv;   
kv.set("foo", "bar", 1); // store the key "foo" and value "bar" along with timestamp = 1   
kv.get("foo", 1);  // output "bar"   
kv.get("foo", 3); // output "bar" since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 ie "bar"   
kv.set("foo", "bar2", 4);   
kv.get("foo", 4); // output "bar2"   
kv.get("foo", 5); //output "bar2"
```


**Example 2:** 

```
Input:inputs = ["TimeMap","set","set","get","get","get","get","get"], inputs = [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
Output: [null,null,null,"","high","high","low","low"]
```







**Note:** 

1. All key/value strings are lowercase. 
2. All key/value strings have length in the range  *[1, 100]*  
3. The  *timestamps*  for all  *TimeMap.set*  operations are strictly increasing. 
4.  *1 <= timestamp <= 10^7*  
5.  *TimeMap.set*  and  *TimeMap.get*  functions will be called a total of  *120000*  times (combined) per test case.


# [981. 基于时间的键值存储][cnTitle]

**中等**

创建一个基于时间的键值存储类  *TimeMap* ，它支持下面两个操作：

1.  *set(string key, string value, int timestamp)* 

- 存储键  *key* 、值  *value* ，以及给定的时间戳  *timestamp* 。

2.  *get(string key, int timestamp)* 

- 返回先前调用  *set(key, value, timestamp_prev)*  所存储的值，其中  *timestamp_prev <= timestamp* 。 
- 如果有多个这样的值，则返回对应最大的  *timestamp_prev*  的那个值。 
- 如果没有值，则返回空字符串（ *""* ）。



**示例 1：** 

```
输入：inputs = ["TimeMap","set","get","get","set","get","get"], inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
输出：[null,null,"bar","bar",null,"bar2","bar2"]
解释：  
TimeMap kv;   
kv.set("foo", "bar", 1); // 存储键 "foo" 和值 "bar" 以及时间戳 timestamp = 1   
kv.get("foo", 1);  // 输出 "bar"   
kv.get("foo", 3); // 输出 "bar" 因为在时间戳 3 和时间戳 2 处没有对应 "foo" 的值，所以唯一的值位于时间戳 1 处（即 "bar"）   
kv.set("foo", "bar2", 4);   
kv.get("foo", 4); // 输出 "bar2"   
kv.get("foo", 5); // 输出 "bar2"   


```

**示例 2：** 

```
输入：inputs = ["TimeMap","set","set","get","get","get","get","get"], inputs = [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
输出：[null,null,null,"","high","high","low","low"]

```



**提示：** 

1. 所有的键/值字符串都是小写的。 
2. 所有的键/值字符串长度都在  *[1, 100]*  范围内。 
3. 所有  *TimeMap.set*  操作中的时间戳  *timestamps*  都是严格递增的。 
4.  *1 <= timestamp <= 10^7*  
5.  *TimeMap.set*  和  *TimeMap.get*  函数在每个测试用例中将（组合）调用总计  *120000*  次。




# 算法思路

# 测试用例
```
981. Time Based Key-Value Store 981. 基于时间的键值存储 Medium
```

[enTitle]: https://leetcode.com/problems/time-based-key-value-store/
[cnTitle]: https://leetcode-cn.com/problems/time-based-key-value-store/
