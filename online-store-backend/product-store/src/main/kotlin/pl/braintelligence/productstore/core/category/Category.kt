package pl.braintelligence.productstore.core.category

import io.micrometer.core.instrument.util.StringUtils.isBlank
import pl.braintelligence.productstore.core.product.Product
import pl.braintelligence.sharedkernel.domain.exceptions.DomainException
import java.util.*

data class Category @JvmOverloads constructor(
        private val id: String = UUID.randomUUID().toString(),
        private val name: String,
        private val products: Set<Product> = emptySet()
) {

    init {
        validateName(name)
    }

    private fun validateName(name: String) {
        if (isBlank(name))
            throw DomainException("Category name shouldn't be empty")
    }

}
