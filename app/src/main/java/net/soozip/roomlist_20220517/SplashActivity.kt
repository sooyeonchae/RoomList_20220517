package net.soozip.roomlist_20220517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //2초 정도 후에 (지연 시킨 후에) 화면 이동
        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            finish() //새 화면 띄우고 현 화면 종료.
        }, 2000)


    }
}