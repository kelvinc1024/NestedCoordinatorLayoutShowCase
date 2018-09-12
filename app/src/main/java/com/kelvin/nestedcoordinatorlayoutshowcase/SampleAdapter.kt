package com.kelvin.nestedcoordinatorlayoutshowcase

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SampleAdapter : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_row, parent, false));
    }

    override fun getItemCount(): Int {
        return 10000;
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, p1: Int) {
        viewHolder.view.setText("Sample " + p1);
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val view: TextView;

        init {
            this.view = view.findViewById(R.id.title_text)
        }

    }
}
