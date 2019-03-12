package pl.braintelligence.productstore.core

import org.springframework.stereotype.Service
import pl.braintelligence.productstore.core.catalog.Category

@Service
class ProductStoreFacade : ProductStore {

    override fun getActiveCatalog(): Category {
        return Category("123", "name", 1L, emptySet())
    }


}
