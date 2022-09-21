package jp.techacademy.jongje.kim.l3human


import android.util.Log


open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    var hobby:String= "hobby"


    constructor(name: String, age: Int, hobby: String): super(name, age) {

        this.hobby= hobby
    }


    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "年は" + this.age + "歳です。")
    }

    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby+ "ついて考える。")
    }
}
