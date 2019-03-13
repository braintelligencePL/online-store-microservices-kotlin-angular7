package pl.braintelligence.productstore.infrastructure

import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository
import pl.braintelligence.productstore.core.category.Category
import pl.braintelligence.productstore.core.category.CategoryRepository

/**
 * Secondary adapter
 */

@Repository
class MongoDbCategoryRepository(
        private val mongoTemplate: MongoTemplate
) : CategoryRepository {

    override fun save(category: Category) {
        mongoTemplate.save(category, CATEGORY_COLLECTION)
    }

    companion object {
        const val CATEGORY_COLLECTION = "categories"
    }
}
