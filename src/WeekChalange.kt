class WeekSum {


    fun looKingForSecondBiggestAndSecondleastInt(arr: Array<Int>):String{

        val mutableList = arr.toMutableList().sorted()
        val checkSameElements = mutableList.toSet()

        val lastindex = checkSameElements.last()


        if (checkSameElements.size == 1){
            return "min ${checkSameElements.toTypedArray()[0]} max ${checkSameElements.toTypedArray()[0]}"
        }


        if (checkSameElements.size == 2){
            return "min ${checkSameElements.toTypedArray()[0]} max ${checkSameElements.toTypedArray()[1]}"
        }

        if (checkSameElements.size == 3){

            return "min ${checkSameElements.toTypedArray()[1]} max ${checkSameElements.toTypedArray()[1]}"

        }

        return "min ${checkSameElements.toTypedArray()[1]} max ${checkSameElements.toTypedArray()[checkSameElements.size -2]}"
    }





    fun concatenate(a: IntArray, b: IntArray): IntArray {
        return a + b
    }

    fun twoArrayerTogether(firstArray: Array<Int>,secondArray: Array<Int>):Array<Int>{

        val concat = concatenate(firstArray.toIntArray(),secondArray.toIntArray())

        return concat.toTypedArray()
    }

    fun differenceElements(arr: Array<Int>):Int{

        val arraySize = arr.size
        val set = arr.toSet()
        return   set.size * 2 - arraySize

    }

    fun sameElements(arr: Array<Int>):Int{
        val arraySize = arr.size
        val set = arr.toSet()
        return  arraySize - set.size
    }



}