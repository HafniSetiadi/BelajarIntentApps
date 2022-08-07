package com.setiadi.intentapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.setiadi.intentapplication.databinding.ActivityDisplayMessageBinding
import com.setiadi.intentapplication.databinding.ActivityDisplayMessageBinding.inflate


class DisplayMessageActivity : AppCompatActivity() {
    private var layout: ActivityDisplayMessageBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        layout = inflate(layoutInflater)
        setContentView(layout?.root)

            val name = intent.getStringExtra("name")
             layout?.tvPage3?.text = name

            val snackBar = layout?.root?.let {
            Snackbar.make (this,
                it,"Selamat Datang ", Snackbar.LENGTH_INDEFINITE)
        }
        snackBar?.setAction("Tutup") {
            snackBar.dismiss()
        }
        snackBar?.show()
        }
    }