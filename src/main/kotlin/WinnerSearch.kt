class WinnerSearch(
    private val inputCars: List<Car>
) {

    fun findWinner(): List<String> {
        val maxValue = inputCars.map {
            it.position
        }.maxOrNull()

        return inputCars
            .filter { it.position == maxValue }
            .map { it.participantName }
            .toList()
    }
}