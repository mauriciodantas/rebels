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
        versionCode = 9
        versionName = "9"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    sourceSets {
        getByName("main") {
            java.setSrcDirs(emptyList<String>())
            kotlin.setSrcDirs(emptyList<String>())
        }
    }

    packaging {
        resources {
            excludes.add("classes.dex")
            excludes.add("**/classes.dex")
            excludes.add("META-INF/*.kotlin_module")
            excludes.add("**/R.class")
            excludes.add("**/R$*.class")
        }
    }

    buildFeatures {
        buildConfig = false
        aidl = false
        resValues = false
        shaders = false
    }

    lint {
        checkReleaseBuilds = false
    }
}

dependencies {
}

configurations.all {
    exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib")
    exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk8")
    exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-jdk7")
    exclude(group = "org.jetbrains.kotlin", module = "kotlin-stdlib-common")
}
