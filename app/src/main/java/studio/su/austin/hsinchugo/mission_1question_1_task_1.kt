package studio.su.austin.hsinchugo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast


class mission_1question_1_task_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mission_1question_1_task_1)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val mission_task_1_send: Button = findViewById(R.id.butten_m1_t1_SendAns)
        mission_task_1_send.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val _Checkbox_m1_t1_c2: CheckBox = findViewById(R.id.checkbox_m1_t1_c2)
                val _Checkbox_m1_t1_c1: CheckBox = findViewById(R.id.checkbox_m1_t1_c1)
                if (_Checkbox_m1_t1_c2.isChecked && !(_Checkbox_m1_t1_c1.isChecked)) {
                    val toast = Toast.makeText(this@mission_1question_1_task_1,
                            "答對了", Toast.LENGTH_LONG)
                    //顯示Toast
                    toast.show()
                } else {
                    val toast = Toast.makeText(this@mission_1question_1_task_1,
                            "答錯了", Toast.LENGTH_LONG)
                    //顯示Toast
                    toast.show()
                }
            }
        })
    }
}
