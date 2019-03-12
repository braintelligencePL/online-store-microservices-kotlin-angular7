package pl.braintelligence.productstore.api

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.productstore.core.ProductStore

/**
 * Primary Adapter
 */

@RestController
class CatalogController(
        private val productStore: ProductStore
) {

    // get catalogs
    // get catalog
    // get products

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/catalog")
    fun getActiveCatalog() = productStore.getActiveCatalog()

}

