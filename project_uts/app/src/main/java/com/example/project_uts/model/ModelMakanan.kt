package com.example.project_uts.model

import com.example.project_uts.R

data class ModelMakanan(
    val image: Int,
    val nama: String
)
object MockList {
    fun getModel(): List<ModelMakanan> {
        val item1 = ModelMakanan(
            R.drawable.img1,
            "Risol"
        )
        val item2 = ModelMakanan(
            R.drawable.img2,
            "Pasta"
        )

        val itemList: ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        return itemList
    }
}
