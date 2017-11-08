package com.scott.log.config;

import com.scott.log.parser.Parser;

/**
 * @Description: 日志配置文件
 * Created by fujindong on 2017/11/2.
 */

public interface LogConfig {
    /**
     * 设置是否输入出日志
     * @param allowLog
     * @return
     */
    LogConfig configAllowLog(boolean allowLog);

    /**
     * 设置标签前缀
     * @param prefix
     * @return
     */
    LogConfig configTagPrefix(String prefix);

    /**
     * 设置需要格式化的标签
     * @param formatTag
     * @return
     */
    LogConfig configFormatTag(String formatTag);

    /**
     * 设置是否显示排版线条
     * @param showBorder
     * @return
     */
    LogConfig configShowBorders(boolean showBorder);

    /**
     * 设置日志最小显示级别
     * @param logLevel
     * @return
     */
    LogConfig configLevel(int logLevel);

    /**
     * 添加自定义解析器
     * @param classes
     * @return
     */
    LogConfig addParserClass(Class<? extends Parser>... classes);


}
