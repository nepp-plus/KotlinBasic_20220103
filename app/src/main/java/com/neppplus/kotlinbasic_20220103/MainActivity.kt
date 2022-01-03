package com.neppplus.kotlinbasic_20220103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        로그 찍기 버튼 눌리면 할 일 세팅.
        btnLog.setOnClickListener {

//            버튼 눌리면 할일.
            Log.d("메인화면", "로그찍기 버튼 눌림")

        }

    }
}