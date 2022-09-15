package move

const val MOVE_THRESHOLD = 4

class MoveStrategy {

    fun isMovable(number: Int): Boolean {
        if (number < MOVE_THRESHOLD)
            return false
        return true
    }
}