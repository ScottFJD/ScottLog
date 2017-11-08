package com.scott.log.inner;

/**
 * @Description: 日志猫接口
 * Created by fujindong on 2017/11/2.
 */

public interface ICat {

    void e(String message, Object... args);

    void e(Object object);

    void w(String message, Object... args);

    void w(Object object);

    void d(String message, Object... args);

    void d(Object object);

    void i(String message, Object... args);

    void i(Object object);

    void v(String message, Object... args);

    void v(Object object);

    void json(String json);

    void xml(String xml);

}
