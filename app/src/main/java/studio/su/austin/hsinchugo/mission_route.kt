package studio.su.austin.hsinchugo

import android.os.Bundle
import com.klinker.android.sliding.SlidingActivity


class mission_route : SlidingActivity() {
    override fun init(savedInstanceState: Bundle?) {
        title = "路線圖"
        setImage(R.drawable.map1)
        enableFullscreen()
        setContent(R.layout.content_mission_route)
    }
}
