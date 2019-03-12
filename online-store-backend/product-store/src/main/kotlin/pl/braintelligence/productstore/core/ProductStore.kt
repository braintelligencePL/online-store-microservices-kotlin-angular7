package pl.braintelligence.productstore.core

import pl.braintelligence.productstore.core.catalog.Category

/**
 * Primary Port
 */


interface ProductStore {

    fun getActiveCatalog(): Category
}
