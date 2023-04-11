package br.com.fiap.chatgptdashopee.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.chatgptdashopee.R
import br.com.fiap.chatgptdashopee.databinding.ActivityAnswersBinding

class AnswersActivity : AppCompatActivity() {
    lateinit var binding: ActivityAnswersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnswersBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun callImplicitIntent(messageValue: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(
                Intent.EXTRA_TEXT,
                messageValue
            )
        }

        val shareIntent = Intent.createChooser(
            sendIntent,
            getString(R.string.chooser_title)
        )

        startActivity(shareIntent)
    }
}