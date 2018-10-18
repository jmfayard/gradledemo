
plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
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

        