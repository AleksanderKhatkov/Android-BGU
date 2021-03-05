package by.example.adaptorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AutocompleteViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete_view)


        val autocompleteView = findViewById<AutoCompleteTextView>(R.id.autocomplete_view)

        val personArray = resources.getStringArray(R.array.person_names)

        autocompleteView.setAdapter(ArrayAdapter(this, R.layout.item_perso_name, personArray))


    }
}