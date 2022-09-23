package jp.techacademy.jongje.kim.l3human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Myhuman = Human("Jongje Kim",40,"DIY")// 名前をJongje Kim、年40歳で、Myhumanのインスタンスを作る

        Myhuman.say()

        Myhuman.think()

        val Myhuman2 = Human("Tester Kim", 41,"Game") // 名前をJongje Kim、年40歳で、Myhuman2のインスタンスを作る

        Myhuman2.say()

        Myhuman2.think()

    }


}