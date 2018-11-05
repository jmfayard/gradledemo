package org.gradle.api

/**
 * Declare an annotation and configure it in the allOpen { ... } block of build.gradle.kts
 * If the class (or any of its superclasses) is annotated with this annotation,
 * the class itself and all its members will become open.
 *
 * In practice, this should be added to gradle/gradle
 * **/
annotation class AllOpen


@AllOpen
abstract class AllOpenTask : DefaultTask()

@AllOpen
interface AllOpenPlugin<T>: Plugin<T>