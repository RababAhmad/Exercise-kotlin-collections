fun main() {

    val fruits = mutableListOf("Apple", "Mango", "Orange")
    fruits.add("banana")
    fruits.removeAt(1)
    println(fruits)

    val numbers = mutableSetOf(1,2,3,4,5,5)
    numbers.add(3)
    numbers.add(6)
    println(numbers)

    val countryNames = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    countryNames.put("Kuwait", "KW")
    println("countries: ${countryNames.keys}     ")

    println("capitals  ${countryNames.values}  " )


    countryNames.remove("USA")
    println("final map ${countryNames} ")

    val carBrands = arrayListOf("BMW", "Toyota", "Honda", "Ford")
    carBrands.add("lincoln")
    carBrands.add("land")

    println("updated list ${carBrands}")


    val listOfNumbers = mutableListOf(10, 5, 20, 15, 25, 30)

     val greaterThen15 = listOfNumbers.filter {num : Int -> num>15 }
      println(greaterThen15)


    listOfNumbers.sort()
    listOfNumbers.reverse()
    println(listOfNumbers)

  val listOfFloating = mutableListOf(2.5, 7.1, 3.8, 9.2, 5.6)

    println("largest number ${listOfFloating.maxOrNull()}")

    println("smallest number ${listOfFloating.minOrNull()}")



}