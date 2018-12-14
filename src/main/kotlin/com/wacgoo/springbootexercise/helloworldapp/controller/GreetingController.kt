package com.wacgoo.springbootexercise.helloworldapp.controller

import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()
}