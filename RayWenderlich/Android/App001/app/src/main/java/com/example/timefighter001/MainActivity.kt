package com.example.timefighter001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonConvert.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()

            if(editTextDoller.text.isNotEmpty())
            {
                try {
                    var doller:Float = editTextDoller.text.toString().toFloat()
                    textViewResult.text = (doller * 0.85).toString()
                }catch (e:Exception)
                {
                    println(e.message)

                    textViewResult.text = "${e.stackTrace} ${e.message}"
                }


            }

        }

    }
}
