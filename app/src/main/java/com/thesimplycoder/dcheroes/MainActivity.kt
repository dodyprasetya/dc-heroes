package com.thesimplycoder.dcheroes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val heroList = ArrayList<Hero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init data
        initData()

        // init recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = HeroesAdapter(heroList)
    }

    private fun initData() {
        heroList.add(Hero("https://i.ibb.co/FDxPzDn/batman.jpg",
            "Batman", "Gotham City"))
        heroList.add(Hero("https://i.ibb.co/cJmt652/superman.jpg",
            "Superman", "Krypton"))
        heroList.add(Hero("https://i.ibb.co/gdxx4qV/Wonder-Woman.jpg",
            "Wonder Woman", "Themyscira"))
        heroList.add(Hero("https://i.ibb.co/xDgdJSG/theflash.jpg",
            "The Flash", "Central City"))
        heroList.add(Hero("https://i.ibb.co/J75K6kT/aquaman.jpg",
            "Aquaman", "Atlantis"))
        heroList.add(Hero("https://i.ibb.co/yfcMKP0/greenlantern.jpg",
            "Green Lantern", "Coast City"))
        heroList.add(Hero("https://i.ibb.co/f0YbwWy/cyborg.jpg",
            "Cyborg", "Central City"))
    }
}
