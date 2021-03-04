# [1733. Minimum Number of People to Teach][enTitle]

**Medium**

On a social network consisting of  *m*  users and some friendships between users, two users can communicate with each other if they know a common language.

You are given an integer  *n* , an array  *languages* , and an array  *friendships*  where:

- There are  *n*  languages numbered  *1*  through  *n* , 
-  *languages[i]*  is the set of languages the  *ith* ​​​​ user knows, and 
-  *friendships[i] = [ui, vi]*  denotes a friendship between the users  *ui* ​​​​​ and  *vi* .

You can choose **one**  language and teach it to some users so that all friends can communicate with each other. Return the minimumnumber of users you need to teach.









**Example 1:** 

```
Input: n = 2, languages = [[1],[2],[1,2]], friendships = [[1,2],[1,3],[2,3]]
Output: 1
Explanation: You can either teach user 1 the second language or user 2 the first language.

```

**Example 2:** 

```
Input: n = 3, languages = [[2],[1,3],[1,2],[3]], friendships = [[1,4],[1,2],[3,4],[2,3]]
Output: 2
Explanation: Teach the third language to users 1 and 3, yielding two users to teach.

```



**Constraints:** 

-  *2 <= n <= 500*  
-  *languages.length == m*  
-  *1 <= m <= 500*  
-  *1 <= languages[i].length <= n*  
-  *1 <= languages[i][j] <= n*  
-  *1 <= ui < vi <= languages.length*  
-  *1 <= friendships.length <= 500*  
- All tuples  *(ui, vi)*  are unique 
-  *languages[i]*  contains only unique values


# [1733. 需要教语言的最少人数][cnTitle]

**中等**

在一个由  *m*  个用户组成的社交网络里，我们获取到一些用户之间的好友关系。两个用户之间可以相互沟通的条件是他们都掌握同一门语言。

给你一个整数  *n*  ，数组  *languages*  和数组  *friendships*  ，它们的含义如下：

- 总共有  *n*  种语言，编号从  *1*  到  *n*  。 
-  *languages[i]*  是第  *i*  位用户掌握的语言集合。 
-  *friendships[i] = [ui, vi]*  表示  *ui* ​​​​​ 和  *vi*  为好友关系。

你可以选择 **一门**  语言并教会一些用户，使得所有好友之间都可以相互沟通。请返回你 **最少**  需要教会多少名用户。









**示例 1：** 

```
输入：n = 2, languages = [[1],[2],[1,2]], friendships = [[1,2],[1,3],[2,3]]
输出：1
解释：你可以选择教用户 1 第二门语言，也可以选择教用户 2 第一门语言。

```

**示例 2：** 

```
输入：n = 3, languages = [[2],[1,3],[1,2],[3]], friendships = [[1,4],[1,2],[3,4],[2,3]]
输出：2
解释：教用户 1 和用户 3 第三门语言，需要教 2 名用户。

```



**提示：** 

-  *2 <= n <= 500*  
-  *languages.length == m*  
-  *1 <= m <= 500*  
-  *1 <= languages[i].length <= n*  
-  *1 <= languages[i][j] <= n*  
-  *1 <= ui < vi <= languages.length*  
-  *1 <= friendships.length <= 500*  
- 所有的好友关系  *(ui, vi)*  都是唯一的。 
-  *languages[i]*  中包含的值互不相同。




# 算法思路

# 测试用例
```
1733. Minimum Number of People to Teach 1733. 需要教语言的最少人数 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-people-to-teach/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-people-to-teach/
