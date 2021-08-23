package com.ymt.jetpackdemo

import android.Manifest.permission
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ymt.jetpackdemo.base.BaseActivity
import com.ymt.jetpackdemo.databinding.ActivityMainBinding
import com.ymt.jetpackdemo.life.MyObserve
import com.ymt.jetpackdemo.mode.NameViewModel
import com.ymt.jetpackdemo.ui.SupplyActivity
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import com.zhihu.matisse.engine.impl.GlideEngine
import com.zhihu.matisse.internal.entity.CaptureStrategy
import kotlin.math.log

class MainActivity : BaseActivity<ActivityMainBinding>() {
  private val model:NameViewModel by viewModels()
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    R.layout.activity_main
//    binding = ActivityMainBinding.inflate(layoutInflater)
//    setContentView(binding.root)


//    val sum = sum(9,9)
//    lg(sum.toString())
    val items = listOf("apple","banner","kiwifruit")
//    items.filter { it.startsWith("a") }
//        .forEach { lg(it) }
//    for (item in items){
//      when(item){
//        "apple"->lg("苹果")
//        "banner"->lg("香蕉")
//      }
//    }
//    for (x in 1..10 step 2){
//      lg(x.toString())
//    }
//    for (y in 9 downTo 0 step 3){
//      lg(y.toString())
//    }
  }

  fun lg(msg:String){
    Log.d("hmmy", msg)
  }
  private fun sum(a:Int,b:Int):Int{
    return a+b
  }

  fun goPick(): Unit {
    if (ContextCompat.checkSelfPermission(
        this@MainActivity,
        permission.READ_EXTERNAL_STORAGE
      ) != PackageManager.PERMISSION_GRANTED
    ) {
      ActivityCompat.requestPermissions(
        this@MainActivity,
        arrayOf(permission.READ_EXTERNAL_STORAGE),
        100
      )
      //没有 权限
      Toast.makeText(this@MainActivity, "没有权限", Toast.LENGTH_SHORT).show()
    } else {

      //拥有 文件 权限
      Matisse.from(this@MainActivity)
        .choose(MimeType.ofImage())
        .countable(true)
        .capture(false)
        .captureStrategy(
          CaptureStrategy(true, "com.hmmy.courtyard.fileprovider", "智慧庭院")
        )
        .maxSelectable(9)
        .isCrop(false) //是否只显示选择的类型的缩略图，就不会把所有图片视频都放在一起，而是需要什么展示什么
        .showSingleMediaType(true)
        .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        .thumbnailScale(0.85f)
        .imageEngine(GlideEngine())
        .originalEnable(true)
        .maxOriginalSize(10)
        .autoHideToolbarOnSingleTap(true)
        .fotBothResult(99)
    }
  }

  override fun initView() {

    lifecycle.addObserver(MyObserve())
    binding.show.text = "i am test view binding"
    val nameObserve = Observer<String>{newName->
      binding.show.text = newName
    }
    model.currentName.observe(this,nameObserve)
    binding.btn.setOnClickListener {
//      model.currentName.postValue("i")
//      startActivity(Intent(this,SupplyActivity::class.java))
      goPick()
    }

    val person = Person(18, "andy")
    lg("name:${person.name},age:${person.age}")

  }
}