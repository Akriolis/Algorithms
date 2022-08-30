// linear and binary search
// time complexity
// space complexity
// running time
// Algorithmic thinking
/*The steps in the algorithm need to be in a very specific order.
The steps also need to be distinct.
The algorithm should produce a result.
The algorithm should complete in a finite amount of time.
 */
// Order of Growth.
//Big O notation (symbol - order of magnitude of complexity - O(n))
// - theoretical definition of the complexity of an algorithm as a function of the size.
// a function of the size
//for linear - O(n), for binary - O(log n)
// O(1) - Constant Time
// O(n) - Linear time
//logarithm
//worst case scenario - log2 of n + 1
//logarithmic runtime == sublinear
//for binary search lists of data has to be sorted
//Quadratic runtime - O(n^2)
//Cubic runtime - O(n^3)
//Quasilinear runtime - O(n log n)
//Polynomial Runtime
//Factorial - n!

fun linearSearch (myArray: Array<Int>, mySearch: Int): Int? {
    for (i in myArray.indices)
    {
        if (myArray[i] == mySearch) {
            return i
        }
    }
    return null
}

fun verify (int_param: Int?){
    if (int_param !=null){
        println("Target found at index $int_param")
    } else{
        println("Target not found")
    }

}

fun main() {
    val intArray = arrayOf(1,2,3,4,5,6,7,8,9,10,43,34242,343542,333)
    var result = linearSearch(intArray,10)
    println(verify(result))
}