package edu.student.week6

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spin = findViewById<Spinner>(R.id.spinner)
        val txtDay = findViewById<EditText>(R.id.txtDay)
        val txtYear = findViewById<EditText>(R.id.txtYear)
        val txtShow = findViewById<TextView>(R.id.txtShow)
        val btnSub = findViewById<Button>(R.id.btnSubmit)
        val list = arrayOf ("January", "February", "March", "April", "May", "June"
            , "July", "August", "September", "October", "November", "December")
        val adapter1 = ArrayAdapter <String> (this, android.R.layout.simple_spinner_item, list)
        android.R.layout.simple_spinner_item
        android.R.layout.simple_spinner_dropdown_item
        spin.adapter = adapter1
        btnSub.setOnClickListener{
            when (spin.selectedItem.toString()){
                "January" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, January ${txtYear.text.toString()}"
                "February" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, February ${txtYear.text.toString()}"
                "March" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, March ${txtYear.text.toString()}"
                "April" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, April ${txtYear.text.toString()}"
                "May" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, May ${txtYear.text.toString()}"
                "June" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, June ${txtYear.text.toString()}"
                "July" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, July ${txtYear.text.toString()}"
                "August" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, August ${txtYear.text.toString()}"
                "September" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, September ${txtYear.text.toString()}"
                "October" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, October ${txtYear.text.toString()}"
                "November" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, November ${txtYear.text.toString()}"
                "December" -> txtShow.text = "Hello, you're birthday is:  ${txtDay.text.toString()}, December ${txtYear.text.toString()}"
            }
            hideKeyboard()
        }

        //Fire hidekeyboard when user taps outside any text object
//Place below code right before last right bracket in function onCreate
        findViewById<View>(android.R.id.content).setOnTouchListener { _, event ->
            hideKeyboard()
            false
        }
    }
    // function to hide keyboard goes right before the last right bracket of Class MainActivity
//import android.content.Context
//import android.view.inputmethod.InputMethodManager
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }
    }
}
