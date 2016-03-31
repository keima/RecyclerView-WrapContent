package net.pside.android.recyclerview_wrapcontent

import android.app.Activity
import android.content.Intent

inline fun <reified T : Activity> Activity.navigate(amount: Int) {
    val intent = Intent(this, T::class.java)
    intent.putExtra("amount", amount)

    startActivity(intent)
}