package car

class Car(
    val participantName: String,
    var position: Int = 0,
) {
    init {
        require(participantName.length <= NAME_LENGTH_VALIDATION) {
            throw IllegalArgumentException("이름은 5자 이하여야 합니다.")
        }
    }

    companion object{
        const val NAME_LENGTH_VALIDATION = 5
    }
}