package net.pside.android.recyclerview_wrapcontent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_wrap_content.*
import net.pside.android.recyclerview_wrapcontent.adapter.MyRecyclerAdapter

class WrapContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrap_content)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerAdapter(intent.getIntExtra("amount", 0))

        // TODO: workaround fix
//        Handler().postDelayed({
//            scrollView.scrollTo(0, 0)
//        }, 50)
    }
}