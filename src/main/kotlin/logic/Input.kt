package logic

import java.io.BufferedReader
import java.io.InputStreamReader

interface InputUtil{
    fun inputName() : String
}

class Input : InputUtil {
    override fun inputName(): String {
        return readLine() ?: throw IllegalArgumentException()
    }
}

fun splitName(inputNames : String) = inputNames.split(",")
