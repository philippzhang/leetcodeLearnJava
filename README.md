leetcode刷题项目(java版)


1. 本人实现的leetcode算法测试项目
2. 每个算法通常对应三个文件: 算法主类、算法测试类Main、算法README.md
3. 算法主类用于实现算法的核心代码
4. 算法测试类是一个继承CallBack的类Main，包含一个main方法，通常调用Utilitys.test(Main.class);进行测试
   
   对于部分复杂的算法测试需求，需要覆盖CallBack提供的方法进程实现
   
5. 参数README.md 通过爬虫爬取的英文和中文题的描述、编写的算法思路和测试用例
6. 可以通过GetQuestion类获取题目(目前仅能爬取题目，代码和测试用例需要自行补充)
7. 可通过LeetCodeSpiderAll获取所有题目的url，保存到/src/main/java/com/learn/java/leetcode/base/spider下的README.md中
7. AllMain可以对所有算法进行校验
 
**CallBack提供方法**

```
printInput   打印输入参数方法
inputBuild   入参构建方法
printOutput  打印输出参数方法
outputVerify 输出参数验证方法
inputVerify  输入参数验证方法
funcListTest 列表式方式参数调用（第一个参数为构造方法）
```   

**测试用例说明**
```
1. 测试用例用代码段"# 测试用例" 开始，包含在两段```之间
2. 测试用例前第一行对应算法描述
3. 第二行对应算法主类和方法，格式:算法运行主类.算法运行主类的方法 (方法后面可以加 #标记的备注)
4. 如果有第三行，同第二行，用于支持算法的不同实现方法。
5. 如果需要定要运行列表式方法测试，主类是Main,主类方法是funcListTest
6. 用---分隔多组参数,可以定义一组到多组
7. 每组参数必须有入参，入参每行表示一个参数，参数类型、个数、顺序必须匹配主类方法的参数的类型、个数、顺序(除非Main中覆盖了inputBuild方法)
8. 如果定义=开头的参数，表示需要校验输出参数值，=后面是正确的值（Main可通过覆盖outputVerify实现自己的输出参数校验逻辑）
9. 测试用例中有多行=，表示以下任意结果均正确,适用于验证多个正确结果
9. 如果定义I*=开头的参数，表示需要校验输入参数值，=后面是正确的值，*是一个需要填的数字，表示第几个参数，例如I0=（Main可通过覆盖inputVerify实现自己的输入参数校验逻辑）
10. 测试用例中可以允许出现空行和#开头的注释
11. $disorder表示出参为无序的list
12. $disprint表示不格式化打印输出参数，适用于带环链表等无法打印的数据结构
13. 数据库执行需要先创建数据库
    create database leetcode;
```
   
   

