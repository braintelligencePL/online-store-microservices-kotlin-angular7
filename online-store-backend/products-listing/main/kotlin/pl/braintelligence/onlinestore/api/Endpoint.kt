package pl.braintelligence.onlinestore.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Endpoint {

    @GetMapping("hello")
    fun helloWorld() = "hello"

}
