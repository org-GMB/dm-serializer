package dev.osangu.dmseralizer.infrastructure.presentation

import dev.osangu.dmseralizer.infrastructure.presentation.dto.response.KResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KController {
    @GetMapping("/health-check")
    fun healthCheck() : KResponse {
        return KResponse(data = "OK")
    }
}
