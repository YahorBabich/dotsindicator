package com.tbuonomo.dotsindicatorsample.viewpager2

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.tbuonomo.dotsindicatorsample.R
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator
import com.tbuonomo.viewpagerdotsindicator.Profile
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class ViewPager2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_view_pager2)

        val dotsIndicator = findViewById<DotsIndicator>(R.id.dots_indicator)
        val springDotsIndicator = findViewById<SpringDotsIndicator>(R.id.spring_dots_indicator)
        val wormDotsIndicator = findViewById<WormDotsIndicator>(R.id.worm_dots_indicator)

        /*val p = mutableListOf<String>()
        p.add("100")
        p.add("101")
        p.add("102")

        val pr = mutableListOf<String>()
        pr.add("200")

        val h = mutableListOf<String>()
        h.add("300")
        h.add("301")

        var public = Pair("PUBLIC", p)
        var private = Pair("PRIVATE", pr)
        var hidden = Pair("PRIVATE", h)*/

        val p = Profile()
        val list = mutableListOf<Profile.Photo>()
        list.add(Profile.Photo(id = "100", type = Profile.Photo.Type.PUBLIC))
        list.add(Profile.Photo(id = "101", type = Profile.Photo.Type.PUBLIC))
        list.add(Profile.Photo(id = "102", type = Profile.Photo.Type.PUBLIC))
        list.add(Profile.Photo(id = "103", type = Profile.Photo.Type.PUBLIC))
        list.add(Profile.Photo(id = "104", type = Profile.Photo.Type.PUBLIC))
        list.add(Profile.Photo(id = "200", type = Profile.Photo.Type.PRIVATE))
        list.add(Profile.Photo(id = "201", type = Profile.Photo.Type.PRIVATE))
        list.add(Profile.Photo(id = "202", type = Profile.Photo.Type.PRIVATE))
        list.add(Profile.Photo(id = "300", type = Profile.Photo.Type.HIDDEN))


        p.photos = list

        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager2)
        val adapter = ProfileAdapter(list)
        viewPager2.adapter = adapter

/*    val zoomOutPageTransformer = ZoomOutPageTransformer()
    viewPager2.setPageTransformer { page, position ->
      zoomOutPageTransformer.transformPage(page, position)
    }*/

        dotsIndicator.setViewPager2(viewPager2)
/*    springDotsIndicator.setViewPager2(viewPager2)
    wormDotsIndicator.setViewPager2(viewPager2)*/
    }
}
