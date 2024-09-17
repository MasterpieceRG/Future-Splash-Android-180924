package com.mrgstores.simpleintentwithdata

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mrgstores.simpleintentwithdata.databinding.ActivityMain2Binding
import com.mrgstores.simpleintentwithdata.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var name = intent.getStringExtra("name")
        var ages = intent.getStringExtra("age")
        var age: Int? = ages?.toInt()

        if (age != null) {
            when (age) {
                in 0..4 -> {
                    age += Random.nextInt(14, 22)
                }

                in 5..8 -> {
                    age += Random.nextInt(10, 14)
                }

                in 9..12 -> {
                    age += Random.nextInt(7, 12)
                }

                in 13..15 -> {
                    age += Random.nextInt(6, 10)
                }

                in 16..18 -> {
                    age += Random.nextInt(5, 8)
                }

                in 19..30 -> {
                    age += Random.nextInt(3, 7)
                }

                in 31..40 -> {
                    age += Random.nextInt(2, 5)
                }

                in 41..100 -> {
                    age += Random.nextInt(1, 4)
                }

                else -> {
                    age += 1
                }
            }
        }


        val predictions = arrayOf(
            "By the time you turn $age, $name, your dedication will bring great achievements in your personal or professional life. You'll be proud of how far you've come.",
            "At $age, $name, you will embark on an exciting adventure or hobby. Whether it's traveling to new places or learning a new skill, this will bring joy and fulfillment.",
            "At $age, your connections with others will grow stronger. Whether it's friendships, family, or a romantic relationship, $name, you’ll have meaningful bonds that will enrich your life.",
            "By the age of $age, $name, you will find yourself in a position that aligns perfectly with your talents and passions. Whether it's a promotion, launching your own business, or changing career paths, this will be a year of significant professional growth.",
            "At $age, you’ll gain a clearer understanding of your financial goals. $name, this will be a year where you make smart decisions that lead to stability and security, setting you up for long-term success.",
            "At $age, you'll achieve a major life goal you've been working toward. It could be something like completing an important project, reaching a fitness milestone, or finishing an educational course. $name, this will be a proud moment of celebration for you!",
            "At $age, a trip or new destination is on the horizon. Whether it’s a far-off place you’ve always dreamed of visiting or a spontaneous getaway, $name, this experience will broaden your horizons and leave you with unforgettable memories.",
            "By $age, you’ll take time to reflect on your past experiences and the lessons learned along the way. $name, this year will bring a sense of peace and wisdom, helping you make decisions with confidence and clarity.",
            "You’ll feel the urge to create or improve your living environment at $age. Whether it's moving to a new place, redecorating, or making your home a sanctuary, $name, this change will bring comfort and a renewed sense of belonging.",
            "At $age, you’ll discover a new technology or tool that changes how you approach your daily life or work. $name, embracing this innovation will enhance your productivity and creativity in ways you didn’t expect.",
            "At $age, a surprising opportunity will come your way—whether it’s a career break, a project, or a personal connection. $name, you’ll embrace it and it will lead to exciting, new directions.",
            "At $age, you may face a challenge that tests your resilience. However, $name, you’ll emerge stronger, wiser, and more capable than ever before. This will be a defining moment that reshapes your future for the better.",
            "$name, as you approach $age, you’ll be faced with a significant decision that shapes the next chapter of your life. Trust in yourself, as your instincts will lead you toward the best possible outcome.",
            "At $age, you will receive recognition for something you’ve worked hard on, whether it’s from your job, community, or personal circles. $name, your efforts won’t go unnoticed, and this acknowledgment will be both rewarding and motivating.",
            "If you’re looking for love, this year may surprise you with a new and special connection. If you’re already in a relationship, $name, expect it to deepen and strengthen at $age, bringing greater harmony and understanding.",
            "At $age, you’ll start to think about the legacy you want to leave behind. Whether it’s through your work, your impact on others, or your creative contributions, $name, you’ll begin laying the foundation for something that will last far beyond your years.",
            "There’s a personal goal that you’ve had in mind for some time, and at $age, you’ll finally achieve it. Whether it’s related to fitness, education, or a dream project, $name, this accomplishment will bring a sense of fulfillment.",
            "At $age, you’ll play an important role in building or strengthening a community, whether it’s at work, in your neighborhood, or among friends. $name, you’ll be seen as a leader and a unifying presence.",
            "If you’re involved in any creative endeavors, $age will bring a breakthrough. Whether it’s a project finally coming together or an idea that excites you, $name, your creative energy will flourish and be met with success.",
            "At $age, you’ll feel the urge to reinvent some aspect of your life—whether it’s a fresh start in your career, lifestyle, or personal goals. $name, this change will bring a renewed sense of excitement and purpose.",
            "At $age, you’ll have plenty of reasons to celebrate! Whether it’s a personal achievement, a family event, or just gathering with friends, $name, this will be a joyful year filled with laughter and special moments.",
            "You’ll discover a cutting-edge technology or tool that transforms your everyday life. $name, at $age, you’ll feel more connected, productive, and excited about what the future holds because of this discovery.",
            "Please go back and try again."
        )

        val randomIndex = Random.nextInt(0, 22)

        binding.outputText.text = predictions[randomIndex]

        binding.goBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}