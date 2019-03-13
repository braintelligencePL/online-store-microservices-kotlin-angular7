package pl.braintelligence.productstore

import org.springframework.http.HttpStatus
import pl.braintelligence.productstore.application.NewCategoryDto
import pl.braintelligence.productstore.base.BaseIntegrationTest

class CatalogControllerTest extends BaseIntegrationTest {

    def "Should create new category"() {
        given:
        def newCategoryDto = new NewCategoryDto("programming")

        when:
        def response = post('/categories', newCategoryDto)

        then:
        response.statusCode == HttpStatus.CREATED
    }
}
