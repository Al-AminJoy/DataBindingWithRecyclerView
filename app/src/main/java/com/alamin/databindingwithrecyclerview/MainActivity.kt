package com.alamin.databindingwithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alamin.databindingwithrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;
    lateinit var manager : RecyclerView.LayoutManager;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        var data = listOf(Message(1,"Hello", "https://i.postimg.cc/nr0fMmS3/Logo.png"),
            Message(2,"Hi", "https://i.postimg.cc/nr0fMmS3/Logo.png"),
            Message(3,"Greetings", "https://i.postimg.cc/nr0fMmS3/Logo.png"))

        manager = LinearLayoutManager(this);
        binding.recyclerView.apply {
            layoutManager = manager;
            adapter = RecyclerViewAdapter(data);
        }


    }
}