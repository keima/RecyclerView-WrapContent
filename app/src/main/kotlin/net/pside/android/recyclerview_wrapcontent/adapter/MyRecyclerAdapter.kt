package net.pside.android.recyclerview_wrapcontent.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.pside.android.recyclerview_wrapcontent.R

class MyRecyclerAdapter : RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {
    val TAG = this.javaClass.simpleName

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        Log.d(TAG, "onBindViewHolder: position: ${position}");
    }

    override fun onViewRecycled(holder: MyViewHolder?) {
        super.onViewRecycled(holder)
        Log.d(TAG, "onViewRecycled: pos: ${holder?.layoutPosition}");
    }

    override fun getItemCount(): Int {
        return 50
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder? {
        val inflater = LayoutInflater.from(parent?.context)
        return MyViewHolder(
                inflater.inflate(R.layout.list_item, parent, false)
        )
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

}