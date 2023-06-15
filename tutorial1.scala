object tutorial extends App{

    def area(r:Int) = {
        math.Pi*r*r
    }

    def tofahrenheit(celcius : Double) = {
        celcius*1.8+32
    }

    def volume(radius : Double) = {
        4/3*math.Pi*radius*radius*radius
    }

    def discount(price : Double , number : Int) = {
        price*number*0.4
    }

    def shippingcost(number : Int) = {
        3*50 + (number-50) * 0.75
    }

    def cost(number : Int) = {
        24.95*number - discount(24.95,60) + shippingcost(60)
    }

    def easypace(distance : Int) = {
        distance*8
    }

    def tempo(distance : Int) = {
        distance*7
    }

    def runningtime() = {
        easypace(2) + tempo(3) + easypace(2)
    }

    println("(1) :- " + area(5))
    println("(2) :- " + tofahrenheit(35))
    println("(3) :- " + volume(5))
    println("(4) :- " + cost(60))
    println("(5) :- " + runningtime())
}