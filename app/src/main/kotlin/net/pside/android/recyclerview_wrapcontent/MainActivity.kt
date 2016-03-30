package net.pside.android.recyclerview_wrapcontent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        matchParentButton.setOnClickListener({
            startActivity(Intent(this, MatchParentActivity::class.java))
        })

        wrapContentButton.setOnClickListener({
            startActivity(Intent(this, WrapContentActivity::class.java))
        })
    }
}