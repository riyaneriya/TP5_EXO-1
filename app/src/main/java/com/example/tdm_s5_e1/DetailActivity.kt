package com.example.tdm_s5_e1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.td4_exo4.Module

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Retrieve data coming from MainActivity.java
        /*val actionBar: ActionBar?=supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)*/
        var intent=intent
        val module=intent.getSerializableExtra("module") as Module
        // Pass the data to FragmentB to display it
        val fragmentB = supportFragmentManager.findFragmentById(R.id.fragmentB) as FragmentB?
        fragmentB?.displayDetails(module.intutile,module.duree,module.ens)
    }
}