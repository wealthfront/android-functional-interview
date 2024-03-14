plugins {
  alias(libs.plugins.androidApplication)
  alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
  namespace = "com.wealthfront.android_functional_interview"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.wealthfront.android_functional_interview"
    minSdk = 26
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  flavorDimensions.add("language")
  productFlavors {
    register("java")
    register("kotlin")
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.5.1"
  }
  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {

  // implementation fileTree(include: ['*.jar'], dir: 'libs')
  // implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$rootProject.kotlin_version"
  // implementation 'androidx.appcompat:appcompat:1.5.0'
  // implementation "com.google.android.material:material:1.6.1"
  // implementation 'androidx.core:core-ktx:1.8.0'
  // implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"
  // implementation "com.squareup.retrofit2:retrofit-mock:$retrofitVersion"
  // implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
  // implementation "io.reactivex.rxjava2:rxjava:$rxjavaVersion"
  // testImplementation 'junit:junit:4.13.2'
  // testImplementation "com.google.truth:truth:$truthVersion"
  // androidTestImplementation 'androidx.test:runner:1.4.0'
  // androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
  //
  implementation(libs.androidx.core.ktx)
  implementation(libs.androidx.lifecycle.runtime.ktx)
  implementation(libs.androidx.activity.compose)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.ui)
  implementation(libs.androidx.ui.graphics)
  implementation(libs.androidx.ui.tooling.preview)
  implementation(libs.androidx.material3)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
  androidTestImplementation(platform(libs.androidx.compose.bom))
  androidTestImplementation(libs.androidx.ui.test.junit4)
  debugImplementation(libs.androidx.ui.tooling)
  debugImplementation(libs.androidx.ui.test.manifest)
}