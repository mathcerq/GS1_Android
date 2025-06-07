package com.example.alunos_rm92957_rm99996

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityXML : AppCompatActivity() {

    private lateinit var etLocal: EditText
    private lateinit var etTipo: EditText
    private lateinit var etImpacto: EditText
    private lateinit var etData: EditText
    private lateinit var etPessoas: EditText
    private lateinit var btnIncluir: Button
    private lateinit var btnIdentificacao: Button
    private lateinit var recyclerView: RecyclerView

    private val listaEventos = mutableListOf<Evento>()
    private lateinit var adapter: EventoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ Toast de verificação
        Toast.makeText(this, "App iniciou!", Toast.LENGTH_LONG).show()

        setContentView(R.layout.activity_main_xml)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etLocal = findViewById(R.id.etLocal)
        etTipo = findViewById(R.id.etTipo)
        etImpacto = findViewById(R.id.etImpacto)
        etData = findViewById(R.id.etData)
        etPessoas = findViewById(R.id.etPessoas)
        btnIncluir = findViewById(R.id.btnIncluir)
        btnIdentificacao = findViewById(R.id.btnIdentificacao)
        recyclerView = findViewById(R.id.rvEventos)

        adapter = EventoAdapter(listaEventos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        btnIncluir.setOnClickListener {
            val local = etLocal.text.toString()
            val tipo = etTipo.text.toString()
            val impacto = etImpacto.text.toString()
            val data = etData.text.toString()
            val pessoas = etPessoas.text.toString().toIntOrNull() ?: -1

            if (local.isBlank() || tipo.isBlank() || impacto.isBlank() || data.isBlank() || pessoas <= 0) {
                Toast.makeText(this, "Preencha todos os campos corretamente!", Toast.LENGTH_SHORT).show()
            } else {
                val evento = Evento(local, tipo, impacto, data, pessoas)
                listaEventos.add(evento)
                adapter.notifyItemInserted(listaEventos.size - 1)

                etLocal.text.clear()
                etTipo.text.clear()
                etImpacto.text.clear()
                etData.text.clear()
                etPessoas.text.clear()
            }
        }

        btnIdentificacao.setOnClickListener {
            val intent = Intent(this, IdentificacaoActivity::class.java)
            startActivity(intent)
        }
    }
}
