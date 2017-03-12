# - - coding: utf-8 -*-
#web server
# Apache,Tomcat....
#python: Tornado web server (Facebook)
#基于Event-driven的一个服务器框架

# thread-per-connection:
#             针对用户的每一个request会创建一个新的线程，然后调用不同的函数来处理这个request
#             劣处在于服务器可以创建的线程数是有限的
# Event-driven：单线程，有一个循环一直在监听，当用户有请求来了以后，不会创建线程来处理，而是会创建一个回调函数，
#               然后用这个回调函数异步的来处理这个请求。
#             好处在于：如果处理的函数需要花一定的时间，服务器不会在这个地方被阻塞，而是创建完异步的回调函数之后，
#             会立刻的结束这句话，回到监听的语句上。可以用一台服务器同时处理很多个请求。
import tornado.web
import tornado.httpserver

from tornado.options import define,options
define("port",default=8888,type=int)
class ExampleHandler(tornado.web.RequestHandler):
    def get(self):
        who=self.get_argument("who",None)
        if(who):
            self.write("hello,"+who)
        else:
            self.write("hello world")

    def post(self):
        who=self.get_argument("who",None)
        if(who):
            self.write("hello,"+who)
        else:
            self.write("hello world")

class Application(tornado.web.Application):
    def __init__(self):
        handlers=[
            (r"/",ExampleHandler),
            # (r"/")
        ]    #数组
        settings=dict()    #字典   key/value pairs
        tornado.web.Application.__init__(self,handlers,settings)

def create_server():
    tornado.options.parse_command_line()   #define port
    http_server=tornado.httpserver.HTTPServer(Application())
    http_server.listen(options.port)
    tornado.ioloop.IOLoop.instance.start()
if  __name__== "__main__":
    create_server








