
plugins {
    `kotlin-dsl`
// add this in the doc, only Groovy for now
    `java-gradle-plugin`
    java
// OPTIONAL, SEE https://plugins.gradle.org/docs/publish-plugin
//    id("com.gradle.plugin-publish") version "0.10.0"

    /** Apply the allopen compiler plugin **/
    id("org.jetbrains.kotlin.plugin.allopen") version "1.2.61"

}

/** Configure allopen compiler plugin **/
allOpen {
    annotation("org.gradle.api.AllOpen")
}

repositories {
    mavenCentral()
    jcenter()
    google()
}
tasks.withType(Test::class.java).configureEach {
    useTestNG()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
gradlePlugin {
    plugins {
        create("my.CustomPlugin") {
            id = "my.CustomPlugin"
            implementationClass = "my.CustomPlugin"
        }
    }
}
gradlePlugin {
    plugins {
        create("org.example.greeting") {
            id = "org.example.greeting"
            implementationClass = "org.example.greeting.GreetingPlugin"
        }
    }
}

