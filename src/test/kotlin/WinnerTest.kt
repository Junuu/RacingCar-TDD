import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class WinnerTest {

    @Test
    fun `position이 가장 높은 차가 우승한다`(){
        //given
        val hong = Car(
            participantName = "hong",
            position =  4,
        )
        val junuu = Car(
            participantName = "chong",
            position = 1,
        )
        val input = listOf(junuu, hong)
        val winnerSearch = WinnerSearch(input)

        //when
        val result = winnerSearch.findWinner()

        //then
        Assertions.assertEquals(result, listOf("hong"))
    }

    @Test
    fun `우승자는 여러명일 수 있다`() {
        //given
        val junuu = Car(
            participantName = "junuu",
            position = 2,
        )
        val hong = Car(
            participantName = "hong",
            position =  2,
        )
        val chong = Car(
            participantName = "chong",
            position = 1,
        )

        val input = listOf(junuu, hong, chong)
        val winnerSearch = WinnerSearch(input)

        //when
        val result = winnerSearch.findWinner()

        //then
        Assertions.assertEquals(result, listOf("junuu","hong"))

    }

    @Test
    fun `maxOrNull 테스트`(){
        val list = listOf(1,2,6,4,5,6)
        val result = list.maxOrNull()
        println(result)
    }
}