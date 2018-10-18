import Config.SdkVersions.versionCode
import com.android.build.gradle.ProguardFiles.getDefaultProguardFile

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("my.CustomPlugin")
}
configure<my.CustomPluginExtension> {
    helloWorld = "Bonjour tout le monde!"
}
// ... OR ...
//custom {
//    helloWorld = "Bonjour tout le monde!"
//}
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
//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
//    implementation(Libs.kotlin_stdlib_jdk7)
//    implementation(Libs.com_android_support_appcompat_v7)
//    implementation(Libs.constraint_layout)
//    testImplementation(Libs.junit)
}



configure<my.CustomPluginExtension> {
    helloWorld = "Bonjour tout le monde!"
}