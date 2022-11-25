package com.geektech.smarthome2.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geektech.smarthome2.data.pref.Pref
import com.geektech.smarthome2.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pref = Pref(requireContext())

        binding.btnSwitch.isChecked = pref.checkShow()

        binding.btnSwitch.setOnCheckedChangeListener{_, isChecked ->
            if (isChecked){
                pref.saveShow(true)
            } else{
                pref.saveShow(false)
            }
        }
    }

}