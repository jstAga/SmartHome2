package com.geektech.smarthome2.ui.onBoarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.smarthome2.data.model.OnBoard
import com.geektech.smarthome2.databinding.ItemOnBoardingBinding
import com.geektech.smarthome2.load

class OnBoardingAdapter(val onSkip: () -> Unit): RecyclerView.Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {
    private val onBoardingList = arrayListOf<OnBoard>(
        OnBoard("Work on time", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.","https://cdni.iconscout.com/illustration/premium/thumb/man-working-on-business-task-management-5904038-4906969.png"),
        OnBoard("Track progress", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Viverra suspendisse potenti nullam ac tortor. ","https://img.freepik.com/premium-vector/checklist-concept-questionnaire-survey-clipboard-task-list-vector-illustration-flat_186332-938.jpg"),
        OnBoard("Remember daily task", "Tortor aliquam nulla facilisi cras fermentum odio eu. Risus in hendrerit gravida rutrum quisque non tellus.","https://img.freepik.com/premium-vector/checklist-concept-successful-workers-business-people-start-up-task-board-tasks-ready-smart-time-management-vector-illustration_53562-17893.jpg?w=2000")
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(ItemOnBoardingBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(onBoardingList[position])
    }

    override fun getItemCount(): Int = onBoardingList.size

    inner class OnBoardingViewHolder(private val binding: ItemOnBoardingBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(onBoard: OnBoard) {
            binding.btnSkip.isVisible = adapterPosition != onBoardingList.lastIndex
            binding.btnStart.isVisible = adapterPosition == onBoardingList.lastIndex

            binding.tvTitle.text = onBoard.title
            binding.tvDescription.text = onBoard.description
            binding.ivPicture.load(onBoard.image.toString())

            binding.btnSkip.setOnClickListener{
                onSkip()
            }

            binding.btnStart.setOnClickListener{
                onSkip()
            }
        }
    }
}