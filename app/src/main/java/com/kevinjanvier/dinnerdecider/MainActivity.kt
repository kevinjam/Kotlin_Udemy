package com.kevinjanvier.dinnerdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val foodList = arrayListOf("Chines", "Humburger", "Pizza", "Demos","McDonalds", "Barros Pizza")



        decideBtn.setOnClickListener {
            val radom = Random()
            val radomfood = radom.nextInt(foodList.count())
            selectFoodtext.text = foodList[radomfood]

        }

        addFoodBtn.setOnClickListener {
            val newfood = addFoodtext.text.toString()
            foodList.add(newfood)
            addFoodtext.text.clear()
        }


    }

}
