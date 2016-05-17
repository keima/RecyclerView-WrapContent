package net.pside.android.recyclerview_wrapcontent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        matchParentButton.setOnClickListener(this)
        wrapContentButton.setOnClickListener(this)
        wrapContentScrollViewButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val amount = discreteSeekBar.progress
        val isWait = checkBox.isChecked

        when (v) {
            matchParentButton ->
                navigate<MatchParentActivity>(amount, isWait)
            wrapContentButton ->
                navigate<WrapContentActivity>(amount, isWait)
            wrapContentScrollViewButton ->
                navigate<WrapContentScrollViewActivity>(amount, isWait)
        }
    }
}