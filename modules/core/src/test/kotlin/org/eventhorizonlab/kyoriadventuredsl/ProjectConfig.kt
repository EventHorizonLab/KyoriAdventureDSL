package org.eventhorizonlab.kyoriadventuredsl

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.extensions.junitxml.JunitXmlReporter

class ProjectConfig : AbstractProjectConfig() {
    override val extensions
        get() =
            listOf(
                JunitXmlReporter(
                    includeContainers = true,
                    useTestPathAsName = true,
                    outputDir = "test-results/kotest"
                )
            )
}