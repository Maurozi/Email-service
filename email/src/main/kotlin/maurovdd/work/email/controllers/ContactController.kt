package maurovdd.work.email

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ContactController {

    @GetMapping("/")
    fun main() = listOf(
        "Hello, welcome to the email service!"
    )

    @GetMapping("/api/contacts")
    fun listContacts() = listOf(
        Email("1", "Hello", "This is the body of the email.")
    )
}