package by.example.adaptorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)


        val button = findViewById<Button>(R.id.button_inflate)

        button.setOnClickListener {
            val myFragment = FirstFragment()

            supportFragmentManager.beginTransaction().replace(R.id.frame_container, myFragment).commit()


        }
    }
}