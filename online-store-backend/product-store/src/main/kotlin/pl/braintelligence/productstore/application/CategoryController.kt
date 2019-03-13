package pl.braintelligence.productstore.application

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import pl.braintelligence.productstore.core.ProductStore

/**
 * Primary Adapter
 */

@RestController
class CategoryController(
        private val productStore: ProductStore
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/categories")
    fun getAvailableCategories(
            @RequestBody newCategoryDto: NewCategoryDto
    ) = productStore.createNewCategory(newCategoryDto)
}

