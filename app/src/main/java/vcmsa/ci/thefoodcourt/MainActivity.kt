package vcmsa.ci.thefoodcourt

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var editTime : TextView? = null
    var Morning : EditText? = null
    var aftNoon : EditText? = null
    var nOon : EditText? = null
    var dusk : EditText? = null
    var btnEnter : Button? = null
    var btnDisplay : Button? = null
    var btnReset : Button? = null
    var edtOutput : TextView? = null
    val meal1 = "Morning"
    val meal2 = "Mid-Morning"
    val meal3 = "Afternoon"
    val meal4 = "Mid-Afternoon"
    val meal5 = "Dinner"
    val meal6 = "Dessert"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editTime = findViewById<View>(R.id.edTime) as TextView
        Morning = findViewById<View>(R.id.edMorning) as EditText
        aftNoon = findViewById<View>(R.id.aftNoon) as EditText
        nOon =findViewById<View>(R.id.nOon) as EditText
        dusk = findViewById<View>(R.id.dusk) as EditText
        btnEnter = findViewById<View>(R.id.btnEnter) as Button
        btnDisplay = findViewById<View>(R.id.btnDisplay) as Button
        btnReset = findViewById<View>(R.id.btnReset) as Button
        edtOutput = findViewById<View>(R.id.edtOutput) as TextView

        btnReset!!.setOnClickListener {
            editTime!!.setText(" ")
            edtOutput!!.setText(" ")
        }

        btnEnter!!.setOnClickListener {
            val selected = editTime!!.text.toString()

            if (selected == meal1)
                edtOutput!!.setText("e.g. Omelet")
            else if (selected == meal2)
                edtOutput!!.setText("e.g. Smoothie")
            else if (selected == meal3)
                edtOutput!!.setText("e.g. Burger")
            else if (selected == meal4)
                edtOutput!!.setText("e.g. Ice-cream")
            else if (selected == meal5)
                edtOutput!!.setText("e.g. Tacos")
            else if (selected == meal6)
                edtOutput!!.setText("e.g. Pie")

            else
                print("Input options as shown above")

        }

        edtOutput!!.text = meal1

        btnReset!!.setOnClickListener{
            edtOutput!!.setText(" ")
            editTime!!.setText(" ")

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}