plugins {
    base
    kotlin("jvm") version "1.3.70" apply false
}

allprojects {
    group = "xyz.kektech"

    version = "1.0"

    repositories {
        jcenter()
    }
}
