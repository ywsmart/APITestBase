package com.xxx;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;

/**
 * api接口引擎
 *
 * @author ywsmart
 * @date 2019-11-21
 */
public class Api {

    /**
     * 拆读取方法，先读取api
     *
     * @param path yaml路径
     * @return 接口请求对象
     */
    public Restful getApiFromYaml(String path) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(AppConfig.class.getResourceAsStream(path), Restful.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
