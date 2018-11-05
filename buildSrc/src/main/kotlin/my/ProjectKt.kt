package my

import org.gradle.api.Project

/** In a mixed Kotlin-Gradle project,
instead of writing an extension function of Project,
we write it as a member function of ProjectKt
which we make available via a plugin as  `project.kt`
**/
open class ProjectKt(val project: Project) {
    fun doSomethingCool() = println("Hello world from project: ${project.name}")
}