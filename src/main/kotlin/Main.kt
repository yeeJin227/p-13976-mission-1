package com

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("== 명언 앱 ==")

    while (true) {
        print("명언) ")

        val input = readlnOrNull()!!.trim()

        if (input == "종료")
            break
        else if (input == "등록"){
            print("명언) ")
            val content = readlnOrNull()!!.trim()
            print("작가) ")
            val author = readlnOrNull()!!.trim()
        }
    }
}