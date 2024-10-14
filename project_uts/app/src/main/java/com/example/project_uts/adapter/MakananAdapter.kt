package com.example.project_uts.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_uts.DetailMakanan
import com.example.project_uts.R
import com.example.project_uts.RecycleMakanan
import com.example.project_uts.model.ModelMakanan

class MakananAdapter (
    val itemList: ArrayList<ModelMakanan>,
    private val getActivity : RecycleMakanan // untuk bisa call intent
):
    RecyclerView.Adapter<MakananAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari item layout
        var itemImage: ImageView
        var itemText: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar1)
            itemText = itemView.findViewById(R.id.nama1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //kita deklare layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_makanan, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].nama)

        //tambahkan intent utk passing data
        holder.itemView.setOnClickListener() {
            //deklarasi intent
            val intent = Intent(getActivity, DetailMakanan::class.java)
            //put extra
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("nama", itemList[position].nama)
            //mengarah ke detail
            getActivity.startActivity(intent)
        }
    }
}