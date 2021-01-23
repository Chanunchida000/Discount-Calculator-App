package th.ac.su.ict.chanunchida.discountcalculator

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


        val ori = findViewById<EditText>(R.id.ori)
        val percent = findViewById<EditText>(R.id.per)
        val checkbox = findViewById<CheckBox>(R.id.box)
        val btnCal = findViewById<Button>(R.id.Cal)
        val price = findViewById<TextView>(R.id.price)



        btnCal.setOnClickListener() {
            var origin: Double = ori.text.toString().toDouble()
            var percen: Int = percent.text.toString().toInt()
            if (checkbox.isChecked) {
                var discount = origin * percen / 100;
                var total = origin - discount;
                var tax = total * 7 / 100;
                var totalTax = total + tax;
                price.text = totalTax.toString()
            } else {
                var discount = origin * percen / 100;
                var total = origin - discount;
                price.text = total.toString()
            }
        }


    }
}

