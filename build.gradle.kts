import my.CustomPluginExtension
import org.jetbrains.kotlin.cli.jvm.main
import org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention
import org.jfrog.gradle.plugin.artifactory.dsl.DoubleDelegateWrapper
import org.jfrog.gradle.plugin.artifactory.dsl.PublisherConfig
import org.jfrog.gradle.plugin.artifactory.dsl.ResolverConfig
import javax.xml.ws.Endpoint.publish

buildscript {

    repositories {
        google()
        mavenLocal()
        mavenCentral()
        jcenter()
        maven("https://maven.fabric.io/public")
    }

    dependencies {
        classpath(Config.Plugins.kotlin)
        classpath(Config.Plugins.androidGradlePlugin)
        classpath(Config.Plugins.dexcount)
        classpath(Config.Plugins.googleplay_publisher)
        classpath(Config.Plugins.git)
        classpath(Config.Plugins.fabric)
    }
}
plugins {
    id("com.gradle.build-scan") version "1.15.1"
    id("com.github.ben-manes.versions") version "0.20.0"
    id("jmfayard.github.io.gradle-kotlin-dsl-libs") version "0.2.3" // $ gw syncLibs
    id("com.jfrog.artifactory") version "4.7.5"
    id("my.CustomPlugin") apply false

}


allprojects {

    repositories {
        google()
        mavenLocal()
        mavenCentral()
        jcenter()
    }
    buildscript {
        repositories {
            maven("https://maven.fabric.io/public")
        }
    }

}
