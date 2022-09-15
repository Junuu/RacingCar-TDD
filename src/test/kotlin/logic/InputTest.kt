package logic

import logic.splitName
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InputTest {
    @Test
    fun `이름은 쉼표로 구분한다`() {
        //given
        val inputNames = "junuu,hong,ggam,chong"

        //when
        val result = splitName(inputNames)

        //then
        Assertions.assertEquals(result.size, 4)
        Assertions.assertEquals(result, listOf("junuu", "hong", "ggam", "chong"))
    }
}