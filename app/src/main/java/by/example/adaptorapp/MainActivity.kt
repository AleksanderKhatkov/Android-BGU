package by.example.adaptorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listView = findViewById<Button>(R.id.list_view_button)
        val gridView = findViewById<Button>(R.id.grid_view_button)
        val spinnerView = findViewById<Button>(R.id.spinner_view_button)
        val autocompleteView = findViewById<Button>(R.id.autocomplete_view_button)
        val recyclerView = findViewById<Button>(R.id.recycler_view_button)
        val fragmentsView = findViewById<Button>(R.id.fragment_view_button)

        listView.setOnClickListener(this);
        gridView.setOnClickListener(this);
        spinnerView.setOnClickListener(this);
        autocompleteView.setOnClickListener(this);
        recyclerView.setOnClickListener(this);
        fragmentsView.setOnClickListener(this);
    }

    override fun onClick(view: View) {

        when (view.id) {
            R.id.list_view_button -> {
                val intent = Intent(this, ListViewActivity::class.java)
                startActivity(intent)

            }
            R.id.grid_view_button -> {
                val intent = Intent(this, GridViewActivity::class.java)
                startActivity(intent)
            }
            R.id.spinner_view_button -> {
                val intent = Intent(this, SpinnerViewActivity::class.java)
                startActivity(intent)
            }
            R.id.autocomplete_view_button -> {
                val intent = Intent(this, AutocompleteViewActivity::class.java)
                startActivity(intent)
            }
            R.id.recycler_view_button -> {
                val intent = Intent(this, RecyclerViewActivity::class.java)
                startActivity(intent)

            }
            R.id.fragment_view_button -> {
                val intent = Intent(this, FragmentsActivity::class.java)
                startActivity(intent)

            }
        }
    }
}