plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android.namespace = "com.template.multiplatform.core.app"

android {
    compileSdk = 34 // Spécifie la version de compilation

    defaultConfig {
        minSdk = 24 // Définis la version minimale de support
        targetSdk = 34 // Définis la version cible
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}