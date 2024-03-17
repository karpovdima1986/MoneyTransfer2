import org.junit.Assert.*
import org.junit.Test
import ru.netology.ERROR_LIMIT
import ru.netology.ERROR_TYPE
import ru.netology.comission

class MainKtTest {

    @Test
    fun comissionTransferMore() {
        val transfer = 160_000
        val typeCard = "Мир"
        val previous = 0
        val result = comission(transfer, typeCard, previous)
        assertEquals(ERROR_LIMIT, result)
    }
    @Test
    fun comissionTransferLess() {
        val transfer = 50_000
        val typeCard = "Мир"
        val previous = 0
        val result = comission(transfer, typeCard, previous)
        assertEquals(0, result)
    }
    @Test
    fun testVisaMin() {
        val transfer = 1_000
        val typeCard = "Visa"
        val previous = 0
        val result = comission(transfer, typeCard, previous)
        assertEquals(35, result)
    }
    @Test
    fun testVisaMax() {
        val transfer = 75_000
        val typeCard = "Visa"
        val previous = 0
        val result = comission(transfer, typeCard, previous)
        assertEquals(562, result)
    }
    @Test
    fun testMastercardMin() {
        val transfer = 1_000
        val typeCard = "Mastercard"
        val previous = 0
        val result = comission(transfer, typeCard, previous)
        assertEquals(0, result)
    }
    @Test
    fun testMastercardPrevious() {
        val transfer = 1_000
        val typeCard = "Mastercard"
        val previous = 100_000
        val result = comission(transfer, typeCard, previous)
        assertEquals(26, result)
    }
    @Test
    fun testMir() {
        val transfer = 100_000
        val typeCard = "Мир"
        val previous = 74_000
        val result = comission(transfer, typeCard, previous)
        assertEquals(0, result)
    }
    @Test
    fun TestWrongCard() {
        val transfer = 50_000
        val typeCard = "Vk play"
        val previous = 0
        val result = comission(transfer, typeCard, previous)
        assertEquals(ERROR_TYPE, result)
    }
    @Test
    fun comissionPreviousMore() {
        val transfer = 60_000
        val typeCard = "Мир"
        val previous = 600_000
        val result = comission(transfer, typeCard, previous)
        assertEquals(ERROR_LIMIT, result)
    }


}