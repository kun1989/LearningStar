package com.company.learningstar.net;

import java.util.Map;

/**
 * 被代理类，实现接口，告诉代理类，你能代理哪些事情
 */
class VolleyRequest implements IHttpRequest {

    @Override
    public void post(String url, Map<String, Object> params, ICallBack callBack) {

    }

    @Override
    public void get(String url, Map<String, Object> params, ICallBack callBack) {

    }
}
