package com.example.alunos_rm92957_rm99996
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventoAdapter(private val eventos: MutableList<Evento>) :
    RecyclerView.Adapter<EventoAdapter.EventoViewHolder>() {

    inner class EventoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvLocal = itemView.findViewById<TextView>(R.id.tvLocal)
        val tvTipo = itemView.findViewById<TextView>(R.id.tvTipo)
        val tvImpacto = itemView.findViewById<TextView>(R.id.tvImpacto)
        val tvData = itemView.findViewById<TextView>(R.id.tvData)
        val tvPessoas = itemView.findViewById<TextView>(R.id.tvPessoas)
        val btnExcluir = itemView.findViewById<Button>(R.id.btnExcluir)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_evento, parent, false)
        return EventoViewHolder(view)
    }

    override fun getItemCount(): Int = eventos.size

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        val evento = eventos[position]
        holder.tvLocal.text = evento.local
        holder.tvTipo.text = evento.tipo
        holder.tvImpacto.text = evento.impacto
        holder.tvData.text = evento.data
        holder.tvPessoas.text = "Pessoas afetadas: ${evento.pessoasAfetadas}"

        holder.btnExcluir.setOnClickListener {
            eventos.removeAt(position)
            notifyItemRemoved(position)
        }
    }
}
