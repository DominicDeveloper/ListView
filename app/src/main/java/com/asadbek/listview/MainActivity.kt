package com.asadbek.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.asadbek.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<String>
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        loadData()


        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list)
        binding.listView.adapter = adapter
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Working", Toast.LENGTH_SHORT).show()
           // Toast.makeText(this, "${list[position]}", Toast.LENGTH_SHORT).show()
        }

    }
    fun firstSee(){
        for (s in list) {
            val inflater = layoutInflater.inflate(R.layout.item_list_view,null,false)
            var txt = inflater.findViewById<TextView>(R.id.item_txt)
            txt.text = s
        //    binding.container.addView(inflater) // container bu layoutdan tashkil topgan bo`lishi kerak
        }
    }
    fun loadData(){
        for (i in 0..100){
            list.add("Android Developing $i")
        }
    }
}