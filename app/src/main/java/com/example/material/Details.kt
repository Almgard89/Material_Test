package com.example.material

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.material.databinding.DetailsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class Details : BottomSheetDialogFragment(),View.OnClickListener {

    private var binding:DetailsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.details, container, false)

        binding?.nameGameDetails?.text = arguments?.getString("gameName").toString()
        binding?.priceGameDetails?.text = getText(R.string.price).toString()
        binding?.softwareHouseGameDetails?.text = getText(R.string.id_software).toString()

        when(binding?.nameGameDetails?.text) {
            getString(R.string.doom) -> binding?.imageGameDetails?.setImageResource(R.drawable.baner)
        }



        binding?.closePanel?.setOnClickListener(this)

        return binding?.root
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.closePanel -> dismiss()
        }
    }


}