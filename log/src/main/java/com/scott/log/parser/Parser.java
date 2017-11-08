package com.scott.log.parser;

import com.scott.log.constant.LogConstant;

/**
 * @Description: 解析器接口
 * Created by fujindong on 2017/11/3.
 */

public interface Parser<T> {
    //    分割线
    String LINE_SEPARATOR = LogConstant.BR;

    Class<T> parseClassType();

    String parseString(T t);
}
