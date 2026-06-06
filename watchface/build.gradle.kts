plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "net.mdantas.rebels"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "net.mdantas.rebels"
        minSdk = 35
        targetSdk = 36
        versionCode = 8
        versionName = "8"

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    buildFeatures {
        buildConfig = false
        aidl = false
        resValues = false
        shaders = false
    }


}

dependencies {
}