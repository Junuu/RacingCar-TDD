import logic.Input

fun main(args: Array<String>) {
    val carGame = CarGame(
        inputUtil = Input(),
        randomUtil = Random(),
    )
    carGame.run()
}