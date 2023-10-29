package com.selva.newsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.selva.newsapp.R
import com.selva.newsapp.ui.NewsActivity
import com.selva.newsapp.ui.NewsViewModel

class BreakingNewsFragment: Fragment(R.layout.fragment_bracking_news) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}