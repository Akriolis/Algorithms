//This code doesn't work as intended

fun recursiveBinarySearch (input: Array<Int>, target: Int, start: Int, end: Int): Int {
        return if (start >= end) {
            -1
        } else {
            val mid = start + (end - start) / 2
            if (target < input[mid]) {
                recursiveBinarySearch(input, target, start, mid - 1)
            } else if (target > input[mid]) {
                recursiveBinarySearch(input, target, mid + 1, end)
            } else {
                mid
            }
        }
}

fun verifyRecursiveBinary (myParam: Int){
    println("The found index is $myParam")
    }



fun main() {
    val intArray3 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var result3 = recursiveBinarySearch(intArray3,5,0,10)
    println(verifyRecursiveBinary(result3))
}