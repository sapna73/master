import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main() = runBlocking{

    //Executes in main thread
    println("Main Program Starts: ${Thread.currentThread().name}")

    val job : Job =     launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(1000) //coroutine is suspended but Thread: main is free (not blocked)
        //creates a background thread(worker thread)
        println("Fake work finished: ${Thread.currentThread().name}")
        println("Hello Kotlin world")

        var mrx = SimpleClassObject();
        mrx.name = "Girish";
        println("Name is : " + mrx.name)
    }

//    delay(2000)                      // Main thread: wait for coroutine to finish(practically not a right way to do)
    job.join()
    println("Main Program end: ${Thread.currentThread().name}")

}