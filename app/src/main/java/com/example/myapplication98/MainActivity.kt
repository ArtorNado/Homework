package com.example.myapplication98

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication98.clubAtribute.Squad

class MainActivity : AppCompatActivity() {

    val squad: Squad = Squad()

    inline fun logd(text: String){
        Log.d("TAG", text)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*textView.setText((squad.players.size).toString())*/
        setContentView(R.layout.activity_main)
    }

    fun goTeam(view: View){
        val intent =  Intent(this,TeamActivity::class.java)
        logd("Переход к списку игроков")
        startActivity(intent)
    }

    fun goClub(view: View){
        val intent = Intent(this,StadiumActivity::class.java)
        logd("Переход к списку клубов")
        startActivity(intent)
    }

    fun goUpgrade(view: View){
        val intent = Intent(this,UpdateActivity::class.java)
        logd("Переход к улучшениям")
        startActivity(intent)
    }
}
