
fun main(a: Array<String>) {


    val firstarray = arrayOf(1,2,3,4,5,6,7,8,98,7,6,5,4123,213,123,23)
    val secondarray = arrayOf(1,2,3,4,5,6,7,8,98,7,6,5,4123,213,123,23)

    println(WeekSum().looKingForSecondBiggestAndSecondleastInt(firstarray))

    println(WeekSum().twoArrayerTogether(firstarray,secondarray))

    println(WeekSum().differenceElements(firstarray))

    println(WeekSum().sameElements(firstarray))



}