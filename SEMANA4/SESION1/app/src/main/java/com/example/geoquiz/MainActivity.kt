package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var questions: ArrayList<Question>
    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadQuestions()
        setupViews()
        showSentence()
    }

    fun loadQuestions(){
        questions =ArrayList()
        questions.add(Question("¿Es Lima la capital de Chile?",false))
        questions.add(Question("¿Argentina campeón del mundo?",true))
        questions.add(Question("¿Quito es la capital de Ecuador?",true))
        questions.add(Question("¿Francia es un pais de europa?",true))
        questions.add(Question("¿Brazil es el país más grande de América?",false))
        questions.add(Question("¿El oceano más cercano a Perú, es el Atlántico?",false))

    }


    private fun setupViews(){
        val btYes = findViewById<Button>(R.id.btYes)
        val btNo = findViewById<Button>(R.id.btNo)
        val btNext = findViewById<Button>(R.id.btNext)


        btYes.setOnClickListener{

            if(questions[position].answer)
            {
                Toast.makeText(this,"Correcto",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Incorrecto",Toast.LENGTH_LONG).show()
            }
        }

        btNo.setOnClickListener{
            if(!questions[position].answer)
            {
                Toast.makeText(this,"Correcto",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Incorrecto",Toast.LENGTH_LONG).show()
            }
        }

        btNext.setOnClickListener{
            position++
            showSentence()
        }

    }

    private fun showSentence() {

        val tvSentence = findViewById<TextView>(R.id.tvSentence)

        tvSentence.text = questions[position].sentence
    }

}