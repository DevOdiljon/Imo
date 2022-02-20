package com.example.imo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.model.Chat
import com.example.imo.adapter.ChatAdapter
import android.provider.ContactsContract.RawContacts
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews1()
        initViews2()
    }
    fun initViews1(){
        var btn_vazifa_1 = findViewById<Button>(R.id.btn_vazifa_1)
        btn_vazifa_1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })
    }
    fun initViews2(){
        var btn_vazifa_2 = findViewById<Button>(R.id.btn_vazifa_2)
        btn_vazifa_2.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        })
    }
}