fun main() {
    name ()
    modulus()
    var resuilt=modulus(37,23)
    println(resuilt)
    add ()
    value()
}
fun name () {
    println("hello loyce")
}
fun modulus(){
    var num1= 37
    var num2=23
    var module=num1%num2
    println(module)
}
fun modulus(num1:Int,num2:Int):Int{
    var module=num1%num2
    return module

}

fun add (){
    var num1=20
    var num2=10
    var num3=15
    var num4=20
    var sum=num1+num2+num3+num4
    println(sum)
}

fun value(){
    println("self-respect")
}



