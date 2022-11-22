package com.geektech.smarthome2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geektech.smarthome2.data.model.Room
import com.geektech.smarthome2.databinding.FragmentHomeBinding
import com.geektech.smarthome2.ui.home.adapter.RoomAdapter

class HomeFragment : Fragment() {

private lateinit var binding:FragmentHomeBinding
private var homeItemList = arrayListOf<Room>()
    private lateinit var roomAdapter: RoomAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        roomAdapter = RoomAdapter(homeItemList)
        binding.rvHomeRoom.adapter = roomAdapter
    }

    private fun loadData() {
        homeItemList.clear()

        homeItemList.add(Room("2", "Kitchen", "https://w7.pngwing.com/pngs/895/912/png-transparent-cooking-chef-baking-culinary-art-chefs-hat-kitchen-white-food-thumbnail.png"))
        homeItemList.add(Room("1", "Bathroom", "https://www.clipartmax.com/png/middle/306-3062639_pin-chef-hat-clipart-chefs-hat-vector-png.png"))
        homeItemList.add(Room("3", "Dining room", ""))
        homeItemList.add(Room("6", "Living room", ""))

        homeItemList.add(Room("2", "Kitchen", "https://w7.pngwing.com/pngs/895/912/png-transparent-cooking-chef-baking-culinary-art-chefs-hat-kitchen-white-food-thumbnail.png"))
        homeItemList.add(Room("1", "Bathroom", "https://www.clipartmax.com/png/middle/306-3062639_pin-chef-hat-clipart-chefs-hat-vector-png.png"))
        homeItemList.add(Room("3", "Dining room", ""))
        homeItemList.add(Room("6", "Living room", ""))

        homeItemList.add(Room("2", "Kitchen", "https://w7.pngwing.com/pngs/895/912/png-transparent-cooking-chef-baking-culinary-art-chefs-hat-kitchen-white-food-thumbnail.png"))
        homeItemList.add(Room("1", "Bathroom", "https://www.clipartmax.com/png/middle/306-3062639_pin-chef-hat-clipart-chefs-hat-vector-png.png"))
        homeItemList.add(Room("3", "Dining room", ""))
        homeItemList.add(Room("6", "Living room", ""))

    }
}