package org.eventhorizonlab.kyoriadventuredsl

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.beInstanceOf
import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.format.NamedTextColor

class ComponentDslTest :
    StringSpec({
        "textComponent this is TextComponent.Builder" {
            textComponent {
                this should beInstanceOf<TextComponent.Builder>()
            }
        }

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