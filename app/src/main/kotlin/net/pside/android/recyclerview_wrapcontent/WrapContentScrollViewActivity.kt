package net.pside.android.recyclerview_wrapcontent

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_wrap_content_with_scrollview.*
import net.pside.android.recyclerview_wrapcontent.adapter.MyRecyclerAdapter

class WrapContentScrollViewActivity : AppCompatActivity() {

    var adapter: MyRecyclerAdapter? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrap_content_with_scrollview)


        recyclerView.layoutManager = object : LinearLayoutManager(this) {
            override fun canScrollVertically(): Boolean {
                return false;
            }
        }

        val isWait = intent.getBooleanExtra("is_wait", false)
        adapter = MyRecyclerAdapter(if (isWait) 0 else intent.getIntExtra("amount", 0))

        recyclerView.adapter = adapter

        if (isWait) {
            Handler().postDelayed({
                (adapter as MyRecyclerAdapter).amount = intent.getIntExtra("amount", 0)
                (adapter as MyRecyclerAdapter).notifyDataSetChanged()
            }, 3000)
        }
    }
}