package com.ran.qxfirstkotlin.actvitys

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.ran.qxfirstkotlin.R
import com.ran.qxfirstkotlin.base.QXBaseActivity
import com.ran.qxfirstkotlin.modle.Person
import com.ran.qxfirstkotlin.modle.toast
import kotlinx.android.synthetic.main.activity_main.*
@Route(path="/actvity/main")
class MainActivity : QXBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //从此不再用findbyId
        tv.setText("my first Kotlin")
        //或者 tv.text="my first Kotlin"

        var p= Person(18,"jack")
        btn.setOnClickListener {
            p.toast(this,p.name)
        }
    }
}
