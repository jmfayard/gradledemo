package org.example.greeting

import org.gradle.api.AllOpenTask
import org.gradle.api.tasks.TaskAction

class Greeting : AllOpenTask() {
  var message: String = ""
  var recipient: String = ""

  @TaskAction
  fun sayGreeting() {
    println("$message, $recipient!")
  }
}