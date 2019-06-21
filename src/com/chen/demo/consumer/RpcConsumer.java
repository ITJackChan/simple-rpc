package com.chen.demo.consumer;


import com.chen.demo.provider.HelloService;
import com.chen.demo.provider.rpc.RpcFramework;

public class RpcConsumer {
	
	public static void main(String[] args) throws Exception {
		// 由RpcFramework生成的HelloService的代理
		HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
		String hello = service.sayHello("World");
		System.out.println("客户端收到远程调用的结果 ： " + hello);
	}
	
}