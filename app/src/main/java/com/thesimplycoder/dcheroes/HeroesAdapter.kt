package com.thesimplycoder.dcheroes

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.load.engine.DiskCacheStrategy
import kotlinx.android.synthetic.main.item_hero.view.*

class HeroesAdapter(private val itemList: List<Hero>): RecyclerView.Adapter<HeroesAdapter.ViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesAdapter.ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HeroesAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() {
            val data = itemList.get(adapterPosition)
            itemView.tvHeroName.text = "${data.name}"
            itemView.tvHeroOrigin.text = "${data.origin}"

            // load image
            GlideApp.with(context!!)
                .load(data.pictureUrl)
                .circleCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(itemView.ivHeroPicture)
        }

    }
}