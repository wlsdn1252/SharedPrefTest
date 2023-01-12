package com.example.sharedpreftest.utils

import android.content.Context

class ContextUtil {
    // companion object안에 코드를 적게되면 메인액티비티에서 객체생성 필요없이
    // 클래스이름.변수로 사용 가능 자바의 static이랑 비슷
    // 예) ContextUtil.test
    companion object{
        //val test = "테스트"

        // 메모장 저장할 떄 처럼 어떤 파일명으로 저장할건지 정함
        private val prefname = "TestPref"
        
        // 저장해줄 데이터 항목명을 변수로저장
        // 자동완성을 이용해 실수를 줄이기 위한 목적
        private val AUTO_LOGIN = "AUTO_LOGIN"

        fun setAutoLogin(context : Context, autoLogin : Boolean){
            val pref = context.getSharedPreferences(prefname, Context.MODE_PRIVATE)
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()
        }
    }

}