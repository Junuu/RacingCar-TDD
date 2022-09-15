package logic

import java.io.BufferedReader
import java.io.InputStreamReader

interface InputUtil{
    fun inputName() : String
}

class Input : InputUtil {
    override fun inputName(): String {
        lateinit var inputString : String
        BufferedReader(InputStreamReader(System.`in`)).use{
            inputString = it.readLine()
        }
        return inputString
    }
}

fun splitName(inputNames : String) = inputNames.split(",")
