package com.example.myapplication98.players

class PlayerOnePuch: Player {

    override val name = "One puch man"
    override val age = 20
    override val pace = 50
    override val pass = 60
    override val shoot = 100
    override fun rait() = (pace+pass+shoot)/3

    override fun celebrateGoal() = "Oooone PUCH"

    fun superShot() = shoot*999


}