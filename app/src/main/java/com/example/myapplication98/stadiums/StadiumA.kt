package com.example.myapplication98.stadiums

class StadiumA: Stadium {

    override val title = "Emirates Stadiums"
    override val roofType = "Open"
    override var numOfBuffet = 10
    override var numOfParkingPlace = 15000
    override var numOfSeats = 62000
    val raiting = 0.0


    var support = ArrayList<String>()
        set(value) {
            field = value
        }
        get() = field

    override fun rait(){
        if(numOfBuffet > 7) raiting+1
        else if(numOfBuffet > 3) raiting+0.5
        if (numOfSeats > 50000) raiting+1
        else if(numOfSeats >20000) raiting+0.5
    }

    override fun upgrade1(){
        numOfSeats += 7000
        numOfParkingPlace += 1000
        numOfBuffet += 2
    }

    override fun upgrade2(){
        numOfSeats += 12000
        numOfParkingPlace += 2000
        numOfBuffet += 4
    }

    override fun fansupport() {
        support.add("Пацаны, я не устану повторять... Спартак")
    }
}