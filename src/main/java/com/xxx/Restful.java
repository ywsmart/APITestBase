package com.xxx;

import java.util.HashMap;

/**
 * 接口请求
 *
 * @author ywsmart
 * @date 2019-11-21
 */
public class Restful {
    public String url;
    public String method;
    public HashMap<String,String> header = new HashMap<String, String>();
    public HashMap<String,String> query = new HashMap<String, String>();
    public String body;
}
