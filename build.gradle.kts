plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.iphoneexperience.launcher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.iphoneexperience.launcher"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
