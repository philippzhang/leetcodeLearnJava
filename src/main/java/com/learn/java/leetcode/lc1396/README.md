# [1396. Design Underground System][enTitle]

**Medium**

Implement the  *UndergroundSystem*  class:

-  *void checkIn(int id, string stationName, int t)*  
 <ul> 
  - A customer with a card id equal to  *id* , gets in the station  *stationName*  at time  *t* . 
  - A customer can only be checked into one place at a time. 
 </ul>  
-  *void checkOut(int id, string stationName, int t)*  
 <ul> 
  - A customer with a card id equal to  *id* , gets out from the station  *stationName*  at time  *t* . 
 </ul>  
-  *double getAverageTime(string startStation, string endStation)*  
 <ul> 
  - Returns the average time to travel between the  *startStation*  and the  *endStation* . 
  - The average time is computed from all the previous traveling from  *startStation*  to  *endStation*  that happened **directly** . 
  - Call to  *getAverageTime*  is always valid. 
 </ul> 

You can assume all calls to  *checkIn*  and  *checkOut*  methods are consistent. If a customer gets in at time **t1**  at some station, they get out at time **t2**  with **t2 > t1** . All events happen in chronological order.



**Example 1:** 

```
Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]

Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]

Explanation
UndergroundSystem undergroundSystem = new UndergroundSystem();
undergroundSystem.checkIn(45, "Leyton", 3);
undergroundSystem.checkIn(32, "Paradise", 8);
undergroundSystem.checkIn(27, "Leyton", 10);
undergroundSystem.checkOut(45, "Waterloo", 15);
undergroundSystem.checkOut(27, "Waterloo", 20);
undergroundSystem.checkOut(32, "Cambridge", 22);
undergroundSystem.getAverageTime("Paradise", "Cambridge");       // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
undergroundSystem.checkIn(10, "Leyton", 24);
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 11.00000
undergroundSystem.checkOut(10, "Waterloo", 38);
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // return 12.00000

```

**Example 2:** 

```
Input
["UndergroundSystem","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime","checkIn","checkOut","getAverageTime"]
[[],[10,"Leyton",3],[10,"Paradise",8],["Leyton","Paradise"],[5,"Leyton",10],[5,"Paradise",16],["Leyton","Paradise"],[2,"Leyton",21],[2,"Paradise",30],["Leyton","Paradise"]]

Output
[null,null,null,5.00000,null,null,5.50000,null,null,6.66667]

Explanation
UndergroundSystem undergroundSystem = new UndergroundSystem();
undergroundSystem.checkIn(10, "Leyton", 3);
undergroundSystem.checkOut(10, "Paradise", 8);
undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.00000
undergroundSystem.checkIn(5, "Leyton", 10);
undergroundSystem.checkOut(5, "Paradise", 16);
undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 5.50000
undergroundSystem.checkIn(2, "Leyton", 21);
undergroundSystem.checkOut(2, "Paradise", 30);
undergroundSystem.getAverageTime("Leyton", "Paradise"); // return 6.66667

```



**Constraints:** 

- There will be at most  *20000*  operations. 
-  *1 <= id, t <= 106*  
- All strings consist of uppercase and lowercase English letters, and digits. 
-  *1 <= stationName.length <= 10*  
- Answers within  *10-5*  of the actual value will be accepted as correct.


# [1396. 设计地铁系统][cnTitle]

**中等**

请你实现一个类  *UndergroundSystem*  ，它支持以下 3 种方法：

1. *checkIn(int id, string stationName, int t)* 

- 编号为  *id*  的乘客在  *t*  时刻进入地铁站  *stationName*  。 
- 一个乘客在同一时间只能在一个地铁站进入或者离开。

2. *checkOut(int id, string stationName, int t)* 

- 编号为  *id*  的乘客在  *t*  时刻离开地铁站  *stationName*  。

3.  *getAverageTime(string startStation, string endStation)* 

- 返回从地铁站  *startStation*  到地铁站  *endStation*  的平均花费时间。 
- 平均时间计算的行程包括当前为止所有从  *startStation*  **直接到达**   *endStation*  的行程。 
- 调用  *getAverageTime*  时，询问的路线至少包含一趟行程。

你可以假设所有对  *checkIn*  和  *checkOut*  的调用都是符合逻辑的。也就是说，如果一个顾客在 **t1**  时刻到达某个地铁站，那么他离开的时间 **t2**  一定满足 **t2 > t1**  。所有的事件都按时间顺序给出。



**示例：** 

```
输入：
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]

输出：
[null,null,null,null,null,null,null,14.0,11.0,null,11.0,null,12.0]

解释：
UndergroundSystem undergroundSystem = new UndergroundSystem();
undergroundSystem.checkIn(45, "Leyton", 3);
undergroundSystem.checkIn(32, "Paradise", 8);
undergroundSystem.checkIn(27, "Leyton", 10);
undergroundSystem.checkOut(45, "Waterloo", 15);
undergroundSystem.checkOut(27, "Waterloo", 20);
undergroundSystem.checkOut(32, "Cambridge", 22);
undergroundSystem.getAverageTime("Paradise", "Cambridge");       // 返回 14.0。从 "Paradise"（时刻 8）到 "Cambridge"(时刻 22)的行程只有一趟
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 11.0。总共有 2 躺从 "Leyton" 到 "Waterloo" 的行程，编号为 id=45 的乘客出发于 time=3 到达于 time=15，编号为 id=27 的乘客于 time=10 出发于 time=20 到达。所以平均时间为 ( (15-3) + (20-10) ) / 2 = 11.0
undergroundSystem.checkIn(10, "Leyton", 24);
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 11.0
undergroundSystem.checkOut(10, "Waterloo", 38);
undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 12.0
```



**提示：** 

- 总共最多有  *20000*  次操作。 
-  *1 <= id, t <= 10^6*  
- 所有的字符串包含大写字母，小写字母和数字。 
-  *1 <= stationName.length <= 10*  
- 与标准答案误差在  *10^-5*  以内的结果都视为正确结果。




# 算法思路

# 测试用例
```
1396. Design Underground System 1396. 设计地铁系统 Medium
```

[enTitle]: https://leetcode.com/problems/design-underground-system/
[cnTitle]: https://leetcode-cn.com/problems/design-underground-system/
