package studio.su.austin.hsinchugo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button

class mission_1_task_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_1_task_1)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val mission_1_button_Task1: Button = findViewById(R.id.button_m1_task1)
        mission_1_button_Task1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent()
                intent.setClass(this@mission_1_task_1, mission_1question_1_task_1::class.java)
                startActivity(intent)
            }
        })
    }
}
