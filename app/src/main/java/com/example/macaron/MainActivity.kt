package com.example.macaron

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.macaron.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            txtNumber.text=number.toString()
            btnCount2.setOnClickListener {
                number ++
                txtNumber.text=number.toString()
            }
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "Count $number", Toast.LENGTH_SHORT).show()
            }
        }

        Log.d("CLOG", "onCreate: Log debug")
        Log.e("CLOG", "onCreate: Log error")
        Log.i("CLOG", "onCreate: Log info")
        Log.w("CLOG", "onCreate: Log warning")
    }
}