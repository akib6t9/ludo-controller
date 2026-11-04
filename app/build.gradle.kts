plugins {
    id("com.android.application")
}

android {
    namespace = "com.ludo.controller"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.ludo.controller"
        minSdk = 24
        targetSdk = 36
        versionCode = 7
        versionName = "4.5-Platinum"
    }

    signingConfigs {
        create("debugConfig") {
            storeFile = file("${rootDir}/debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("debugConfig")
        }
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debugConfig")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
}
