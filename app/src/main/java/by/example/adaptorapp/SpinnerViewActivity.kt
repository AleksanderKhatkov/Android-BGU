package by.example.adaptorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class SpinnerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_view)

        val spinnerView = findViewById<Spinner>(R.id.spinner_view)

        val personArray = resources.getStringArray(R.array.person_names)

        spinnerView.adapter = ArrayAdapter(this, R.layout.item_perso_name, personArray)

        spinnerView.onItemSelectedListener =
            object : AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {
                override fun onItemClick(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long) {
                }


                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long) {

                    Toast.makeText(this@SpinnerViewActivity, personArray[position], Toast.LENGTH_SHORT)
                        .show()

                }


                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
    }
}