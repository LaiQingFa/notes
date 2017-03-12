# - - coding: utf-8 -*-
#URL
#HTTP Request       (key/value  pairs)
# Get / Post (data)

# HTTP Response

#引入urllib2    urllib2这个库在做比较大的文件的时候速度慢，效率不高
import urllib2

def fetch(url):
	http_header = {'User-Agent': 'Chrome'} #dictionary   伪装成来自Chrome浏览器的请求
	http_request = urllib2.Request(url,None,http_header)


	http_response =urllib2.urlopen(http_request)


	#Status code  状态码   200/ok    404/Invalid  URL     500 /Internal Error
	print http_response .code

	#http header (key/value  pairs)
	print http_response.info()
	print "---------Data----------"
	print "Start downloading data...."
	print http_response.read()
	print "Finished downloading data...."

if  __name__== "__main__":
	fetch("http://www.meituan.com/api/v1/divisions")







