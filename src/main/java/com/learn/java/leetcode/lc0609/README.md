# [609. Find Duplicate File in System][enTitle]

**Medium**

Given a list of directory info including directory path, and all the files with contents in this directory, you need to find out all the groups of duplicate files in the file system in terms of their paths.

A group of duplicate files consists of at least two files that have exactly the same content.

A single directory info string in the input list has the following format:

 *"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"* 

It means there are n files ( *f1.txt* ,  *f2.txt*  ...  *fn.txt*  with content  *f1_content* ,  *f2_content*  ...  *fn_content* , respectively) in directory  *root/d1/d2/.../dm* . Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.

The output is a list of group of duplicate file paths. For each group, it contains all the file paths of the files that have the same content. A file path is a string that has the following format:

 *"directory_path/file_name.txt"* 

Example 1:

```
Input:
["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
Output:  
[["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]

```



Note:

1. No order is required for the final output. 
2. You may assume the directory name, file name and file content only has letters and digits, and the length of file content is in the range of [1,50]. 
3. The number of files given is in the range of [1,20000]. 
4. You may assume no files or directories share the same name in the same directory. 
5. You may assume each given directory info represents a unique directory. Directory path and file info are separated by a single blank space.




1. Imagine you are given a real file system, how will you search files? DFS or BFS? 
2. If the file content is very large (GB level), how will you modify your solution? 
3. If you can only read the file by 1kb each time, how will you modify your solution? 
4. What is the time complexity of your modified solution? What is the most time-consuming part and memory consuming part of it? How to optimize? 
5. How to make sure the duplicated files you find are not false positive?


# [609. 在系统中查找重复文件][cnTitle]

**中等**

给定一个目录信息列表，包括目录路径，以及该目录中的所有包含内容的文件，您需要找到文件系统中的所有重复文件组的路径。一组重复的文件至少包括**二个** 具有完全相同内容的文件。

**输入** 列表中的单个目录信息字符串的格式如下：

 *"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"* 

这意味着有 n 个文件（ *f1.txt* ,  *f2.txt*  ...  *fn.txt*  的内容分别是  *f1_content* ,  *f2_content*  ...  *fn_content* ）在目录  *root/d1/d2/.../dm*  下。注意：n>=1 且 m>=0。如果 m=0，则表示该目录是根目录。

该**输出** 是重复文件路径组的列表。对于每个组，它包含具有相同内容的文件的所有文件路径。文件路径是具有下列格式的字符串：

 *"directory_path/file_name.txt"* 

**示例 1：** 

```
输入：
["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
输出：  
[["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]

```



**注：** 

1. 最终输出不需要顺序。 
2. 您可以假设目录名、文件名和文件内容只有字母和数字，并且文件内容的长度在 [1，50] 的范围内。 
3. 给定的文件数量在 [1，20000] 个范围内。 
4. 您可以假设在同一目录中没有任何文件或目录共享相同的名称。 
5. 您可以假设每个给定的目录信息代表一个唯一的目录。目录路径和文件信息用一个空格分隔。



**超越竞赛的后续行动：** 

1. 假设您有一个真正的文件系统，您将如何搜索文件？广度搜索还是宽度搜索？ 
2. 如果文件内容非常大（GB级别），您将如何修改您的解决方案？ 
3. 如果每次只能读取 1 kb 的文件，您将如何修改解决方案？ 
4. 修改后的解决方案的时间复杂度是多少？其中最耗时的部分和消耗内存的部分是什么？如何优化？ 
5. 如何确保您发现的重复文件不是误报？




# 算法思路

# 测试用例
```
609. Find Duplicate File in System 609. 在系统中查找重复文件 Medium
```

[enTitle]: https://leetcode.com/problems/find-duplicate-file-in-system/
[cnTitle]: https://leetcode-cn.com/problems/find-duplicate-file-in-system/
