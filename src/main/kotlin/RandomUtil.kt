import java.security.SecureRandom

interface RandomUtil {
    fun generateNumber(): Int
}

const val UPPER_BOUND = 9

class Random : RandomUtil {

    companion object {
        private val secureRandom = SecureRandom()
    }

    override fun generateNumber(): Int {
        return secureRandom.nextInt(UPPER_BOUND)
    }
}