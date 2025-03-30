package com.example.appbible

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.TextView

class BibleListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bible_list)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewBooks)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Dados mockados dos livros da Bíblia
        val bibleBooks = listOf(
            "Gênesis", "Êxodo", "Levítico", "Números", "Deuteronômio",
            "Josué", "Juízes", "Rute", "1 Samuel", "2 Samuel",
            // Adicione mais livros conforme necessário
            "Mateus", "Marcos", "Lucas", "João"
        )

        recyclerView.adapter = BibleAdapter(bibleBooks)
    }
}

// Adapter para o RecyclerView
class BibleAdapter(private val books: List<String>) :
    RecyclerView.Adapter<BibleAdapter.ViewHolder>() {

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false) as TextView
        return ViewHolder(textView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = books[position]
    }

    override fun getItemCount() = books.size
}