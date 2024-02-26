package ru.easycode.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.easycode.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = (application as ProvideViewModel).viewModel()

        viewModel.liveData.observe(this) {
            binding.mainTextView.text = it
        }

        viewModel.load()
    }
}