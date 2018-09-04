package com.example.franciscoandrade.databindingkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.franciscoandrade.databindingkotlin.databinding.ActivityMainBinding
import com.example.franciscoandrade.databindingkotlin.viewmodel.User

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activitybinding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user= User("Isco", "Andrade")

        activitybinding.setVariable(BR.usermodel, user)
        activitybinding.executePendingBindings()

    }
}
