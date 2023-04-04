package br.com.fiap.chatgptdashopee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.chatgptdashopee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setupButton()
    }

    private fun setupButton() {
        binding.buttonGoToChat.setOnClickListener{

            startActivity(
                Intent(
                    this,
                    ChatActivity::class.java
                )
            )

        }
    }
}