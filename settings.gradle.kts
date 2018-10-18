rootProject.name = "gradledemo"
include("android_groovy", "android_kotlin")


pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }

//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "com.android.application") {
//                useModule("com.android.tools.build:gradle:3.2.0")
//            } else {
//                println("Module: ${requested.id.id}")
//            }
//        }
//    }
}
