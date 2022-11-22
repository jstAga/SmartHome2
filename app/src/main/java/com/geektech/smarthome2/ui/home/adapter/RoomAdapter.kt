package com.geektech.smarthome2.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.smarthome2.data.model.Room
import com.geektech.smarthome2.databinding.ItemHomeBinding

class RoomAdapter(private val roomList:ArrayList<Room>): RecyclerView.Adapter<RoomAdapter.RoomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        return RoomViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        holder.bind(roomList[position])
    }

    override fun getItemCount(): Int = roomList.size

    inner class RoomViewHolder(private val binding:ItemHomeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(room: Room){
            binding.tvRoom.text = room.room
            binding.tvDevices.text = room.countDevices + " devices"
            Glide.with(binding.ivHomePic).load(room.picture).into(binding.ivHomePic)
        }
    }
}
