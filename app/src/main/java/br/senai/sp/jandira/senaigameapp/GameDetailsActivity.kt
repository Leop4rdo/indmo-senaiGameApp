package br.senai.sp.jandira.senaigameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senai.sp.jandira.senaigameapp.databinding.ActivityGameDetailsBinding

class GameDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityGameDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGameDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}