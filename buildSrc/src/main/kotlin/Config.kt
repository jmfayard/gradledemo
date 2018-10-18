import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec

object Config {

    private const val kotlinVersion = "1.2.71"

    object Plugins {
        const val androidGradlePlugin = "com.android.tools.build:gradle:3.2.1"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val firebase = "com.google.firebase:firebase-plugins:1.1.5"
        const val fabric = "io.fabric.tools:gradle:1.25.4"
        const val ktlint = "com.github.shyiko:ktlint:0.28.0"
        const val git = "org.ajoberstar:gradle-git:0.2.3"
        const val dexcount = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:0.8.3"
        const val googleplay_publisher = "com.github.triplet.gradle:play-publisher:1.2.2"
    }

    object SdkVersions {
        val versionCode = 1
        val versionName = "0.$versionCode"
        val compile = 28
        val target = 28
        val min = 21
    }

}

