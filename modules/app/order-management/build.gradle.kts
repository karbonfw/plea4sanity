plugins {
    `java-library`
    id("io.freefair.lombok") version "4.1.6"
}

dependencies {
    implementation(project(":modules:domain:orders"))
    implementation("io.vavr:vavr:0.10.2")
}
