package com.asadbek.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.asadbek.listview.R

class UserAdapter(context: Context,val list:List<String>):ArrayAdapter<String>(context, R.layout.item_list_view,list) {
    // har bitta itemni yaratib beradigan funksiya
    // convertView - har bir viewni konvretlab birma bir olishi
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView:View
        if (convertView == null){
            itemView = LayoutInflater.from(parent?.context).inflate(R.layout.item_list_view,parent,false)

        }else{
            itemView = convertView
        }
        itemView.findViewById<TextView>(R.id.item_txt).text = list[position]
        return itemView
    }
}