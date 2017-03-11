# - - coding: utf-8 -*-




#引入urllib
import urllib

#回调函数
def callback(a,b,c):
	down_pross=100.0*a*b/c
	if down_pross>100:
		down_pross=100
		#这里的逗号能使down_pross在同一行显示
	print "%.2f%%"%down_pross,



url="http://www.csdn.com/"
#1.传入网址，2.传入的本地的保存路径+文件名
#3.接收一个函数调用,可以任意定义函数的行为，
#           但是要保证这个函数有三个参数：1.到目前为止传递的数据块数量
#                                                      2.是每个数据块的大小，单位的byte，字
                                                        # 3.远程文件的大小，（有时候返回-1）
local ="g:\\nimabi.html"
urllib.urlretrieve(url,local,callback)



# #抓取网页
# html=urllib.urlopen(url)


# code = html.getcode()



# if code ==200:
# 	print "网页正常"
# else:
#      print "网页出问题"

