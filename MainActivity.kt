package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val myWebView: WebView = findViewById(R.id.webView)
//        myWebView.settings.javaScriptEnabled = true
//        myWebView.loadUrl("https://www.google.com/")
    }

    //実行ボタンたっぷじ
    fun onButtonTapped(view: View?){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}