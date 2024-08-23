plugins {
    application
    kotlin("jvm")
    id("com.gradleup.shadow")
}

application {
    mainClass.set("androidx.baselineprofiles.ProfileSplitterKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.ajalt.clikt:clikt:3.3.0")
}
