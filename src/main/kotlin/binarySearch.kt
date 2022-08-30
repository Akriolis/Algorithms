fun binarySearch (myArray1: Array<Int>, mySearch1: Int): Int? {
    var first = myArray1[0]
    var last = myArray1.size - 1
    while (first <= last)
    {
        var midPoint: Int = ((first + last) / 2).toInt()
        if (myArray1[midPoint] == mySearch1)
        {
            return midPoint
        }
        else if (midPoint < mySearch1)
        {
            first = midPoint + 1

        } else {
            last = midPoint - 1

            }
        }
    return null
}

fun verifyBinary (int_param2: Int?){
    if (int_param2 !=null){
        println("Target found at index $int_param2")
    } else{
        println("Target not found")
    }

}

fun main() {
    val intArray2 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var result2 = binarySearch(intArray2,10)
    println(verifyBinary(result2))
}