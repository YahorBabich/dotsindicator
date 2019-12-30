package com.tbuonomo.dotsindicatorsample.viewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.tbuonomo.dotsindicatorsample.R
import com.tbuonomo.viewpagerdotsindicator.DotIndicator
import com.tbuonomo.viewpagerdotsindicator.Profile
import kotlinx.android.synthetic.main.material_page.view.*

class ProfileAdapter(private val photos: MutableList<Profile.Photo>) : RecyclerView.Adapter<ViewHolder>(), DotIndicator {

    private var list = mutableListOf<Pair<Profile.Photo.Type?, String?>>()

    init {
        list.addAll(getPhotoType(Profile.Photo.Type.PUBLIC))
        list.addAll(getPhotoType(Profile.Photo.Type.PRIVATE))
        list.addAll(getPhotoType(Profile.Photo.Type.HIDDEN))
    }

    private fun getPhotoType(type: Profile.Photo.Type): MutableList<Pair<Profile.Photo.Type?, String?>> {
        val list = photos.filter { it.type == type }
        val result = mutableListOf<Pair<Profile.Photo.Type?, String?>>()
        if (list.isNotEmpty()) {
            list.forEach { result.add(Pair(it.type, it.urls?.large)) }
        } else {
            result.add(Pair(type, null))
        }
        return result
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return object : ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.material_page, parent, false)) {}
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.text.text = photos[position].id
    }

    override fun getPhotos(): MutableList<Pair<Profile.Photo.Type?, String?>> {
        return list
    }
}
