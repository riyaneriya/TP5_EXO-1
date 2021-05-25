package com.example.td4_exo4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tdm_s5_e1.MyCommunicator
import com.example.tdm_s5_e1.R

class LessonAdapter(private val context: Context?, private var data: List<Lesson>):
    RecyclerView.Adapter<LessonAdapter.MyViewHolder>()
{
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val lessonDescript = view.findViewById<TextView>(R.id.itemTitle) as TextView
        val lessonDate= view.findViewById<TextView>(R.id.itemDate) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.lessonDescript.text=  data[position].module.intutile
        holder.lessonDate.text=data[position].timeInterval()
        holder.itemView.setOnClickListener {
            val myCommunicator = context as MyCommunicator
            myCommunicator.displayDetails(data[position].module)
           /* if (isTwoPane()){
                val activity=context as Activity
                var fragmentDetail =activity.findViewById<View>(R.id.fragment2)
                val detail=data[position].module
                val bundle= bundleOf("detail" to detail)
                Toast.makeText(activity,"clicked:${detail.intutile+""+detail.ens.fname}",Toast.LENGTH_SHORT).show()
            }else{
              *//*  val intent = Intent(context,MainActivity2::class.java)
                intent.putExtra("module",data[position].module)
                context.startActivity(intent)*//*
            }*/

        }
    }

    override fun getItemCount(): Int =data.size
   /* private fun isTwoPane():Boolean{
        val activity = context as Activity

        return activity.findViewById<View>(R.id.fragment2)!=null

    }*/
}