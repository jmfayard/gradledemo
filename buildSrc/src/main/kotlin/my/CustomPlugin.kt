package my

import org.gradle.api.AllOpenPlugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.*


class CustomPlugin : AllOpenPlugin<Project> {

    override fun apply(project: Project) {
        var extension = project.extensions.create(
                "custom",
                CustomPluginExtension::class,
                project
        )
        project.extensions.create(
                "kt",
                ProjectKt::class,
                project
        )
        project.tasks.register("hola") {
            group = "Custom"
            doLast {
                println(extension.helloWorld)
            }
        }
    }

}
