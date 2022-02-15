package com.alamin.databindingwithrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alamin.databindingwithrecyclerview.databinding.RowMessageBinding

class RecyclerViewAdapter(private val messageList: List<Message>): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val binding: RowMessageBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Message){
            binding.message = item;
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context);
        val view = RowMessageBinding.inflate(inflater,parent,false)
        return MyViewHolder(view);
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.bind(messageList[position]);
    }

    override fun getItemCount(): Int {
        return messageList.size;
    }
}