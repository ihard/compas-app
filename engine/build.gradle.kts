import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm")
}

buildscript {

}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.reactivex.rxjava2:rxjava:2.1.1");
    implementation("com.google.code.gson:gson:2.8.5");
    testImplementation("org.testng:testng:7.1.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test-testng:1.3.61");
    testImplementation("org.mockito:mockito-core:3.2.4");
}

tasks.getByName<Test>("test") {
    useTestNG()
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}