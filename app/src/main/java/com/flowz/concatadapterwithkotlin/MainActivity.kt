package com.flowz.concatadapterwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowz.concatadapterwithkotlin.adapters.BannerAdapter
import com.flowz.concatadapterwithkotlin.adapters.MyDetailAdapter
import com.flowz.concatadapterwithkotlin.adapters.UsersAdapters
import com.flowz.concatadapterwithkotlin.models.DataSource
import com.flowz.concatadapterwithkotlin.models.MyDetail
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    lateinit var myDetailAdapter: MyDetailAdapter

    lateinit var userAdapter: UsersAdapters

    lateinit var bannerAdapter: BannerAdapter

    val myDetail = MyDetail(1, "John Smith", " He is John Wick's friend")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupDataInRecyclerView()

    }

    private fun setupDataInRecyclerView() {

        my_concat_recyclerView.layoutManager = LinearLayoutManager(this)
        userAdapter = UsersAdapters(DataSource.getUser())
        bannerAdapter = BannerAdapter(DataSource.getBanner())
        myDetailAdapter = MyDetailAdapter(myDetail)

        //This is where Concat Adapter is used to combine all three individual adapters
        var adapter = ConcatAdapter( myDetailAdapter,  userAdapter,  bannerAdapter)

       my_concat_recyclerView.adapter = adapter

    }
}
