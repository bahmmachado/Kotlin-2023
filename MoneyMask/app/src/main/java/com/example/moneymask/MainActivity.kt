package com.example.moneymask

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moneymask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    Uma forma de criar as variáveis.
//    val toggleButton: Button = findViewById(R.id.toggle_button)
//    val moneyCurrency: TextView = findViewById(R.id.money_currency)
//    val moneyValue: TextView = findViewById(R.id.money_value

    lateinit var binding: ActivityMainBinding
    private val mask: String = "*******"
    private var value: String? = null
    private var buttonState: ButtonState = ButtonState.HIDE_VALUE
//    private var isShowing: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        toggleButton.setText("Teste")
//        moneyCurrency.setText("Teste")
//        moneyValue.setText("Teste")
//        toggle_button.setText("Teste")
//        money_currency.setText("Teste")
//        money_value.setText("Teste")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickToggleButton()
    }

    fun clickToggleButton() {
        value = binding.moneyValue.text.toString()
        binding.toggleButton.setOnClickListener {
            when (buttonState) {
                ButtonState.HIDE_VALUE -> {
                    binding.moneyValue.text = mask
                    buttonState = ButtonState.SHOW_VALUE
                }
                ButtonState.SHOW_VALUE -> {
                    binding.moneyValue.text = value
                    buttonState = ButtonState.HIDE_VALUE
                }
            }
            binding.toggleButton.text = getString(buttonState.buttonTextResId)
//            if(isShowing) {
//              binding.moneyValue.text = value
//              isShowing = false
//            } else {
//            binding.moneyValue.text = mask
//            isShowing = true
//        }
//            binding.toggleButton.text = if(isShowing) {
//              getString(R.string.show_button_label)
//            } else {
//                  getString(R.string.hide_button_label)
//            }
        }
    }
}