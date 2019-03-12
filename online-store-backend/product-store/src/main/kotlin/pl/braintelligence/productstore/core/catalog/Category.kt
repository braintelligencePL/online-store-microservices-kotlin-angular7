package pl.braintelligence.productstore.core.catalog

import pl.braintelligence.productstore.core.product.Product

data class Category(
        val id: String,
        val name: String,
        val catalogId: Long,
        val products: Set<Product>
) {


}
