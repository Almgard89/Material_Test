package com.example.material

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.material.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
    View.OnClickListener {

    private var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding?.buttonGame?.setOnClickListener(this)

        setSupportActionBar(binding?.topAppBar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.top_menu,menu)
        return true
    }

    override fun onClick(view: View) {

        val details = Details()
        val parameters = Bundle()

        parameters.putString("gameName", binding?.nameGame?.text?.toString())
        parameters.putString("gamePrice", binding?.nameGame?.text?.toString())
        parameters.putString("softwareHouse", binding?.nameGame?.text?.toString())

        details.arguments = parameters
        details.show(supportFragmentManager, "details")

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            android.R.id.home -> {

                val mainMenu = MainMenu()
                mainMenu.show(
                    supportFragmentManager,
                    "main_menu"
                )
            }
        }
        return true
    }
}