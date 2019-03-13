package pl.braintelligence.productstore.core

import org.springframework.stereotype.Service
import pl.braintelligence.productstore.application.NewCategoryDto
import pl.braintelligence.productstore.core.category.Category
import pl.braintelligence.productstore.core.category.CategoryService

@Service
class ProductStoreFacade(
        private val categoryService: CategoryService
) : ProductStore {

    override fun createNewCategory(newCategoryDto: NewCategoryDto) {
        categoryService.createNewCategory(newCategoryDto)
    }
}
