plugins {
    id("java")
    id("war")
}

group = "lk.ijse"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework:spring-webmvc:5.3.29")
    implementation("org.springframework.data:spring-data-jpa:2.7.15")
    annotationProcessor("org.springframework.data:spring-data-jpa:2.7.15")
    compileOnly("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    implementation("org.hibernate:hibernate-core:5.6.15.Final")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    implementation("org.modelmapper:modelmapper:3.1.1")
}

tasks.test {
    useJUnitPlatform()
}