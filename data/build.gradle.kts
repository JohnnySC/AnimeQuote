plugins {
    id("org.jetbrains.kotlin.jvm")
}
dependencies {
    implementation(project(":domain"))

    implementation(group = "javax.inject", name = "javax.inject", version = "1")
    api("com.squareup.retrofit2:retrofit:2.9.0")
    api("com.squareup.retrofit2:converter-gson:2.9.0")
}