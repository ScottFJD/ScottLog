package com.scott.log.inner;

/**
 * @Description: 日志猫功能实现
 * Created by fujindong on 2017/11/2.
 */

public class Cat implements ICat {

    @Override
    public void e(String message, Object... args) {

    }

    @Override
    public void e(Object object) {

    }

    @Override
    public void w(String message, Object... args) {

    }

    @Override
    public void w(Object object) {

    }

    @Override
    public void d(String message, Object... args) {

    }

    @Override
    public void d(Object object) {

    }

    @Override
    public void i(String message, Object... args) {

    }

    @Override
    public void i(Object object) {

    }

    @Override
    public void v(String message, Object... args) {

    }

    @Override
    public void v(Object object) {

    }

    @Override
    public void json(String json) {

    }

    @Override
    public void xml(String xml) {

    }

    private synchronized void logString(int type, String msg, Object... args) {

    }

    private void logString(int type, String msg, boolean isPart, Object... args) {

    }

}
