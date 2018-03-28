package com.scott.scottlog;

import android.app.Application;

import com.scott.log.ScottLog;
import com.scott.log.inner.ConsoleTree;
import com.scott.log.inner.FileTree;
import com.scott.log.inner.LogcatTree;

/**
 * Created by scottfu on 18-3-28.
 */

public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ScottLog.getLogConfig().configAllowLog(true)
                    .configShowBorders(false);
//            ScottLog.plant(new FileTree(this, "log"));
//            ScottLog.plant(new ConsoleTree());
            ScottLog.plant(new LogcatTree());
        }
    }
}
