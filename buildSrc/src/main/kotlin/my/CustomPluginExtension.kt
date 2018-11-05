package my

import org.gradle.api.AllOpen
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.property
import org.gradle.kotlin.dsl.setValue

@AllOpen
class CustomPluginExtension(project: Project) {
    var helloWorld by project.objects.property<String>()
}