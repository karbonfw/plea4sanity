val vavrVersion: String by project
val reactorCoreVersion: String by project

plugins {
    `java-library`
    id("io.freefair.lombok") version "4.1.6"
}

dependencies {
    implementation(project(":modules:domain:geographic"))
    implementation("io.vavr:vavr:${vavrVersion}")
    implementation("io.projectreactor:reactor-core:${reactorCoreVersion}")
}
