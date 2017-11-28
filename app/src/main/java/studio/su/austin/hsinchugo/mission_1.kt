package studio.su.austin.hsinchugo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button


class mission_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_1)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val route_button_1: Button = findViewById(R.id.button_m1_route)
        route_button_1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent()
                intent.setClass(this@mission_1, mission_route::class.java)
                startActivity(intent)
            }
        })
        val m1_button_q1: Button = findViewById(R.id.button_m1_startmission)
        m1_button_q1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent()
                intent.setClass(this@mission_1, mission_1_question_1::class.java)
                startActivity(intent)
            }
        })
    }
}