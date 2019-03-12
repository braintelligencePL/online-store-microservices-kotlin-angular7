package pl.braintelligence.sharedkernel

import java.math.BigDecimal
import java.util.*


class Money(
        val currency: Currency = Currency.getInstance("EUR"),
        val units: BigDecimal
) {
    init {
        validatePrice(units)
    }

    private fun validatePrice(units: BigDecimal) {
        TODO("Money cant be negative")
    }

    companion object {
        val ZERO = Money(units = BigDecimal.ZERO)
    }
}
