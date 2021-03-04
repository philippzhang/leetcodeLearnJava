# [1487. Making File Names Unique][enTitle]

**Medium**

Given an array of strings  *names*  of size  *n* . You will create  *n*  folders in your file system **such that** , at the  *ith*  minute, you will create a folder with the name  *names[i]* .

Since two files **cannot**  have the same name, if you enter a folder name which is previously used, the system will have a suffix addition to its name in the form of  *(k)* , where,  *k*  is the **smallest positive integer**  such that the obtained name remains unique.

Return  *an array of strings of length n*  where  *ans[i]*  is the actual name the system will assign to the  *ith*  folder when you create it.



**Example 1:** 

```
Input: names = ["pes","fifa","gta","pes(2019)"]
Output: ["pes","fifa","gta","pes(2019)"]
Explanation: Let's see how the file system creates folder names:
"pes" --> not assigned before, remains "pes"
"fifa" --> not assigned before, remains "fifa"
"gta" --> not assigned before, remains "gta"
"pes(2019)" --> not assigned before, remains "pes(2019)"

```

**Example 2:** 

```
Input: names = ["gta","gta(1)","gta","avalon"]
Output: ["gta","gta(1)","gta(2)","avalon"]
Explanation: Let's see how the file system creates folder names:
"gta" --> not assigned before, remains "gta"
"gta(1)" --> not assigned before, remains "gta(1)"
"gta" --> the name is reserved, system adds (k), since "gta(1)" is also reserved, systems put k = 2. it becomes "gta(2)"
"avalon" --> not assigned before, remains "avalon"

```

**Example 3:** 

```
Input: names = ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"]
Output: ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
Explanation: When the last folder is created, the smallest positive valid k is 4, and it becomes "onepiece(4)".

```

**Example 4:** 

```
Input: names = ["wano","wano","wano","wano"]
Output: ["wano","wano(1)","wano(2)","wano(3)"]
Explanation: Just increase the value of k each time you create folder "wano".

```

**Example 5:** 

```
Input: names = ["kaido","kaido(1)","kaido","kaido(1)"]
Output: ["kaido","kaido(1)","kaido(2)","kaido(1)(1)"]
Explanation: Please note that system adds the suffix (k) to current name even it contained the same suffix before.

```



**Constraints:** 

-  *1 <= names.length <= 5 * 10^4*  
-  *1 <= names[i].length <= 20*  
-  *names[i]*  consists of lower case English letters, digits and/or round brackets.


# [1487. 保证文件名唯一][cnTitle]

**中等**

给你一个长度为  *n*  的字符串数组  *names*  。你将会在文件系统中创建  *n*  个文件夹：在第  *i*  分钟，新建名为  *names[i]*  的文件夹。

由于两个文件 **不能**  共享相同的文件名，因此如果新建文件夹使用的文件名已经被占用，系统会以  *(k)*  的形式为新文件夹的文件名添加后缀，其中  *k*  是能保证文件名唯一的 **最小正整数**  。

返回长度为 *n*  的字符串数组，其中  *ans[i]*  是创建第  *i*  个文件夹时系统分配给该文件夹的实际名称。



**示例 1：** 

```
输入：names = ["pes","fifa","gta","pes(2019)"]
输出：["pes","fifa","gta","pes(2019)"]
解释：文件系统将会这样创建文件名：
"pes" --> 之前未分配，仍为 "pes"
"fifa" --> 之前未分配，仍为 "fifa"
"gta" --> 之前未分配，仍为 "gta"
"pes(2019)" --> 之前未分配，仍为 "pes(2019)"

```

**示例 2：** 

```
输入：names = ["gta","gta(1)","gta","avalon"]
输出：["gta","gta(1)","gta(2)","avalon"]
解释：文件系统将会这样创建文件名：
"gta" --> 之前未分配，仍为 "gta"
"gta(1)" --> 之前未分配，仍为 "gta(1)"
"gta" --> 文件名被占用，系统为该名称添加后缀 (k)，由于 "gta(1)" 也被占用，所以 k = 2 。实际创建的文件名为 "gta(2)" 。
"avalon" --> 之前未分配，仍为 "avalon"

```

**示例 3：** 

```
输入：names = ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"]
输出：["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
解释：当创建最后一个文件夹时，最小的正有效 k 为 4 ，文件名变为 "onepiece(4)"。

```

**示例 4：** 

```
输入：names = ["wano","wano","wano","wano"]
输出：["wano","wano(1)","wano(2)","wano(3)"]
解释：每次创建文件夹 "wano" 时，只需增加后缀中 k 的值即可。
```

**示例 5：** 

```
输入：names = ["kaido","kaido(1)","kaido","kaido(1)"]
输出：["kaido","kaido(1)","kaido(2)","kaido(1)(1)"]
解释：注意，如果含后缀文件名被占用，那么系统也会按规则在名称后添加新的后缀 (k) 。

```



**提示：** 

-  *1 <= names.length <= 5 * 10^4*  
-  *1 <= names[i].length <= 20*  
-  *names[i]*  由小写英文字母、数字和/或圆括号组成。




# 算法思路

# 测试用例
```
1487. Making File Names Unique 1487. 保证文件名唯一 Medium
```

[enTitle]: https://leetcode.com/problems/making-file-names-unique/
[cnTitle]: https://leetcode-cn.com/problems/making-file-names-unique/
