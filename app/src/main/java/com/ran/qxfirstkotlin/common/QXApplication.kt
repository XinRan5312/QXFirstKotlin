package com.ran.qxfirstkotlin.common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.ran.qxfirstkotlin.BuildConfig

/**
 * Created by houqixin on 2017/5/25.
 */
class QXApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            ARouter.openLog() // 打印日志
            ARouter.openDebug()// 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险) }
          ARouter.init(this) // 尽可能早，推荐在Application中初始化
        }
    }
}