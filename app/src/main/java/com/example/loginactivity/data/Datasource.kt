package com.example.loginactivity.data

import com.example.loginactivity.R
import com.example.loginactivity.model.Fact

class Datasource {
   fun loadFacts() : List<Fact> {
       return listOf<Fact>(
               Fact(R.string.title1, R.string.fact1, R.drawable.kotlin),
               Fact(R.string.title2, R.string.fact2, R.drawable.java),
               Fact(R.string.title3, R.string.fact3, R.drawable.python),
               Fact(R.string.title4, R.string.fact4, R.drawable.javascript),
               Fact(R.string.title5, R.string.fact5, R.drawable.php)
       )
   }
}