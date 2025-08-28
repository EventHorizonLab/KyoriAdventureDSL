package org.eventhorizonlab.kyoriadventuredsl

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import net.kyori.adventure.text.format.NamedTextColor

class ComponentDslTest :
    StringSpec({
        "can build a simple coloured text" {
            val c =
                textComponent {
                    content("Hello World")
                    color(NamedTextColor.AQUA)
                }

            c.content() shouldBe "Hello World"
            c.color() shouldBe NamedTextColor.AQUA
        }
    })