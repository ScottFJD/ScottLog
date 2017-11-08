package com.scott.log.inner;

/**
 * Created by fujindong on 2017/11/6.
 */

public class ConsoleTree extends Tree {
    @Override
    protected void log(int type, String tag, String message) {
        System.out.println(tag + "\t" + message);
    }
}