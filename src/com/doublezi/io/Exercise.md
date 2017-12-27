#18 Java I/O 系统

##18.1.1

**1：** 修改`DirList.java`（或其变体之一），以便`FilenameFilter`能够打开每个文件（使用`com.doublezi.util.TextFile工具`），并检查命令行尾随的参数是否存在于那个文件中，以此结果来决定是否接受这个文件。

*Modify DirList.java (or one of its variants) so that ①the FilenameFilter opens and reads each file (using the net.mindview.util.TextFile utility) and ②accepts the file based on whether any of the trailing arguments on the command line exist in that file.*

将会用到以下方法：

* `toLowerCase()`
* `endsWith()`
	

**2：** 创建一个叫做`SortedDirList`的类，它具有一个可以接受文件路径信息，并能构建该路径下所有文件的排序目录列表的构造器。向这个类添加两个重载的`list()`方法：一个产生整个列表，另一个产生与其参数（一个正则表达式）相匹配的列表的子集。

**3：** 修改`DirList.java`（或其变体之一），使其对所选中的文件计算文件尺寸的总和。 


**7：** 打开一文本文件，每次读取一行内容。将每一行作为一个`String`读入，并将那个`String`对象置入到`LinkedList`中。按相反的顺序打印输出`LinkedList`中的所有行。