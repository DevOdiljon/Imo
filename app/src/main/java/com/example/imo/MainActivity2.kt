package com.example.imo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.adapter.ChatAdapter
import com.example.imo.model.Chat

class MainActivity2 : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllaChats())
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    private fun getAllaChats(): ArrayList<Chat> {
        val chats:ArrayList<Chat> = ArrayList<Chat>()

        chats.add(Chat(R.drawable.image, "Rustamov Odilbek", 1))
        chats.add(Chat(R.drawable.img, "Kucharov Alijon", 9))
        chats.add(Chat(R.drawable.img_1, "Anna", 0))
        chats.add(Chat(R.drawable.img_2, "Bell", 2))
        chats.add(Chat(R.drawable.img_3, "hjwvhe hibiw9", 1))
        chats.add(Chat(R.drawable.img_4, "fneukr kjhbiwqd", 6))
        chats.add(Chat(R.drawable.image, "Rustamov Odilbek", 1))
        chats.add(Chat(R.drawable.img, "Kucharov Alijon", 9))
        chats.add(Chat(R.drawable.img_1, "Anna", 0))
        chats.add(Chat(R.drawable.img_2, "Bell", 2))
        chats.add(Chat(R.drawable.img_3, "hjwvhe hibiw9", 1))
        chats.add(Chat(R.drawable.img_4, "fneukr kjhbiwqd", 6))
        chats.add(Chat(R.drawable.image, "Rustamov Odilbek", 1))
        chats.add(Chat(R.drawable.img, "Kucharov Alijon", 9))
        chats.add(Chat(R.drawable.img_1, "Anna", 0))
        chats.add(Chat(R.drawable.img_2, "Bell", 2))
        chats.add(Chat(R.drawable.img_3, "hjwvhe hibiw9", 1))
        chats.add(Chat(R.drawable.img_4, "fneukr kjhbiwqd", 6))

        return chats
    }
}