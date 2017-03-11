# - - coding: utf-8 -*-
#引入urllib

import urllib
#打印urllib中的方法
#print dir(urllib)

# 打印urlopen的帮助文档
# print help(urllib.urlopen)    Post/Get

url="http://www.163.com/"
#抓取网页
html=urllib.urlopen(url)

# 获取传入的url参数
# print html.geturl()



# 在抓取网页之前要获取网页所在服务器头部的信息
# print html.info()

# 获取网页状态码    200:可以正常访问，可以抓取     301：重定向    302临时重定向   404：网页不存在   403：禁止抓取   500:服务器忙
# print html.getcode()              

#读出网页内容
# print html.read().decode("gbk").encode("utf-8")

# 查看html对象有哪些方法
# print dir(html)

# 网页抓取，下载网页
urllib.urlretrieve(url,"g:\\pythontest.html")

# 关闭打开的文件
html.close()
