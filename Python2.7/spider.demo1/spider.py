# - - coding: utf-8 -*-

#可以设置代理ip，模拟用户,浏览器来访问
import urllib2
url="http://blog.csdn.net/andrewfan/article/details/59057811"

# req=urllib2.Request(url)
# req.add_header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3026.3 Safari/537.36")
# req.add_header("GET",url)
# req.add_header("Referer","http://blog.csdn.net/AndrewFan")
# req.add_header("Host","blog.csdn.net")

# html=urllib2.urlopen(req)
# print html.getcode()
# print html.read()

req=urllib2.Request(url,headers)


html=urllib2.urlopen(req)
print html.getcode()
print html.read()



