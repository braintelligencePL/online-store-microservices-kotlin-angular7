package pl.braintelligence.productstore.domain

import pl.braintelligence.productstore.core.category.Category
import pl.braintelligence.sharedkernel.domain.exceptions.DomainException
import spock.lang.Specification

class CategoryTest extends Specification {

    def "Should throw exception when category name empty"() {
        when:
        new Category(emptyCategoryName)

        then:
        thrown(DomainException)

        where:
        emptyCategoryName << ['', '  ']
    }

    def "Should create category with default settings"() {
        given:
        def categoryName = "programming"

        when:
        def result = new Category(categoryName)

        then:
        result.name != ""
        result.id != ""
    }


}
