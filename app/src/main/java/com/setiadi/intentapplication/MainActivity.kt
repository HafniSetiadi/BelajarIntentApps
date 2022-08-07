package com.setiadi.intentapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.setiadi.intentapplication.databinding.ActivityMainBinding


//const val EXTRA_MESSAGE = "com.setiadi.intentapplication.MESSAGE"

class MainActivity : AppCompatActivity() {
    private var layout: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layout = ActivityMainBinding.inflate(layoutInflater)
        setContentView(layout?.root)

//1) Input text submit button pindah ke activity lain menu view Text (Intent)
        layout?.btnPage1?.setOnClickListener {
            val editText = findViewById<EditText>(R.id.etPage1)
            val message = editText.text.toString()
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra("name", message)
            }
            startActivity(intent)
        }
    }
}

/*2)
        layout?.btnPage1?.setOnClickListener {
            val intent = Intent(this, DisplayMessageActivity::class.java)
            intent.putExtra("name", "Jokowi")
            startActivity(intent)
        }
    }
}
*/