package pl.braintelligence.sharedkernel.domain

import java.math.BigDecimal
import java.util.*


class Money(
        val currency: Currency = Currency.getInstance("EUR"),
        val amount: BigDecimal
) {
    init {
        validateAmount(amount)
    }

    private fun validateAmount(amount: BigDecimal) {
        TODO(" cant be negative")
    }

    companion object {
        val ZERO = Money(amount = BigDecimal.ZERO)
    }
}
