package com.ran.qxfirstkotlin.modle

import android.content.Context
import android.widget.Toast

/**
 * Created by houqixin on 2017/5/23.
 */
/**
 * 这样class前面加一个data直接给个构造器类名 系统会帮我们生成所有的set get和equel和hashcode方法
 */
data class Person(var age:Int,var name:String)
fun Person.toast(context:Context,msg:String){
      Toast.makeText(context,msg,1).show()
}


