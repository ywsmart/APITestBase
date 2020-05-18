package com.xxx;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;


/**
 * app基础配置
 *
 * @author ywsmart
 * @date 2019-11-21
 */
public class AppConfig {

    /**
     * 基础配置的参数，需要手动添加
     */
    public String config1 = "";

    private static AppConfig appConfig;

    public static AppConfig getInstance(){
        if (appConfig == null){
            appConfig = loadFromYaml("/conf/AppConfig.yaml");
        }
        return appConfig;
    }

    /**
     * 从yaml配置文件加载配置参数
     *
     * @param path 文件路径
     * @return 配置参数
     */
    private static AppConfig loadFromYaml(String path){
        ObjectMapper mapper= new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(AppConfig.class.getResourceAsStream(path), AppConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
