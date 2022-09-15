import car.Car
import logic.Input
import logic.InputUtil
import logic.Logic
import logic.splitName
import move.MoveStrategy
import view.View

const val REPEAT_TIME = 5

class CarGame(
    inputUtil: InputUtil,
    private val randomUtil: RandomUtil,
) {

    private val view = View(
        logic = Logic(),
        input = inputUtil,
    )

    fun run() {
        val carList = inputUserNamesAndMakeCarList()
        repeat(REPEAT_TIME) {
            carsMove(carList)
        }
        printWinner(carList)
    }

    private fun printWinner(carList: List<Car>) {
        view.printWinner(carList)
    }

    private fun carsMove(carList: List<Car>) {
        carList.forEach {
            it.move(randomUtil.generateNumber())
        }
    }

    private fun inputUserNamesAndMakeCarList(): List<Car> {
        val splitName = view.printInputInfo()
        val carList = mutableListOf<Car>()
        splitName.forEach {
            carList.add(Car(participantName = it))
        }
        return carList
    }
}