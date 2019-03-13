package pl.braintelligence.productstore.base

import com.github.tomakehurst.wiremock.junit.WireMockRule
import org.junit.Rule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.test.context.ActiveProfiles
import pl.braintelligence.productstore.Application
import pl.braintelligence.sharedkernel.infrastructure.Profiles
import pl.braintelligence.sharedkernel.test.commons.BaseHttpMethods
import spock.lang.Specification

@SpringBootTest(
        classes = [Application],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles([Profiles.LOCAL])
class BaseIntegrationTest extends Specification implements BaseHttpMethods {

    @Rule
    public WireMockRule reportingService = new WireMockRule(12345)

    @Autowired
    private MongoTemplate mongo

    void setup() {
        clearMongoDb()
    }

    private void clearMongoDb() {
        for (def collection : mongo.collectionNames) {
            mongo.dropCollection(collection)
        }
    }
}
