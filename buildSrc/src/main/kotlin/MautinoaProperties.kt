import org.gradle.api.Project

data class MautinoaProperties(
        val artifactory_contextUrl: String,
        val artifactory_user : String,
        val artifactory_password: String,
        val release_store_file: String? = null,
        val release_key_password: String? = null,
        val release_store_password: String? = null,
        val release_key_alias: String? = null
)

fun MautinoaProperties.enableSigning() : Boolean =
        release_key_password != null && release_store_file != null

fun Project.findPropertiesOrCrash() : MautinoaProperties {
    return MautinoaProperties(
            artifactory_contextUrl = findEnvOrProp("artifactory_contextUrl")!!,
            artifactory_user = findEnvOrProp("artifactory_user")!!,
            artifactory_password = findEnvOrProp("artifactory_password")!!,
            release_store_file = findEnvOrProp("release_store_file"),
            release_key_password = findEnvOrProp("release_key_password"),
            release_store_password = findEnvOrProp("release_store_password"),
            release_key_alias = findEnvOrProp("release_key_alias")
    )
}

fun Project.findEnvOrProp(name: String) : String? =
        System.getenv(name) ?: findProperty(name) as String?
