package pl.braintelligence.productstore.core

import pl.braintelligence.productstore.application.NewCategoryDto

/**
 * Primary Port
 */

interface ProductStore {

    fun createNewCategory(newCategoryDto: NewCategoryDto)


}
