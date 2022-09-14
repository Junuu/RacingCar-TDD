const val NAME_LENGTH_VALIDATION = 5

class Car(
    val participantName: String,
) {
    init {
        require(participantName.length <= NAME_LENGTH_VALIDATION) {
            throw IllegalArgumentException("이름은 5자 이하여야 합니다.")
        }
    }
}