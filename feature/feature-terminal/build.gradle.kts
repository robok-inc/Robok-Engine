plugins {
    id("com.android.library")
    id("kotlin-android")
}

group = "org.gampiot.robok.feature.terminal"

android {
    namespace = "org.gampiot.robok.feature.terminal"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }
   
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(libs.versions.android.jvm.get().toInt())
        targetCompatibility = JavaVersion.toVersion(libs.versions.android.jvm.get().toInt())
    }

    kotlinOptions {
        jvmTarget = libs.versions.android.jvm.get()
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "17"
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    
    implementation("com.google.android.material:material:1.13.0-alpha06")
    implementation("com.google.code.gson:gson:2.11.0")
    
    implementation("com.termux.termux-app:terminal-view:0.118.1")
    implementation("com.termux.termux-app:terminal-emulator:0.118.1")
    
    implementation(project(":feature:feature-util"))
    implementation(project(":feature:feature-res:strings"))
    implementation(project(":feature:feature-component"))
    
    // Easy - UI
    implementation(project(":easy-components"))
}