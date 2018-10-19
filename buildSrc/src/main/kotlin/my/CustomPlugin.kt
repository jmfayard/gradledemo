package my

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.kotlin.dsl.*

open class CustomPluginExtension(project: Project) {
    var helloWorld by project.objects.property<String>()
}

/** In a mixed Kotlin-Gradle project,
instead of writing an extension function of Project,
we write it as a member function of ProjectKt
which we make available via a plugin as  `project.kt`
**/
open class ProjectKt(val project: Project) {
    fun doSomethingCool() = println("Hello world from project: ${project.name}")
}

open class CustomPlugin : Plugin<Project> {

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
        project.tasks.register("hello") {
            group = "Custom"
            doLast {
                println(extension.helloWorld)
            }
        }
    }

}
