package com.chen.demo.provider;

import com.chen.demo.provider.rpc.RpcFramework;

public class RpcProvider {
	
	public static void main(String[] args) throws Exception {
		HelloService service = new HelloServiceImpl();
		// 将服务暴露出来，供客户端消费
		RpcFramework.export(service, 1234);
	}
	
}