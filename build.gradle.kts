subprojects {
    apply(plugin = "java-library")
    dependencies {
        "testImplementation"("junit:junit:4.12")
    }
}

allprojects {
    group = "zzx.leetcode"
    version = "0.0.1"

    repositories {
        jcenter()
    }
}