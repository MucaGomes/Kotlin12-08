package `DesafioVagner(ExpressaEmAnos)`

fun main () {

    for ( i in 1 .. 100) {

        if (i % 3 == 0) {
            var fizz : String = "|Fizz"
            print(fizz)
        } else if(i % 5 == 0){
            var buzz : String = "|Buzz"
            print(buzz)
        } else if (i % 3 == 0 && i % 5 ==0) {
            var fizzBuzz : String = "|FizzBuzz|"
            print("| $fizzBuzz")
        }else {
            print("| $i")
        }
    }
}