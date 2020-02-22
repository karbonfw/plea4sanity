val vavrVersion: String by project
val reactorCoreVersion: String by project

plugins {
    id("java")
}

dependencies {
    implementation(project(":modules:domain:orders"))
    implementation(project(":modules:app:order-management"))

    implementation("io.projectreactor:reactor-core:${reactorCoreVersion}")
    implementation("io.vavr:vavr:${vavrVersion}")
}
