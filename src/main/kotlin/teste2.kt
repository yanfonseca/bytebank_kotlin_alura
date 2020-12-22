fun teste2(){
    for (i in 10 downTo 1 step 2) {
        if (i == 6) {
            continue   // Também existe o break
        }
        println(i)
    }
}