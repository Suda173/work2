package com.example.su2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name: EditText = findViewById(R.id.name)
        var pass: EditText = findViewById(R.id.pass)
        var con: EditText = findViewById(R.id.con)
        var ok: Button = findViewById(R.id.ok)
        var clear: Button = findViewById(R.id.clear)

        clear.setOnClickListener() {
            name.setText("")
            pass.setText("")
            con.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = name.text.toString()
            var password = pass.text.toString()
            var confirm = con.text.toString()
            if(user == "" || password == "" || confirm == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user == password && user == confirm) {
            Toast.makeText(applicationContext, "อย่ากรอกUsernameตรงกับPassword", Toast.LENGTH_LONG).show()
        }
        else if(password!= confirm){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
        }
        }


    }
}