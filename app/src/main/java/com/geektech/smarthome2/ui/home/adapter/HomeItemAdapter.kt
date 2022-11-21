package com.geektech.smarthome2.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.smarthome2.data.model.HomeItem
import com.geektech.smarthome2.databinding.ItemHomeBinding

class HomeItemAdapter(private val homeItemList:ArrayList<HomeItem>): RecyclerView.Adapter<HomeItemAdapter.HomeItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemViewHolder {
        return HomeItemViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: HomeItemViewHolder, position: Int) {
        holder.bind(homeItemList[position])
    }

    override fun getItemCount(): Int = homeItemList.size

    inner class HomeItemViewHolder(private val binding:ItemHomeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(homeItem: HomeItem){}
    }
}
