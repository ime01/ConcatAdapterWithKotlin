package com.flowz.concatadapterwithkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flowz.concatadapterwithkotlin.R
import com.flowz.concatadapterwithkotlin.models.MyDetail
import kotlinx.android.synthetic.main.item_my_detail_layout.view.*

class MyDetailAdapter(private val myDetail: MyDetail) : RecyclerView.Adapter<MyDetailAdapter.DataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= DataViewHolder (

        LayoutInflater.from(parent.context).inflate(R.layout.item_my_detail_layout, parent,
            false)
    )


    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(myDetail)

    class DataViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind (user: MyDetail){

            itemView.textViewUser.text = user.name
            itemView.textViewAboutUser.text = user.aboutMe


        }

    }
}