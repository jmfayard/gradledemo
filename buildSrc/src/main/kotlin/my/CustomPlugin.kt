package my

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.kotlin.dsl.*

open class CustomPluginExtension(project: Project) {
    var helloWorld by project.objects.property<String>()
}


open class CustomPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        var extension = project.extensions.create(
                "custom",
                CustomPluginExtension::class,
                project
        )
        project.tasks.register("hello") {
            group = "Custom"
            doLast {
                println(extension.helloWorld)
            }
        }
    }

}
