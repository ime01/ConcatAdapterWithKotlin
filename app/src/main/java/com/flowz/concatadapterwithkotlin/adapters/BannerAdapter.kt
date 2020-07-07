package com.flowz.concatadapterwithkotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flowz.concatadapterwithkotlin.R
import com.flowz.concatadapterwithkotlin.models.Banner
import kotlinx.android.synthetic.main.item_banner_layout.view.*
import kotlinx.android.synthetic.main.item_layout.view.*



class BannerAdapter (private val banner: Banner): RecyclerView.Adapter<BannerAdapter.DataViewHolder>() {


    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(banner: Banner) {

            Glide.with(itemView.imageViewBanner.context)
                .load(banner.bannerImage)
                .into(itemView.imageViewBanner)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)  =
        DataViewHolder(

            LayoutInflater.from(parent.context).inflate(R.layout.item_banner_layout, parent, false)
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(banner)




}