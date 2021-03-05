package by.example.adaptorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class GridViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)


        val gridView = findViewById<GridView>(R.id.grid_view)

        val personArray = resources.getStringArray(R.array.person_names)

        gridView.adapter = ArrayAdapter(this, R.layout.item_perso_name, personArray)

        gridView.numColumns = 2;

        gridView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@GridViewActivity, personArray[position], Toast.LENGTH_SHORT)
                    .show()


            }
        }

    }
}