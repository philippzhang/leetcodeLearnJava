# [1603. Design Parking System][enTitle]

**Easy**

Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

Implement the  *ParkingSystem*  class:

-  *ParkingSystem(int big, int medium, int small)*  Initializes object of the  *ParkingSystem*  class. The number of slots for each parking space are given as part of the constructor. 
-  *bool addCar(int carType)*  Checks whether there is a parking space of  *carType*  for the car that wants to get into the parking lot.  *carType*  can be of three kinds: big, medium, or small, which are represented by  *1* ,  *2* , and  *3*  respectively. **A car can only park in a parking space of its**  *carType* . If there is no space available, return  *false* , else park the car in that size space and return  *true* .



**Example 1:** 

```
Input
["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
[[1, 1, 0], [1], [2], [3], [1]]
Output
[null, true, true, false, false]

Explanation
ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
parkingSystem.addCar(3); // return false because there is no available slot for a small car
parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.

```



**Constraints:** 

-  *0 <= big, medium, small <= 1000*  
-  *carType*  is  *1* ,  *2* , or  *3*  
- At most  *1000*  calls will be made to  *addCar* 


# [1603. 设计停车系统][cnTitle]

**简单**

请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。

请你实现  *ParkingSystem*  类：

-  *ParkingSystem(int big, int medium, int small)*  初始化  *ParkingSystem*  类，三个参数分别对应每种停车位的数目。 
-  *bool addCar(int carType)*  检查是否有  *carType*  对应的停车位。  *carType*  有三种类型：大，中，小，分别用数字  *1* ，  *2*  和  *3*  表示。**一辆车只能停在**  ****  *carType*  对应尺寸的停车位中。如果没有空车位，请返回  *false*  ，否则将该车停入车位并返回  *true*  。



**示例 1：** 

```
输入：
["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
[[1, 1, 0], [1], [2], [3], [1]]
输出：
[null, true, true, false, false]

解释：
ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
parkingSystem.addCar(1); // 返回 true ，因为有 1 个空的大车位
parkingSystem.addCar(2); // 返回 true ，因为有 1 个空的中车位
parkingSystem.addCar(3); // 返回 false ，因为没有空的小车位
parkingSystem.addCar(1); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了

```



**提示：** 

-  *0 <= big, medium, small <= 1000*  
-  *carType*  取值为  *1* ，  *2*  或  *3*  
- 最多会调用  *addCar*  函数  *1000*  次




# 算法思路

# 测试用例
```
1603. Design Parking System 1603. 设计停车系统 Easy
```

[enTitle]: https://leetcode.com/problems/design-parking-system/
[cnTitle]: https://leetcode-cn.com/problems/design-parking-system/
