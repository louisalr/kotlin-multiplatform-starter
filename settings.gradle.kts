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
include(":shared:presentation:plugins")
include(":shared:presentation:ui")
include(":shared:core:core-data")
include(":shared:core:core-app")
include(":shared:presentation:viewmodels")
