
plugins {
    // Apply the java plugin to add support for Java
    java
}

allprojects {

    group = "karbonfw.plea4sanity"
    version = "1.0.0-SNAPSHOT"

    tasks.getting(Test::class) {
        // Use junit platform for unit tests
        useJUnitPlatform()
    }

    repositories {
        // Use jcenter for resolving dependencies.
        // You can declare any Maven/Ivy/file repository here.
        jcenter()
        //mavenCentral()
    }
}

/*
application {
    // Define the main class for the application.
    mainClassName = "karbonfw.p4s.App"
}
*/
