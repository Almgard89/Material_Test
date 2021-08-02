package com.example.material

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.example.material.databinding.DetailsBinding
import com.example.material.databinding.MainMenuBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MainMenu : BottomSheetDialogFragment() {

    private var binding: MainMenuBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.main_menu, container, false)

        binding?.navigationView?.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {

                R.id.homeMenu -> {
                    val startHome = Intent(context, MainActivity::class.java)
                    val activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((context as FragmentActivity))
                    startActivity(startHome, activityOptionsCompat.toBundle())
                }

                R.id.accountMenu -> {

                }

                R.id.shopCart -> {

                }

                R.id.contactMenu -> {

                }

                R.id.gameShop -> {

                }

                R.id.consoleShop -> {

                }

            }
            true
        }

        return binding?.root
    }
}