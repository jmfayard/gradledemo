package org.example.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class Greeting : DefaultTask() {
  var message: String = ""
  var recipient: String = ""

  @TaskAction
  fun sayGreeting() {
    println("$message, $recipient!")
  }
}