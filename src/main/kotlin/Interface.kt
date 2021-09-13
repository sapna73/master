interface MyInterface{
    val prop: Int //abstract

    val propertyWithImplementation: String
    get() = "foo"

    fun foo(){
        print(prop)
    }
}

class Interface : MyInterface {

    override val prop: Int = 29
}