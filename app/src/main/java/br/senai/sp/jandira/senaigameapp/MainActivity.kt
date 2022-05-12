package br.senai.sp.jandira.senaigameapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import br.senai.sp.jandira.senaigameapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater);

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.searchButton.setOnClickListener{
            val intent = Intent(this, SearchResultActivity::class.java)
            startActivity(intent)
        }
    }
}