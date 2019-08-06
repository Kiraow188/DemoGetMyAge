package sg.edu.rp.c347.demogetmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            var userDOB = etDOB.text.toString()
            if (userDOB.isNotEmpty()) {

                var year = Calendar.getInstance().get(Calendar.YEAR)
                var age = year - userDOB.toInt()

                var output = ""
                //if < method
                /*
                if (age < 18){
                    output = "Underage"
                } else if (age < 66){
                    output = "Young People"
                } else if (age < 80){
                    output = "Middle-aged"
                } else if (age < 100){
                    output = "Elderly"
                } else{
                    output = "Long-lived elderly"
                }*/

                //if in range method
                /*
                if (age < 18){
                    output = "Underage"
                } else if (age in 18..65){
                    output = "Young People"
                } else if (age in 66..79){
                    output = "Middle-aged"
                } else if (age in 80..99){
                    output = "Elderly"
                } else{
                    output = "Long-lived elderly"
                }*/

                //when method similar to switch method in java
                when (age){
                    in 0..17 -> output = "Underage"
                    in 18..65 -> output = "Young People"
                    in 66..79 -> output = "Middle-aged"
                    in 80..99 -> output = "Elderly"
                    else -> {
                        output = "Long-lived elderly"
                    }
                }

                tvShowAge.text = "Your age is $age \n $output"

            }else{
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_LONG).show()
            }
        }
    }
}
