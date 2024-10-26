enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TemplateMultiplatform"
include(":androidApp")
include(":shared")
include(":shared:core")
include(":shared:data")
include(":shared:domain")
include(":shared:entity")
include(":shared:presentation")
include(":shared:viewmodels")
