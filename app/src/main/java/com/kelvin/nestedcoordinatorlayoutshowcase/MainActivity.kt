package com.kelvin.nestedcoordinatorlayoutshowcase

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.adapter = SampleAdapter()
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.isNestedScrollingEnabled = true
        appbarLayout.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
            override fun onOffsetChanged(appBarLayout: AppBarLayout?, offset: Int) {
                val percentage = offset.absoluteValue.toFloat() / appBarLayout!!.totalScrollRange.toFloat()
                val lerp = MathUtil.lerp(MathUtil.convertDpToPx(this@MainActivity, 200.toFloat()), MathUtil.convertDpToPx(this@MainActivity, 48.toFloat()), percentage)
                sample_image.layoutParams.height = lerp.toInt()
                sample_image.requestLayout()
            }
        })
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"))
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"))
    }
}
