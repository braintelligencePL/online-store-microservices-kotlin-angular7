package pl.braintelligence.productstore.core.product

import pl.braintelligence.sharedkernel.domain.Money

data class Product(
        val id: String,
        val name: String,
        val description: String,
        val price: Money,
        val discount: Int
) {
    init {
        validateDiscount(discount)
        validateDescription(description)
        validateName(name)
    }

    private fun validateName(name: String) {
        TODO("Name must be no more than 50 characters")
    }

    private fun validateDescription(description: String) {
        TODO("Description must be more than 10 words")
    }

    private fun validateDiscount(discount: Int) {
        TODO("Discount can't be more than 100.")
    }

}
