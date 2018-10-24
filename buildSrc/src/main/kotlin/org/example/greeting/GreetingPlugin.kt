package org.example.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class GreetingPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.tasks.create<Greeting>("hello") {
      message = "Hello"
      recipient = "World"
    }

  }
}