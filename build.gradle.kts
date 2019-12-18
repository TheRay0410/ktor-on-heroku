val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.3.60"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "com.r4wxii.herokuapp"
version = "0.0.1"

application {
    mainClassName = "com.r4wxii.herokuapp.ApplicationKt"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
}

kotlin.sourceSets["main"].kotlin.srcDirs("src")

sourceSets["main"].resources.srcDirs("resources")

tasks.shadowJar {
    archiveBaseName.set("HerokuApp")
}