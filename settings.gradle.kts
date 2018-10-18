rootProject.name = "gradledemo"
//include("android_groovy")
//include("android_kotlin")
include("android_groovy", "android_kotlin")


pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.android.application") {
                useModule(Config.Plugins.androidGradlePlugin)
            } else {
                println("Module: ${requested.id.id}")
            }
        }
    }
}
