import kotlin.concurrent.thread

fun main(){

    //Executes in main thread
    println("Main Program Starts: ${Thread.currentThread().name}")

    thread {
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        //creates a background thread(worker thread)
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    println("Main Program end: ${Thread.currentThread().name}")

}