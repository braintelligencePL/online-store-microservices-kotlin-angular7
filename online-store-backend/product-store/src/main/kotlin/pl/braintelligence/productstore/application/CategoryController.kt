package pl.braintelligence.productstore.application

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import pl.braintelligence.productstore.application.dto.NewCategoryDto
import pl.braintelligence.productstore.core.ProductStore
import pl.braintelligence.productstore.core.category.Category

/**
 * Primary Adapter
 */

@RestController
class CategoryController(
        private val productStore: ProductStore
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/categories")
    fun createNewCategory(@RequestBody newCategoryDto: NewCategoryDto) =
            productStore.createNewCategory(newCategoryDto)

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/categories")
    fun getAvailableCategories(): List<Category> =
            productStore.getAvailableCategories()


}

