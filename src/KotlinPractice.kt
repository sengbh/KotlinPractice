class KotlinPractice {
    var name: String = "Bob"
    var number: Int = 1000

    fun InsideClass(){
        println("print $name")
    }

    inner class SomeClass() {
        var name2: String = "TEST"
        var number2: Int = 12
        fun InsideClass(){
            println("$name2 has something of number $number2")
        }
    }
}

fun main(args: Array<String>){
    var obj = KotlinPractice().SomeClass()
    obj.InsideClass()
}