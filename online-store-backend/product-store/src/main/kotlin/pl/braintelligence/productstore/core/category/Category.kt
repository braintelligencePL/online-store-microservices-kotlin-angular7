package pl.braintelligence.productstore.core.category

import pl.braintelligence.productstore.core.product.Product
import java.util.*

data class Category(
        val id: String = UUID.randomUUID().toString(),
        val name: String,
        val products: Set<Product> = emptySet()
) {

}
