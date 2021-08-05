import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(){

    //Executes in main thread
    println("Main Program Starts: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        //creates a background thread(worker thread)
        println("Fake work finished: ${Thread.currentThread().name}")
    }

    Thread.sleep(2000)
    println("Main Program end: ${Thread.currentThread().name}")

}