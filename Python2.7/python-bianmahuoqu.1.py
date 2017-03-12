# - - coding: utf-8 -*-
#简单粗暴的方法 获得网页编码
#通过服务器头部的Header信息，获取网页返回的声明编码      有时为none，
#使用第三方专业模块chardet自动化：自动判断网页编码的Python第三方库

# import urllib
# url="http://www.163.com"
# #输出网页头部信息
# info= urllib.urlopen(url).info()

# print info

# print info.getparam("charset")

import urllib
import chardet #字符集检测

# url="https://www.amazon.cn/?tag=baidu250-23&hvadid={creative}&ref=pz_ic_22fvxh4dwf_e"
# content= urllib.urlopen(url).read()

# result= chardet.detect(content)   #前面是可信度  后面是编码格式
# #输出编码格式
# print result['encoding']

#同样，chardet还可以检测字符串的编码
# print chardet.detect('我是中文') 

#自动检测传入函数
def automatic_detect(url):
	 content= urllib.urlopen(url).read()
	 result= chardet.detect(content)
	 encoding=result['encoding']
	 return encoding

urls=["https://www.taobao.com/","https://www.baidu.com/","https://www.amazon.cn/ref=nav_logo"]
for url in urls:
	print url,automatic_detect(url)









