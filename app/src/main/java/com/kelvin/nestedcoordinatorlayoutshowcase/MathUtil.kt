package com.kelvin.nestedcoordinatorlayoutshowcase

import android.content.Context

object MathUtil {

    fun lerp(a: Float, b: Float, f: Float): Float {
        return a + f * (b - a)
    }

    fun convertDpToPx(context: Context, dp: Float): Float {
        return dp * context.resources.displayMetrics.density
    }

    fun convertPxToDp(context: Context, px: Float): Float {
        return px / context.resources.displayMetrics.density
    }

}
