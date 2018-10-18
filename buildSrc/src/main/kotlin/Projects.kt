@file:JvmName("Projects")

import com.android.build.gradle.internal.dsl.DefaultConfig
import org.gradle.api.Project


fun Project.doSomethingUseful() {
    println("Hello world project $name!")
}

fun DefaultConfig.addResValues(
        vararg entries: Pair<String, String>
)  {
    for ((key, value) in entries) {
        resValue("string", key, value)
    }
}


fun Project.showInGradleHelp(
        descriptions: Map<String, String> = emptyMap(),
        vararg tasks: String
) {
    project.gradle.taskGraph.whenReady {
        val help = project.tasks.getByName("help")
        help.doLast {
            showImportantTasks(project, tasks.toList(), descriptions)
        }
    }
}


fun showImportantTasks(project: Project, selectedTasks: List<String>, descriptions: Map<String, String>)  {
    val GRADLE = " \$ gw "
    println("%s -m %-42s   %s".format(GRADLE, "<TASK>", "# --dry-run, allows to see what is executed"))
    println()
    val tasks = project.rootProject.allprojects
            .flatMap { it.tasks }
            .filter {
                val showIfCustom = it.group == "Custom"
                val selected = it.path in selectedTasks
                showIfCustom || selected
            }
            .sortedBy {
                it.project.path.length * 100 + it.path.length
            }

    tasks.forEach { task ->
        val description = descriptions[task.path] ?: task.description
        println("%s %-45s   %s".format(GRADLE , task.path, "# " + description))
    }

}
