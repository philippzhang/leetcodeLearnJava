# [1125. Smallest Sufficient Team][enTitle]

**Hard**

In a project, you have a list of required skills  *req_skills* , and a list of  *people* . The i-th person  *people[i]*  contains a list of skills that person has.

Consider a  *sufficient team* : a set of people such that for every required skill in  *req_skills* , there is at least one person in the team who has that skill. We can represent these teams by the index of each person: for example,  *team = [0, 1, 3]*  represents the people with skills  *people[0]* ,  *people[1]* , and  *people[3]* .

Return **any**  sufficient team of the smallest possible size, represented by the index of each person.

You may return the answer in any order. It is guaranteed an answer exists.



**Example 1:** 

```
Input: req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
Output: [0,2]

```

**Example 2:** 

```
Input: req_skills = ["algorithms","math","java","reactjs","csharp","aws"], people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
Output: [1,2]

```



**Constraints:** 

-  *1 <= req_skills.length <= 16*  
-  *1 <= people.length <= 60*  
-  *1 <= people[i].length, req_skills[i].length, people[i][j].length <= 16*  
- Elements of  *req_skills*  and  *people[i]*  are (respectively) distinct. 
-  *req_skills[i][j], people[i][j][k]*  are lowercase English letters. 
- Every skill in  *people[i]*  is a skill in  *req_skills* . 
- It is guaranteed a sufficient team exists.


# [1125. 最小的必要团队][cnTitle]

**困难**

作为项目经理，你规划了一份需求的技能清单  *req_skills* ，并打算从备选人员名单  *people*  中选出些人组成一个「必要团队」（ 编号为  *i*  的备选人员  *people[i]*  含有一份该备选人员掌握的技能列表）。

所谓「必要团队」，就是在这个团队中，对于所需求的技能列表  *req_skills*  中列出的每项技能，团队中至少有一名成员已经掌握。

我们可以用每个人的编号来表示团队中的成员：例如，团队  *team = [0, 1, 3]*  表示掌握技能分别为  *people[0]* ， *people[1]* ，和  *people[3]*  的备选人员。

请你返回 **任一**  规模最小的必要团队，团队成员用人员编号表示。你可以按任意顺序返回答案，本题保证答案存在。



**示例 1：** 

```
输入：req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
输出：[0,2]

```

**示例 2：** 

```
输入：req_skills = ["algorithms","math","java","reactjs","csharp","aws"], people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
输出：[1,2]

```



**提示：** 

-  *1 <= req_skills.length <= 16*  
-  *1 <= people.length <= 60*  
-  *1 <= people[i].length, req_skills[i].length, people[i][j].length <= 16*  
-  *req_skills*  和  *people[i]*  中的元素分别各不相同 
-  *req_skills[i][j], people[i][j][k]*  都由小写英文字母组成 
- 本题保证「必要团队」一定存在




# 算法思路

# 测试用例
```
1125. Smallest Sufficient Team 1125. 最小的必要团队 Hard
```

[enTitle]: https://leetcode.com/problems/smallest-sufficient-team/
[cnTitle]: https://leetcode-cn.com/problems/smallest-sufficient-team/
