package com.mrgstores.simpleintentwithdata

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mrgstores.simpleintentwithdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.submitBtn.setOnClickListener {
            val name = binding.nameInput.text.toString()
            val age = binding.ageInput.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this, "Name field is empty", Toast.LENGTH_SHORT).show()
            }else if (age.isEmpty()) {
                Toast.makeText(this, "Age field is empty", Toast.LENGTH_SHORT).show()
            }else {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("name", name)
                intent.putExtra("age", age)
                startActivity(intent)
                finish()
            }
        }
    }
}