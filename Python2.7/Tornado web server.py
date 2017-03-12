
# - - coding: utf-8 -*-

#Tornado web server
#facebook 开源的做服务器的库
#HTTP Client      这个做的爬虫程序会比urllib2更有效率

import tornado.httpclient

def fetch(url):
	http_header = {'User-Agent': 'Chrome'}
	#dictionary   伪装成来自Chrome浏览器的请求
	http_request = tornado.httpclient.HTTPRequest(url=url,method='GET',headers=http_header,connect_timeout=20,request_timeout=600)

	http_client =tornado.httpclient.HTTPClient()

	print "Start downloading data...."

	http_response=http_client.fetch(http_request)
	print "Finished downloading data...."


	print http_response.code

	all_fileds =http_response.headers.get_all()
	for filed in all_fileds:
		print filed


	print http_response.body


if __name__== "__main__":
	fetch("https://www.baidu.com/")


