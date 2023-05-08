package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    private val eios : String = "IOS"
    private var decisao: String? = null
    private var buttonState: ButtonState = ButtonState.ANDROID_VALUE


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickToggleButton()
    }

    fun clickToggleButton() {
        decisao = binding.escolha.text.toString()
        binding.buttonios.setOnClickListener {
            binding.escolha.text = eios
                }
        binding.buttonandroid.setOnClickListener{
            binding.escolha.text = decisao
            }
            }
        }