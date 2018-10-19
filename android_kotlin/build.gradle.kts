import Config.SdkVersions.versionCode
import sun.java2d.xr.XRUtils.GOOD

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("my.CustomPlugin") //GOOD
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "com.example.android_kotlin"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName ="1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        named("release").configure {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

}


dependencies {
//    implementation("com.android.support:appcompat-v7:28.0.0")

//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin_stdlib_jdk7)
    implementation(Libs.com_android_support_appcompat_v7)
    implementation(Libs.constraint_layout)
    testImplementation(Libs.junit)
}



custom {            // GOOD
    helloWorld = "Bonjour tout le monde!"
}

project.kt.doSomethingCool()