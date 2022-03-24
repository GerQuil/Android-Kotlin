package com.example.layoutexercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //String[] items = new String[] {"Male", "Female", "Others"};

        val gender = resources.getStringArray(R.array.gender)
        val status = resources.getStringArray(R.array.civil_status)

        val spinner = findViewById<Spinner>(R.id.spinner1)
        if(spinner != null){
                val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, gender)
                spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long){
                    Toast.makeText(this@MainActivity, getString(R.string.selected_item)+ " " + "" + gender[position],Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
        }
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        if(spinner != null){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, status)
            spinner2.adapter = adapter

            spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long){
                    Toast.makeText(this@MainActivity, getString(R.string.selected_item)+ " " + "" + status[position],Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
            }
        }
    }
}