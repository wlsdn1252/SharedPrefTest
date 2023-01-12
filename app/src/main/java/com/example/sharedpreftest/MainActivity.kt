package com.example.sharedpreftest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreftest.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoLoginCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->

            // 지금 체크된 체크박스 상황을 그대로 ContextUtil을 이용해 자동로그인 여부로 저장.
            ContextUtil.setAutoLogin(this,isChecked)
        }

        // 화면이 만들어지면 저장된 자동로그인 여부 값을 체크박스에 반영
        autoLoginCheckBox.isChecked = ContextUtil.getAutoLogin(this)
    }
}