# - - coding: utf-8 -*-




#引入urllib
import urllib

#回调函数
#3.接收一个函数调用,可以任意定义函数的行为，
#           但是要保证这个函数有三个参数：1.到目前为止传递的数据块数量
#                                                      2.是每个数据块的大小，单位的byte，字
                                                        # 3.远程文件的大小，（有时候返回-1）

 #传入一个元组参数a，之后输出它
def callback(*a):

	print a,



url="http://www.csdn.com/"
#1.传入网址，2.传入的本地的保存路径+文件名

local ="g:\\nimabi.html"
urllib.urlretrieve(url,local,callback)

print urllib.urlopen(url).info()

