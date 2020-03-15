package com.example.baselibrary.Common

/**
 * Created by xuxiaopeng
 * on 2020-03-15.
 * Description：公用工具类
 */

import android.content.Context
import android.view.WindowManager


import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.Calendar


object AndroidUtils {

    val year: Int
        get() {
            val now = Calendar.getInstance()
            return now.get(Calendar.YEAR)
        }

    val month: Int
        get() {
            val now = Calendar.getInstance()
            return now.get(Calendar.MONTH) + 1
        }

    val day: Int
        get() {
            val now = Calendar.getInstance()
            return now.get(Calendar.DAY_OF_MONTH)
        }

    /**
     * 获取屏幕宽度
     */
    fun getScreenWidth(context: Context): Int {
        return (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay.width
    }

    /**
     * 获取屏幕高度
     */
    fun getScreenHeight(context: Context): Int {
        return (context.getSystemService(Context.WINDOW_SERVICE) as WindowManager).defaultDisplay.height
    }

    /**
     * @param context
     * @return 状态栏的高度
     */
    fun getStatusBarHeight(context: Context): Int {
        var result = 0
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = context.resources.getDimensionPixelSize(resourceId)
        }
        return result
    }

    fun px2dip(context: Context, dpValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    fun omit4Float(f: Float): String {
        val b = BigDecimal(f.toDouble())
        val f1 = b.setScale(4, BigDecimal.ROUND_HALF_UP).toFloat()
        val decimalFormat = DecimalFormat("##0.0000")
        return decimalFormat.format(f1.toDouble())
    }
}
