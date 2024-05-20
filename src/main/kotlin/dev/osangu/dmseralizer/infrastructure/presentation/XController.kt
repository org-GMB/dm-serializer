package dev.osangu.dmseralizer.infrastructure.presentation

import dev.osangu.dmseralizer.core.usecase.XUseCase
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.getBean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.UUID

enum class Platform(name: String) {
    INSTAGRAM("instagram"),
    MESSENGER("messenger"),
    KAKAO_TALK("kakaoTalk"),
    LINE("line"),
}


@Controller
class XController {
    @GetMapping()
    fun apiMapper(
        @PathVariable("clientId")
        clientId: UUID,
        @PathVariable("platform")
        platform: Platform,
        beanFactory: BeanFactory
    ) {
        val useCase = beanFactory.getBean<XUseCase>(name = platform.name + "UseCase")
        useCase.execute()
    }
}
