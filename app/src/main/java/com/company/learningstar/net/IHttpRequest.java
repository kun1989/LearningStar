package com.company.learningstar.net;

import java.util.Map;

/**
 * 行为规范，规范代理类能代理的具体事情
 */
public interface IHttpRequest {
    //    post
    void post(String url, Map<String, Object> params, ICallBack callBack);

    //    get
    void get(String url, Map<String, Object> params, ICallBack callBack);
//    del
//    update
//    patch

}
