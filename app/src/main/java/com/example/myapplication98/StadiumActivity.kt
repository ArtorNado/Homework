package com.example.myapplication98

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication98.clubAtribute.Stadiums
import com.example.myapplication98.stadiums.StadiumA
import kotlinx.android.synthetic.main.activity_club.*

class StadiumActivity : AppCompatActivity() {

    val stadiumA: StadiumA = StadiumA()
    val stadium: Stadiums = Stadiums()

    inline fun logd(text: String){
        Log.d("TAG", text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_club)
        setStadium()
        addListennerOnButton()
    }

    fun setStadium(){
        club_a.setText("title "+stadiumA.title+"\n"+
                "roof type "+ stadiumA.roofType+"\n"+
                "buffet "+stadiumA.numOfBuffet+"\n"+
                "parking "+stadiumA.numOfParkingPlace+"\n"+
                "sets  "+stadiumA.numOfSeats+"\n")
    }

    fun  addListennerOnButton(){
        btn_clubA.setOnClickListener{
            stadium.allMyStadiums.add(stadiumA)
            logd("Стадион добавлен в клуб")
        }
    }

}
