package br.senai.sp.jandira.senaigameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senai.sp.jandira.senaigameapp.databinding.ActivitySearchResultBinding

class SearchResultActivity : AppCompatActivity() {
    lateinit var  binding: ActivitySearchResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySearchResultBinding.inflate(layoutInflater);
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.cardGodOfWar2018.setOnClickListener {
            val intent = Intent(this, GameDetailsActivity::class.java);
            startActivity(intent);
        }
    }
}