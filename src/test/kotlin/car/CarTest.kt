package car

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarTest {

    @ParameterizedTest
    @ValueSource(strings = ["junuu","hong"])
    fun `참여자 이름으로 차를 생성`(input: String){
        //given

        //when
        val car = Car(participantName = input)

        //then
        Assertions.assertNotNull(car)
        Assertions.assertEquals(car.participantName, input)
    }

    @ParameterizedTest
    @ValueSource(strings = ["junuu1","hong35"])
    fun `참여자의 이름은 5자 이하여야 한다`(input: String){
        //given

        //when, then
        Assertions.assertThrows(IllegalArgumentException::class.java){
            Car(participantName = input)
        }
    }
}