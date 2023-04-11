package br.com.fiap.chatgptdashopee.presentation

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.chatgptdashopee.data.TalkDataSource
import br.com.fiap.chatgptdashopee.databinding.ActivityQuestionsBinding
import br.com.fiap.chatgptdashopee.presentation.adapter.QuestionAdapter

class QuestionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewQuestions.adapter = QuestionAdapter(
            TalkDataSource.talkList
        )
    }

    private fun goToAnswersActivity() {
        startActivity(
            Intent(
                this,
                AnswersActivity::class.java
            )
        )
    }
}