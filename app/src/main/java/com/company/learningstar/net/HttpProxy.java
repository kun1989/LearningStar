package com.company.learningstar.net;

import java.util.Map;

/**
 * 代理同样实现接口
 */
public class HttpProxy implements IHttpRequest {
    IHttpRequest iHttpRequest;


    private static HttpProxy httpProxy;
    private HttpProxy(){

    }

    public static HttpProxy obtain(){
        synchronized (HttpProxy.class){//?为什么用class，而不是this等
            if (httpProxy==null){
                httpProxy=new HttpProxy();
            }
        }
        return httpProxy;
    }

    public void init(IHttpRequest client){
        iHttpRequest=client;
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallBack callBack) {
        iHttpRequest.post(url, params, callBack);
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallBack callBack) {
        iHttpRequest.get(url, params, callBack);
    }
}
