package com.selva.newsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.selva.newsapp.R
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?): {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}