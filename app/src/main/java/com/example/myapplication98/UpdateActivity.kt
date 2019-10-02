package com.example.myapplication98

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication98.clubAtribute.Stadiums
import com.example.myapplication98.stadiums.Stadium
import com.example.myapplication98.stadiums.StadiumA
import kotlinx.android.synthetic.main.activity_update.*

class UpdateActivity : AppCompatActivity() {
    val stadiumA: StadiumA = StadiumA()
    val myStadiums: Stadiums = Stadiums()

    inline fun logd(text: String){
        Log.d("TAG", text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        /*if(myStadiums.allMyStadiums.size > 0) setStadium()*/ // Не успел добавить сохранение после
        // смены активити, поэтому список каждый раз пустой
        setStadium()
        logd("size "+ myStadiums.allMyStadiums.size)
        addListennerOnButton()
    }

    fun upgradeStadiumA(){
        stadiumA.upgrade1()
    }

    fun setStadium(){
        textView2.setText(""+stadiumA.title+"\n")
    }

    fun  addListennerOnButton(){
        btn_upgrade.setOnClickListener{
            upgradeStadiumA()
            Log.d("TAG", "Стадион улучшен")}
    }
}
