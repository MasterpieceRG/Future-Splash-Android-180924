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
            "At $age, you’ll take a bold step toward a new opportunity that will reshape your career path. Whether it’s starting a business or embracing a promotion, $name, this decision will bring excitement and prosperity.",
            "There’s a creative project you've been thinking about, and at $age, you’ll finally bring it to life. $name, this will be the year your artistic vision turns into reality, bringing you both recognition and personal satisfaction.",
            "When you turn $age, you’ll reconnect with someone from your past who has always inspired you. This reconnection, $name, will not only reignite fond memories but also open the door to new opportunities in both your personal and professional life.",
            "At $age, a fitness goal that has been on your mind will finally be reached. $name, whether it’s running that marathon or mastering a new sport, this accomplishment will make you feel stronger and more determined than ever.",
            "You’ve been thinking about pursuing higher education or a certification, and by $age, you’ll finally complete it. $name, this achievement will open new doors and provide a sense of pride in your academic success.",
            "At $age, you’ll take time for a solo adventure—whether it’s traveling to a distant place or exploring a new hobby. $name, this experience will give you fresh perspectives and a renewed sense of independence.",
            "There’s a financial goal you’ve had for a while, and at $age, you’ll finally achieve it. Whether it’s saving for a big purchase or becoming debt-free, $name, this milestone will bring a sense of security and accomplishment.",
            "When you turn $age, you’ll find yourself deepening a significant relationship. Whether it’s with a close friend, a family member, or a partner, $name, this connection will grow stronger and provide profound emotional support.",
            "At $age, you’ll feel an urge to give back to your community. Whether through volunteering or leading a local initiative, $name, your efforts will make a meaningful difference and bring a new sense of purpose to your life.",
            "You’ve had a personal development goal in mind for some time, and at $age, you’ll make major progress toward it. $name, whether it’s related to mindfulness, self-confidence, or mental well-being, this year will bring profound growth.",
            "At $age, you’ll embrace a healthier lifestyle. Whether it’s through nutrition, exercise, or mindfulness, $name, these changes will make you feel revitalized and in control of your health.",
            "When you turn $age, you’ll finally complete that big home project or renovation you’ve been dreaming about. $name, this transformation will make your living space feel like the sanctuary you’ve always envisioned.",
            "At $age, you’ll decide to embark on an educational journey—whether it’s learning a new skill, language, or taking up a course. $name, this year will mark the beginning of intellectual exploration that brings lifelong benefits.",
            "At $age, you’ll find yourself in the spotlight for your hard work. Whether it’s at your job, in your community, or among friends, $name, this recognition will validate your efforts and encourage you to aim even higher.",
            "There’s a trip you’ve always wanted to take, and at $age, you’ll finally go on that adventure. $name, this journey will be everything you dreamed of and more, creating memories that last a lifetime.",
            "At $age, you’ll focus on nurturing your mental health and emotional well-being. Whether it’s through therapy, meditation, or mindfulness practices, $name, this will be a transformative time of self-care and healing.",
            "When you turn $age, a personal challenge you’ve been grappling with will finally be resolved. $name, you’ll feel a deep sense of relief and empowerment, having overcome an obstacle that once felt insurmountable.",
            "At $age, you’ll finally have the opportunity to pursue a passion project that’s been close to your heart. $name, this year will be filled with creativity, innovation, and the joy of bringing your dream to life.",
            "When you reach $age, a surprising mentor or guide will enter your life. $name, their wisdom and advice will help you navigate a challenging decision, leading to success and clarity in a way you hadn’t anticipated.",
            "At $age, you’ll make a lasting impact on someone’s life through kindness or mentorship. $name, this selfless act will not only benefit them but also bring you immense personal fulfillment.",
            "At $age, you’ll finally step into a leadership role that you’ve been eyeing for some time. $name, this promotion or opportunity will allow you to make a lasting impact in your field, boosting your confidence and career.",
            "When you turn $age, you’ll reach a milestone in your fitness journey. Whether it’s achieving a specific goal or adopting a healthier lifestyle, $name, you’ll feel proud of your dedication and progress.",
            "At $age, a long-awaited financial breakthrough will come your way. Whether it’s through a new investment, a business venture, or savings goal, $name, this success will give you the financial freedom you’ve been working toward.",
            "By $age, you’ll find yourself excelling in a skill that once felt challenging. $name, your persistence and effort will pay off, and you’ll feel more confident in your abilities, whether it’s at work or in a personal pursuit.",
            "At $age, you’ll have the chance to reconnect with nature. $name, whether it’s through travel, hiking, or simply spending more time outdoors, this connection will bring you peace and a sense of grounding.",
            "When you turn $age, you’ll experience a personal transformation. Whether it’s a shift in mindset, habits, or perspective, $name, this year will be one of growth and self-discovery that shapes your future in a positive way.",
            "At $age, you’ll make a decision that enhances your work-life balance. $name, this choice will allow you to enjoy more time for yourself and loved ones, improving your overall well-being and happiness.",
            "When you reach $age, you’ll discover a new passion. Whether it’s a creative hobby, a cause, or a new field of study, $name, this interest will bring excitement and a fresh perspective to your life.",
            "At $age, a dream project you’ve had on your mind will finally come to fruition. $name, this year will bring the resources and time you need to turn your ideas into reality, bringing you immense satisfaction.",
            "When you turn $age, you’ll embrace a new chapter in your personal life. Whether it’s a new relationship, friendship, or family dynamic, $name, this change will bring joy and deeper connections to your daily life.",
            "At $age, you’ll finally pursue that side business or entrepreneurial idea you’ve been considering. $name, this will be a year of bold moves and innovation, leading you to exciting new opportunities.",
            "When you reach $age, a new learning opportunity will come your way. Whether it’s enrolling in a course or picking up a new skill, $name, this will ignite a passion for personal growth and expand your horizons.",
            "At $age, you’ll experience a turning point in a relationship that has been important to you. $name, this shift will lead to greater understanding, closeness, and mutual respect, strengthening your bond.",
            "By $age, you’ll feel a renewed sense of purpose in your career or personal endeavors. $name, this clarity will guide you toward new goals, making the path ahead exciting and full of potential.",
            "At $age, you’ll embark on a journey that challenges and inspires you. Whether it’s travel, a creative project, or a new goal, $name, this experience will leave a lasting impact on how you see the world and yourself.",
            "When you turn $age, you’ll overcome a fear or insecurity that’s been holding you back. $name, this breakthrough will open doors to new experiences and opportunities, giving you the confidence to move forward boldly.",
            "At $age, you’ll find yourself drawn to a new community or social circle. $name, this will be a year of forming meaningful connections with like-minded people, bringing new energy and positivity into your life.",
            "When you reach $age, you’ll achieve a balance between work, health, and personal growth that you’ve been striving for. $name, this harmony will bring a sense of peace and fulfillment, allowing you to thrive in every area.",
            "At $age, you’ll embrace a long-overdue change in your environment, whether it’s redecorating your home, moving to a new place, or creating a personal sanctuary. $name, this change will bring comfort and inspiration to your daily routine.",
            "When you turn $age, you’ll be recognized for your contributions, whether in your career or through volunteer work. $name, this acknowledgment will validate your efforts and inspire you to continue making a positive difference.",
            "At $age, you’ll take the first step toward a long-held dream that seemed out of reach. $name, this bold move will set you on a path to success, bringing excitement and fulfillment.",
            "When you turn $age, you’ll finally achieve the work-life balance you’ve been striving for. $name, this newfound equilibrium will allow you to focus on your personal passions without sacrificing your professional goals.",
            "At $age, a personal goal you’ve been working on in private will come to fruition. Whether it’s related to fitness, a creative project, or self-improvement, $name, this year will be marked by accomplishment and pride.",
            "When you reach $age, you’ll reconnect with a passion from your past. $name, whether it’s an old hobby, interest, or relationship, this rediscovery will bring joy and a renewed sense of purpose.",
            "At $age, you’ll find yourself in a position to mentor or guide someone who looks up to you. $name, your experience and wisdom will be a source of inspiration for them, and this role will bring you fulfillment.",
            "When you turn $age, you’ll find clarity in an area of your life that’s been uncertain. $name, this newfound sense of direction will give you the confidence to pursue your next steps with determination and optimism.",
            "At $age, you’ll embrace a major lifestyle change that enhances your well-being. $name, this could be a new fitness routine, a healthier diet, or a mindful practice that improves your physical and mental health.",
            "When you reach $age, a significant career opportunity will arise. $name, this breakthrough will allow you to showcase your talents in a new way, leading to personal satisfaction and professional growth.",
            "At $age, you’ll take a step back to reflect on your personal values and long-term goals. $name, this year of introspection will help you realign with your true self, leading to deeper fulfillment.",
            "When you turn $age, you’ll find yourself taking on a leadership role, either in your career or community. $name, this new responsibility will highlight your strengths and help you make a lasting impact on those around you.",
            "At $age, you’ll finally accomplish a major financial goal, such as buying a home, paying off a debt, or reaching a savings milestone. $name, this achievement will bring you peace of mind and financial freedom.",
            "When you reach $age, you’ll decide to take on a new challenge that pushes you out of your comfort zone. $name, this decision will help you grow and uncover strengths you didn’t know you had.",
            "At $age, you’ll form a new relationship that will deeply enrich your life. Whether it’s a friendship, partnership, or professional connection, $name, this bond will open doors to new possibilities and perspectives.",
            "When you turn $age, you’ll realize a dream you’ve been working toward for years. $name, this long-awaited achievement will bring immense satisfaction and remind you of the power of persistence.",
            "At $age, you’ll explore a new hobby or interest that brings fresh excitement into your life. $name, this new pursuit will add balance and joy to your daily routine, making this year one of discovery.",
            "When you reach $age, a personal challenge you’ve been facing will finally be resolved. $name, overcoming this obstacle will leave you feeling empowered and ready for the next chapter in your life.",
            "At $age, you’ll feel a deeper sense of gratitude for the people and experiences that have shaped you. $name, this year will be one of reflection and appreciation, helping you focus on what truly matters.",
            "When you turn $age, you’ll take a leap of faith that leads to an exciting new adventure. $name, whether it’s related to your career, a move, or a personal decision, this bold choice will bring lasting rewards.",
            "At $age, you’ll prioritize self-care in a way that enhances your well-being like never before. $name, this year will be about focusing on your health, happiness, and peace of mind, allowing you to thrive.",
            "When you reach $age, you’ll gain recognition for your hard work and contributions, whether in your professional life or within your community. $name, this acknowledgment will inspire you to keep pursuing your goals with confidence.",
            "At $age, you’ll make a life-changing decision that will open up new possibilities for your future. $name, this bold move will lead you to greater happiness and satisfaction in both your personal and professional life.",
            "When you turn $age, you’ll finally let go of something that’s been holding you back. $name, this release will give you a renewed sense of freedom and energy, allowing you to embrace new opportunities with open arms.",
            "At $age, you’ll find yourself taking on a meaningful role in your community or workplace. $name, this will be a chance to share your unique skills and ideas, and you’ll be appreciated for your contributions.",
            "When you reach $age, you’ll experience a breakthrough in a personal goal that’s been close to your heart. $name, this will be a year of transformation, bringing fulfillment and pride as you see your efforts pay off.",
            "At $age, you’ll prioritize your mental and emotional health in ways you haven’t before. $name, this focus on self-care will bring you greater balance and peace, making this year one of healing and inner growth.",
            "When you turn $age, you’ll embark on a new career path or project that aligns perfectly with your passions. $name, this will be the moment you’ve been waiting for, where your hard work meets opportunity, leading to success.",
            "At $age, you’ll finally make time for that creative pursuit you’ve been dreaming about. $name, whether it’s writing, painting, or crafting, this will be the year you bring your vision to life, filling you with joy and accomplishment.",
            "When you reach $age, you’ll find yourself building stronger connections with the people who matter most to you. $name, these relationships will deepen, bringing more love, support, and happiness into your life.",
            "At $age, you’ll discover a new passion for learning, whether through taking up a course or exploring a new subject. $name, this intellectual curiosity will lead you to personal growth and a new sense of fulfillment.",
            "When you turn $age, you’ll achieve a financial goal you’ve been working toward. $name, whether it’s saving for something special or reaching financial independence, this year will mark a major step forward in your financial journey.",
            "At $age, you’ll experience a turning point in your personal growth. $name, this will be the year when you truly embrace who you are and what you want, leading to a more confident and empowered version of yourself.",
            "When you reach $age, you’ll take up a new hobby or activity that brings joy and balance to your life. $name, this new interest will not only bring relaxation but also inspire creativity and new friendships.",
            "At $age, you’ll finally take that trip you’ve always dreamed of. $name, this adventure will leave you with unforgettable memories and a renewed sense of wonder and curiosity about the world.",
            "When you turn $age, you’ll make a decision that improves your overall health and well-being. $name, whether it’s adopting a new routine or making healthier choices, this change will have a lasting positive impact on your life.",
            "At $age, you’ll step into a role of leadership or responsibility that you’ve been preparing for. $name, your hard work and dedication will be recognized, and you’ll thrive in this new challenge.",
            "When you reach $age, you’ll accomplish something you once thought was impossible. $name, this achievement will show you the strength and resilience you possess, inspiring you to keep pushing forward.",
            "At $age, you’ll feel more connected to your purpose than ever before. $name, whether through your career, relationships, or personal endeavors, this year will give you clarity and direction in your life’s path.",
            "When you turn $age, you’ll find joy in simplifying your life, focusing on the things that truly matter to you. $name, this shift will bring a sense of peace and contentment, allowing you to fully appreciate the present moment.",
            "At $age, you’ll take a major step toward achieving a lifelong goal. $name, this year will mark significant progress, and you’ll feel proud of the dedication and effort you’ve put in to get closer to your dreams.",
            "When you reach $age, you’ll gain a sense of recognition or accomplishment for something you’ve worked on for years. $name, this validation will encourage you to keep striving and pushing your boundaries, knowing your efforts are paying off.",
            "At $age, you’ll find yourself excelling in an area you once felt unsure about. $name, this newfound confidence and expertise will help you grow, allowing you to approach life with more clarity and purpose.",
            "When you turn $age, a new opportunity will come your way that allows you to follow your passion. $name, this chance will spark creativity and excitement, leading to new and fulfilling experiences.",
            "At $age, you’ll finally achieve a balance between work and play. $name, you’ll feel more in control of your time and energy, allowing you to enjoy both your professional success and personal joys.",
            "When you reach $age, you’ll complete a personal project that has been close to your heart for years. $name, this accomplishment will fill you with pride and inspire you to pursue even bigger dreams.",
            "At $age, you’ll let go of a limiting belief that has held you back for too long. $name, this mental shift will open doors to new opportunities and bring a sense of empowerment that transforms your life.",
            "When you turn $age, you’ll embrace a new role in your life, whether it’s a promotion, leadership position, or personal responsibility. $name, this transition will showcase your talents and help you grow even further.",
            "At $age, you’ll experience a deep personal transformation that makes you feel more in tune with yourself. $name, this year will be about self-discovery and becoming the person you’ve always wanted to be.",
            "When you reach $age, you’ll finally take the time to focus on your health and well-being. $name, this year will be about nurturing yourself, leading to a stronger, healthier, and happier you.",
            "At $age, you’ll deepen your connections with the people who matter most in your life. $name, this year will be filled with love and support from family and friends, enriching your personal relationships.",
            "When you turn $age, you’ll start a journey of personal development that transforms how you approach your goals. $name, this growth will help you overcome challenges and set you up for future success.",
            "At $age, you’ll accomplish something that’s been on your mind for a long time. $name, whether it’s related to your career, a personal project, or a relationship, this success will be a turning point for you.",
            "When you reach $age, you’ll finally feel the sense of stability you’ve been striving for. $name, this year will bring security, peace, and contentment as you establish the foundations of a more balanced life.",
            "At $age, you’ll make a decision that brings positive change into your daily life. $name, this choice will lead to healthier habits, more fulfilling routines, and a happier outlook on life.",
            "When you turn $age, you’ll embrace a new adventure, whether it’s through travel, learning, or meeting new people. $name, this experience will expand your horizons and bring excitement to your life.",
            "At $age, you’ll find yourself on the receiving end of unexpected gratitude or recognition. $name, this acknowledgment of your efforts will motivate you to keep striving and aiming for greater things.",
            "When you reach $age, you’ll focus on mastering a skill you’ve always wanted to improve. $name, this dedication to learning will pay off, leaving you with a sense of achievement and pride in your progress.",
            "At $age, you’ll make a meaningful change in your career or lifestyle that brings a sense of fulfillment. $name, this shift will realign your priorities and lead to greater satisfaction in all areas of your life.",
            "When you turn $age, you’ll finally take time to pursue a personal passion or project that you’ve put off. $name, this year will be about focusing on what truly makes you happy and following your heart.",
            "At $age, you’ll experience a deep sense of gratitude for everything you’ve achieved. $name, this reflection on your journey will fill you with pride and motivate you to continue reaching for new heights.",
            "When you reach $age, you’ll discover a new source of inspiration that brings fresh energy into your life. $name, this spark will motivate you to chase your dreams with even more determination.",
            "At $age, you’ll find yourself rediscovering an old passion that brings joy back into your life. $name, this return to something you once loved will spark creativity and excitement, reminding you of the power of following your heart.",
            "When you turn $age, you’ll reach a milestone in your personal life that brings deep fulfillment. $name, whether it’s a relationship, a family goal, or something you’ve been nurturing, this achievement will fill you with pride and happiness.",
            "At $age, you’ll finally feel at peace with a decision you’ve been pondering for a long time. $name, this sense of clarity will open new doors and give you the confidence to move forward with purpose.",
            "When you reach $age, you’ll be recognized for your leadership and influence in a way you didn’t expect. $name, this acknowledgment will inspire you to continue making a positive impact in the lives of those around you.",
            "At $age, you’ll embrace a new way of thinking that transforms how you approach your goals. $name, this mindset shift will bring more focus, productivity, and success into your life.",
            "When you turn $age, you’ll finally make time for a project or hobby that you’ve been putting off. $name, this creative outlet will bring relaxation and fulfillment, giving you a sense of balance in your life.",
            "At $age, you’ll form a new relationship or friendship that deeply enriches your life. $name, this connection will bring positivity, laughter, and support, making this year one of warmth and companionship.",
            "When you reach $age, you’ll finally accomplish something you once thought was out of reach. $name, this achievement will fill you with confidence and remind you of the power of perseverance.",
            "At $age, you’ll experience a year of great personal growth as you step out of your comfort zone. $name, this period of challenge and change will reveal your strength and lead you to new opportunities.",
            "When you turn $age, you’ll finally complete a project that you’ve been working on for years. $name, this accomplishment will bring a deep sense of satisfaction, knowing you stayed committed to your vision.",
            "At $age, you’ll experience a breakthrough in your health and well-being. $name, whether it’s a new fitness routine, healthy habit, or mental shift, this year will make you feel stronger, more energized, and in control.",
            "When you reach $age, you’ll find yourself reconnecting with people or places that shaped who you are. $name, this reflection on your past will bring a renewed sense of appreciation for your journey and the lessons learned.",
            "At $age, you’ll take the lead on a project or initiative that brings you recognition. $name, your ability to inspire others and achieve results will set you apart, opening up new doors of opportunity.",
            "When you turn $age, you’ll finally achieve a personal goal related to your finances. $name, this milestone will give you greater freedom and peace of mind, allowing you to focus on what truly matters.",
            "At $age, you’ll embrace a new lifestyle that brings more harmony and balance into your life. $name, this positive change will not only benefit your health but also your happiness and overall sense of well-being.",
            "When you reach $age, you’ll make a decision that positively impacts your future, setting you on a path to long-term success. $name, this choice will be one of the most important you make, and you’ll feel empowered by the outcome.",
            "At $age, you’ll find yourself exploring new interests that bring joy and fulfillment. $name, this will be a year of discovery, where you pursue hobbies, experiences, or learning that enrich your life in unexpected ways.",
            "When you turn $age, you’ll take an important step toward building something that will have a lasting impact. $name, whether it’s a project, a relationship, or a cause, your efforts will leave a mark that benefits others.",
            "At $age, you’ll experience a year of growth in your personal relationships. $name, whether it’s strengthening existing bonds or forming new connections, this will be a time of deepening trust and support.",
            "When you reach $age, you’ll finally make a change in your routine that enhances your productivity and focus. $name, this shift will help you achieve more with less stress, making your days more fulfilling and rewarding.",
            "At $age, you’ll make a bold decision that steers your life in an exciting new direction. $name, this choice will bring newfound purpose and opportunity, and you’ll look back on it as a turning point.",
            "When you turn $age, you’ll finally find the balance between your personal and professional life that you’ve been seeking. $name, this year will bring more peace and fulfillment, allowing you to enjoy both work and play.",
            "At $age, you’ll take on a new challenge that helps you unlock your full potential. $name, this experience will push you beyond your limits, revealing strengths you never knew you had.",
            "When you reach $age, you’ll feel more connected to yourself and your goals than ever before. $name, this clarity will guide you through important decisions, leading to a more focused and intentional life.",
            "At $age, you’ll reach a milestone that brings you closer to a lifelong dream. $name, this achievement will show you how far you’ve come and inspire you to keep pursuing your passions with determination.",
            "When you turn $age, you’ll deepen your relationship with someone important in your life. $name, this connection will bring joy, understanding, and support, enriching your personal world.",
            "At $age, you’ll discover a new way to improve your daily life. $name, this positive change—whether in your routine, habits, or mindset—will increase your happiness and productivity.",
            "When you reach $age, you’ll find yourself in a position to help others in a meaningful way. $name, whether through mentoring, volunteering, or simply offering support, this will bring fulfillment and joy.",
            "At $age, you’ll embark on a personal project that you’ve been dreaming about for years. $name, this will be the year you take action, bringing your vision to life and feeling a deep sense of accomplishment.",
            "When you turn $age, you’ll focus on your health in a way that leads to long-term benefits. $name, this year will be about creating healthy habits that make you feel stronger and more vibrant.",
            "At $age, you’ll experience a breakthrough in a personal or professional challenge. $name, this victory will give you a renewed sense of confidence, proving that perseverance leads to success.",
            "When you reach $age, you’ll reconnect with your creative side. $name, this artistic or imaginative pursuit will bring you joy and a sense of self-expression that adds balance to your life.",
            "At $age, you’ll make a change in your environment—whether it’s redecorating, relocating, or creating a personal space—that brings comfort and inspiration. $name, this will become your sanctuary for rest and creativity.",
            "When you turn $age, you’ll feel more grounded in your relationships, understanding what you need from others and what you can give. $name, this clarity will help you build stronger, more fulfilling connections.",
            "At $age, you’ll take a leap of faith that brings exciting rewards. $name, this will be a year where your bravery leads to new opportunities and experiences that shape your future in unexpected ways.",
            "When you reach $age, you’ll achieve a long-term financial goal. $name, this milestone will provide security and freedom, allowing you to focus more on what brings you joy.",
            "At $age, you’ll embrace a new interest or hobby that adds more meaning to your life. $name, this passion will bring fulfillment and open up new opportunities for creativity and learning.",
            "When you turn $age, you’ll realize the importance of taking care of your mental well-being. $name, this will be the year you focus on mindfulness, self-care, and emotional balance, creating a healthier mindset.",
            "At $age, you’ll make a significant decision that sets you on a new path, both personally and professionally. $name, this will bring a sense of excitement and renewal as you embrace the changes ahead.",
            "When you reach $age, you’ll celebrate a major personal achievement, something you’ve been working toward for years. $name, this moment will fill you with pride and remind you of the power of persistence.",
            "At $age, you’ll take a major step toward fulfilling a dream you’ve held for years. $name, this progress will fill you with excitement and confidence as you realize how close you are to achieving your deepest desires.",
            "When you turn $age, you’ll form a new habit that enhances your well-being. $name, this positive change—whether related to health, mindfulness, or productivity—will become a cornerstone of your daily life.",
            "At $age, you’ll reconnect with someone who plays a pivotal role in your future success. $name, this renewed relationship will bring support, guidance, and opportunities that help you grow in ways you didn’t expect.",
            "When you reach $age, you’ll embrace a challenge that tests your limits. $name, this experience will reveal your strength and resilience, and you’ll come out of it with a newfound sense of accomplishment.",
            "At $age, you’ll find yourself surrounded by a new community of people who inspire and support you. $name, this year will bring new friendships and connections that help you thrive both personally and professionally.",
            "When you turn $age, you’ll discover a passion that you never knew you had. $name, this new interest will add excitement and purpose to your life, and you’ll wonder how you ever lived without it.",
            "At $age, you’ll finally take the leap and make a major life change you’ve been considering. $name, this decision will bring a fresh start, filling you with renewed energy and optimism for the future.",
            "When you reach $age, you’ll complete a goal that once felt out of reach. $name, this achievement will remind you of your capability and persistence, and it will motivate you to set even bigger goals.",
            "At $age, you’ll gain recognition for your efforts in a way that surprises you. $name, whether it’s at work, in your community, or among your loved ones, this appreciation will validate all the hard work you’ve put in.",
            "When you turn $age, you’ll develop a deeper sense of gratitude for the life you’ve built. $name, this year will be about appreciating the journey, celebrating your progress, and looking forward to the future with hope.",
            "At $age, you’ll make a bold decision that changes the course of your career or personal life. $name, this choice will open up new paths and bring exciting opportunities that take you to the next level.",
            "When you reach $age, you’ll focus on improving your emotional intelligence, leading to stronger and more meaningful relationships. $name, this growth will enhance how you connect with others and bring deeper understanding.",
            "At $age, you’ll experience a year of unexpected joy, as new opportunities and surprises come your way. $name, this will be a time of positivity and growth, where everything seems to fall into place.",
            "When you turn $age, you’ll make an important choice that improves your long-term happiness. $name, this decision—whether related to your lifestyle, career, or personal life—will create a ripple effect of positive changes.",
            "At $age, you’ll step into a leadership role that allows you to guide and inspire others. $name, this will be a year of growth and influence, where your ideas and direction make a real impact.",
            "When you reach $age, you’ll prioritize self-care in a way that enhances your overall well-being. $name, this focus on your mental, emotional, and physical health will lead to long-lasting improvements in your quality of life.",
            "At $age, you’ll feel a newfound sense of independence as you take control of your future. $name, this year will be about standing on your own two feet, confidently pursuing what you want without hesitation.",
            "When you turn $age, you’ll achieve a balance between your personal and professional life that brings you peace. $name, this harmony will allow you to enjoy your successes while still making time for what matters most.",
            "At $age, you’ll discover a talent or skill that you didn’t realize you had. $name, this discovery will open up new possibilities, giving you a sense of pride and excitement about where this newfound ability can take you.",
            "When you reach $age, you’ll finally let go of something that has been holding you back. $name, this release will bring a wave of relief and freedom, allowing you to embrace the future with a lighter heart and a clearer mind.",
            "At $age, you’ll feel more aligned with your personal values than ever before. $name, this year will bring clarity about what truly matters to you, helping you focus on what brings you joy and fulfillment.",
            "When you turn $age, you’ll finally find the courage to pursue something you’ve always wanted. $name, whether it’s a dream career, a bold move, or a personal goal, this leap will fill you with excitement and possibility.",
            "At $age, you’ll make a lifestyle change that drastically improves your health and happiness. $name, this decision will bring lasting benefits, helping you feel more energized and balanced in your daily life.",
            "When you reach $age, you’ll receive recognition for your hard work and dedication. $name, whether it’s in your career or personal life, this acknowledgment will validate your efforts and inspire you to continue striving for success.",
            "At $age, you’ll discover a new sense of peace and contentment. $name, this year will be about appreciating the present moment and letting go of worries about the future, bringing a calmness that enhances your life.",
            "When you turn $age, you’ll accomplish a personal goal that has been in the back of your mind for years. $name, this achievement will give you a sense of closure and pride, reminding you of your strength and perseverance.",
            "At $age, you’ll find joy in simplifying your life. $name, this shift toward minimalism—whether in your environment, habits, or mindset—will bring more clarity, focus, and peace into your daily routine.",
            "When you reach $age, you’ll have the opportunity to travel somewhere new, either physically or emotionally. $name, this journey will open your eyes to new perspectives and experiences, helping you grow in unexpected ways.",
            "At $age, you’ll make a significant step toward a more fulfilling career. $name, this move will align your work with your passions and values, bringing you greater satisfaction and purpose in your professional life.",
            "When you turn $age, you’ll feel a deeper connection to your inner self. $name, this year will be about self-reflection and understanding what you truly need to thrive, allowing you to make choices that support your well-being.",
            "At $age, you’ll finally achieve a financial milestone that brings stability and freedom. $name, whether it’s saving for a big purchase or paying off a long-term debt, this year will give you the financial peace of mind you’ve been working toward.",
            "When you reach $age, you’ll make a decision that brings more balance to your work and personal life. $name, this choice will allow you to spend more time with loved ones and pursue personal interests without compromising your success.",
            "At $age, you’ll discover a new passion or hobby that lights up your life. $name, this interest will bring joy, creativity, and excitement, giving you something new to look forward to every day.",
            "When you turn $age, you’ll finally resolve a long-standing personal issue that has weighed on your mind. $name, this resolution will free you from the past and allow you to move forward with greater peace and confidence.",
            "At $age, you’ll experience a breakthrough in your personal relationships, creating deeper connections with those around you. $name, this year will be about love, understanding, and meaningful communication.",
            "When you reach $age, you’ll find a new source of motivation that propels you toward your biggest dreams. $name, this burst of inspiration will ignite your passion and drive, helping you accomplish more than you ever thought possible.",
            "At $age, you’ll take a chance on something new, and it will pay off in ways you couldn’t have predicted. $name, this risk will lead to exciting changes in your life, proving that stepping outside your comfort zone brings growth.",
            "When you turn $age, you’ll focus on nurturing your mental health and emotional well-being. $name, this year will be about creating a peaceful inner world, leading to greater happiness and resilience.",
            "At $age, you’ll embrace a slower, more mindful approach to life. $name, this change in pace will allow you to savor the small moments, bringing more joy and meaning to your everyday experiences.",
            "When you reach $age, you’ll experience a major personal transformation that changes how you view the world. $name, this shift in perspective will open your eyes to new possibilities, making this year a time of growth and renewal.",
            "At $age, you’ll experience a major breakthrough in your personal growth. $name, this will be the year you overcome a challenge that once felt impossible, and you’ll feel empowered by your strength and resilience.",
            "When you turn $age, you’ll take a leap of faith that leads to unexpected success. $name, this bold decision will open doors you hadn’t imagined, bringing you closer to your dreams and goals.",
            "At $age, you’ll finally make time for that self-care routine you’ve been thinking about. $name, whether it’s through mindfulness, fitness, or relaxation, this year will be about prioritizing your well-being and feeling your best.",
            "When you reach $age, you’ll be surprised by how much you’ve grown emotionally and mentally. $name, this reflection will give you confidence to take on new challenges and embrace your next chapter with excitement.",
            "At $age, you’ll reconnect with a passion you thought you’d left behind. $name, this rediscovery will fill you with joy and remind you of the things that make life truly meaningful.",
            "When you turn $age, you’ll make a bold move that leads to greater financial independence. $name, this decision will put you on the path to long-term security, allowing you to enjoy life with more freedom and ease.",
            "At $age, you’ll finally finish a project you’ve been working on for a long time. $name, this completion will give you a deep sense of accomplishment, proving that persistence and patience always pay off.",
            "When you reach $age, you’ll deepen your relationship with someone close to you. $name, whether it’s a friend, family member, or partner, this connection will grow stronger, bringing more love and understanding into your life.",
            "At $age, you’ll experience a career milestone that takes you to the next level. $name, this success will be the result of your hard work and dedication, and it will open up new opportunities for growth and achievement.",
            "When you turn $age, you’ll find yourself more open to new experiences and ideas. $name, this openness will bring fresh perspectives into your life, making this year one of discovery and excitement.",
            "At $age, you’ll make a decision that positively impacts your mental health. $name, this choice will lead to a more peaceful, balanced state of mind, allowing you to navigate life’s challenges with greater ease.",
            "When you reach $age, you’ll take up a new interest or hobby that brings joy and fulfillment. $name, this passion will spark creativity and give you something to look forward to each day.",
            "At $age, you’ll have the opportunity to travel somewhere you’ve always dreamed of. $name, this adventure will leave you with unforgettable memories and a renewed sense of wonder and appreciation for the world.",
            "When you turn $age, you’ll find yourself feeling more confident and secure in who you are. $name, this self-assurance will help you embrace new opportunities and face challenges with optimism and determination.",
            "At $age, you’ll achieve a personal goal that has been on your mind for a while. $name, whether it’s related to your health, career, or relationships, this success will bring a sense of fulfillment and pride.",
            "When you reach $age, you’ll focus on building stronger connections with the people who matter most. $name, this year will be about nurturing your relationships and surrounding yourself with positivity and love.",
            "At $age, you’ll find yourself stepping out of your comfort zone and trying something new. $name, this bold move will lead to exciting experiences that push you to grow and explore new sides of yourself.",
            "When you turn $age, you’ll make a decision that allows you to prioritize your passions. $name, this shift will bring more joy and satisfaction into your life, giving you the time and space to focus on what truly makes you happy.",
            "At $age, you’ll let go of something that no longer serves you. $name, this release will bring a sense of freedom and peace, making room for new opportunities and experiences in your life.",
            "When you reach $age, you’ll achieve a balance between your professional ambitions and personal life. $name, this harmony will help you feel more grounded and fulfilled as you pursue your dreams without losing sight of what matters most.",

            "Please go back and try again."
        )

        val randomIndex = Random.nextInt(0, 198)

        binding.outputText.text = predictions[randomIndex]

        binding.goBackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}