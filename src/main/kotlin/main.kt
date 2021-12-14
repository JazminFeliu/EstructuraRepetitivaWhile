fun main(args: Array<String>) {
    //realizar un programa que imprima en pantalla los numeros del 1 al 100
    var x = 1
    while(x <= 100) {
        println(x)
        x += 1
    }

    // cargar un valor positivo y mostrar por pantalla los numeros desde el 1 hasta ese valor

    print("Ingrese un valor positivo: ")
    val valor = readLine()!!.toInt()
    var n = 1
    while(n <= valor){
        println(n)
        n += 1
    }

    //crear un programa que permita cargar 10 valores por teclado y luego muestre la suma y el promedio

    var x1 = 1
    var suma = 0
    while(x1 <=10){
        println("Ingrese un valor:")
        val valor = readLine()!!.toInt()
        suma += valor
        x1 += 1
    }
    val promedio = suma /10
    println("La suma de los 10 valores es: $suma y su promedio $promedio ")

}