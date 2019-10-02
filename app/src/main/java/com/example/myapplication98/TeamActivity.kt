package com.example.myapplication98

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication98.clubAtribute.Squad
import com.example.myapplication98.players.PlayerA
import com.example.myapplication98.players.PlayerOnePuch
import kotlinx.android.synthetic.main.activity_team.*

class TeamActivity : AppCompatActivity() {

    val playerA: PlayerA = PlayerA()
    val playerOnePuch: PlayerOnePuch = PlayerOnePuch()
    val squad: Squad = Squad()


    inline fun logd(text: String){
        Log.d("TAG", text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)
        setPlayersOnTV()
        setPlayersOnTV2()
        addListennerOnButton()
    }

    fun setPlayersOnTV(){
        player_a.setText("name "+playerA.name+"\n"+
        "age "+ playerA.age+"\n"+
        "raiting "+playerA.rait()+"\n")
    }

    fun setPlayersOnTV2(){
        player_a.setText("name "+playerOnePuch.name+"\n"+
                "age "+ playerOnePuch.age+"\n"+
                "raiting "+playerOnePuch.rait()+"\n")
    }

    fun  addListennerOnButton(){
        btn_a.setOnClickListener{
        squad.players.add(playerA)
        logd("Игрок добавлен в клуб")}

        btn_b.setOnClickListener{
            squad.players.add(playerA)
            logd("Игрок добавлен в клуб")}

    }
}
