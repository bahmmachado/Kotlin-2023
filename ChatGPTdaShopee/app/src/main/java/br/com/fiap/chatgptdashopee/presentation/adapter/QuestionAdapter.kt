package br.com.fiap.chatgptdashopee.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.chatgptdashopee.R
import br.com.fiap.chatgptdashopee.data.TalkDataSource.talkList
import br.com.fiap.chatgptdashopee.data.TalkModel
import br.com.fiap.chatgptdashopee.databinding.ViewQuestionItemBinding
import java.text.FieldPosition

class QuestionAdapter(private val talkList: List<TalkModel>) : RecyclerView.Adapter<QuestionAdapter.QuestionViewHolder>() {

    inner class QuestionViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val binding = ViewQuestionItemBinding.bind(itemView)

        fun bind(item: TalkModel) {
            binding.questionTitle.text = item.question
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : QuestionViewHolder {
        return QuestionViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_question_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        holder.bind(talkList[position])
    }

    override fun getItemCount(): Int {
        return talkList.size
    }
}

