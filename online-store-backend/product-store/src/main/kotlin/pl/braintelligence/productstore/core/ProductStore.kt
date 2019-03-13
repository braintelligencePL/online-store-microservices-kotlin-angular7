package pl.braintelligence.productstore.core

import pl.braintelligence.productstore.application.dto.NewCategoryDto
import pl.braintelligence.productstore.core.category.Category

/**
 * Primary Port
 */

interface ProductStore {

    fun createNewCategory(newCategoryDto: NewCategoryDto)

    fun getAvailableCategories(): List<Category>
}
