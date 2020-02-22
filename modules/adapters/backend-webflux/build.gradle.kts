plugins {
    id("org.springframework.boot") version "2.2.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    id("java")
    id("io.freefair.lombok") version "4.1.6"
}

/*
group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '1.8'
*/

repositories {
  mavenCentral()
}

dependencies {
    implementation(project(":modules:domain:orders"))
    implementation(project(":modules:app:order-management"))
    implementation(project(":modules:adapters:order-store-inmem"))

    implementation("org.springframework.boot:spring-boot-starter-webflux")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation("io.projectreactor:reactor-test")
}

