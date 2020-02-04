package com.wxx.demo.entity.common;

import lombok.Data;
import lombok.Getter;

/**
 * @author wangxinxin07
 * @date 2020/1/29
 */
@Data
public class RestReturnJson {

    private Integer code;

    private String msg;

    private Object data;

    public static RestReturnJson success() {
        RestReturnJson restReturnJson = new RestReturnJson();
        restReturnJson.setCode(1);
        restReturnJson.setMsg("success");
        return restReturnJson;
    }

    public static RestReturnJson success(Object data) {
        RestReturnJson restReturnJson = new RestReturnJson();
        restReturnJson.setCode(1);
        restReturnJson.setMsg("success");
        restReturnJson.setData(data);
        return restReturnJson;
    }

    public static RestReturnJson error(String msg) {
        RestReturnJson restReturnJson = new RestReturnJson();
        restReturnJson.setCode(0);
        restReturnJson.setMsg(msg);
        return restReturnJson;
    }

    public static RestReturnJson error() {
        RestReturnJson restReturnJson = new RestReturnJson();
        restReturnJson.setCode(0);
        restReturnJson.setMsg("fail");
        return restReturnJson;
    }

}
