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

        var data = listOf(Message(1,"Hello"),
            Message(2,"Hi"),
            Message(3,"Greetings"))

        manager = LinearLayoutManager(this);
        binding.recyclerView.apply {
            layoutManager = manager;
            adapter = RecyclerViewAdapter(data);
        }


    }
}