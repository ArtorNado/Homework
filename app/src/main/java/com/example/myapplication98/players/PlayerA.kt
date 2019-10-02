package com.example.myapplication98.players

class PlayerA: Player {
    override val name = "Леха со двора"
    override val age = 20
    override val pace = 50
    override val pass = 60
    override val shoot = 50
    override fun rait() = (pace+pass+shoot)/3

    override fun celebrateGoal() = "Пацаны, я не устану повторять..."

    fun diamondEye() = pass*3




}