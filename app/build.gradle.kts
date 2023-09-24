import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("com.google.dagger.hilt.android")
    //id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.conduitrealworldapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.conduitrealworldapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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

    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    //glied
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")

    //navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.7.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.3")

    //activity fragment ktx
    implementation("androidx.activity:activity-ktx:1.7.2")
    implementation("androidx.fragment:fragment-ktx:1.6.1")

    //hilt
    implementation("com.google.dagger:hilt-android:2.44")
    annotationProcessor ("com.google.dagger:hilt-compiler:2.44")


    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$2.6.2")
    implementation ("androidx.lifecycle:lifecycle-common-java8:$2.6.2")

    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$2.6.2")

    //coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    //test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}