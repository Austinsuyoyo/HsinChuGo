package studio.su.austin.hsinchugo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_activity)
        val mission_button_1: Button = findViewById(R.id.button_m1)
        mission_button_1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent()
                intent.setClass(this@home_activity, mission_1::class.java)
                startActivity(intent)
            }
        })
    }
}