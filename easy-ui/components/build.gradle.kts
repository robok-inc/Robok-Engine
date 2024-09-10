plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("maven-publish")
}

android {
    namespace = "dev.trindadedev.easyui.components"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }

    kotlinOptions {
        jvmTarget = "18"
    }
}

dependencies {
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.material:material:1.13.0-alpha05")
    implementation("androidx.appcompat:appcompat:1.7.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "dev.trindadedev.easyui.components"
            artifactId = "components"
            version = "0.0.1"

            from(components.findByName("release"))

            pom {
                name.set("Easy UI Components")
                description.set("Some XML components to help you with development.")
                url.set("https://github.com/trindadev13/easy-ui")
                licenses {
                    license {
                        name.set("GPL 3.0 License")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.pt-br.html")
                    }
                }
                developers {
                    developer {
                        id.set("trindadedev13")
                        name.set("Aquiles Trindade")
                        email.set("devsuay@example.com")
                    }
                }
            }
        }
    }
}