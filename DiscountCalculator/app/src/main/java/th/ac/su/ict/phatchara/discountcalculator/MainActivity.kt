package th.ac.su.ict.phatchara.discountcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val origin = findViewById<EditText>(R.id.origin)
        val percent = findViewById<EditText>(R.id.per)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)
        val Cal = findViewById<Button>(R.id.Calcu)
        val price = findViewById<TextView>(R.id.pric)



        Cal.setOnClickListener() {
            var origin: Double = origin.text.toString().toDouble()
            var percen: Int = percent.text.toString().toInt()
            if (checkbox.isChecked) {
                var dis = origin * percen / 100;
                var total = origin - dis;
                var tax = total * 7 / 100;
                var totalTax = total + tax;
                price.text = totalTax.toString()
            } else {
                var dis = origin * percen / 100;
                var total = origin - dis;
                price.text = total.toString()
            }
        }


    }
}

