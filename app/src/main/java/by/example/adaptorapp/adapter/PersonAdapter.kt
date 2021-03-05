package by.example.adaptorapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import by.example.adaptorapp.R
import by.example.adaptorapp.entity.Person
import com.bumptech.glide.Glide

class PersonAdapter(val list: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

        val firstName = holder.itemView.findViewById<TextView>(R.id.item_first_name)
        val lastName = holder.itemView.findViewById<TextView>(R.id.item_last_name)
        val photo = holder.itemView.findViewById<ImageView>(R.id.item_image_view)

        firstName.text = list[position].firstName
        lastName.text = list[position].lastName
        Glide.with(holder.itemView.context).load(list[position].photoUrl).into(photo)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}