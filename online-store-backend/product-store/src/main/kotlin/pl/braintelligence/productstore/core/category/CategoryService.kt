package pl.braintelligence.productstore.core.category

import org.springframework.stereotype.Service
import pl.braintelligence.productstore.application.NewCategoryDto

@Service
class CategoryService(
        private val categoryRepository: CategoryRepository
) {


    fun createNewCategory(newCategoryDto: NewCategoryDto) {
        val category = Category(name = newCategoryDto.name)
        categoryRepository.save(category)
    }


}
