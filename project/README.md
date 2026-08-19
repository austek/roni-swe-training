# library-management-system

Spring Boot 4.1, Java 17, Gradle.

## Running locally

```
./gradlew build
./gradlew spotlessApply   # auto-format before committing
./gradlew spotlessCheck   # what CI runs
```

## A note on dependency names

This project targets Spring Boot 4.1, which renamed several starter dependencies. Most
tutorials and Stack Overflow answers still reference the old names — if you add a
dependency by copying one of those, it may not resolve. Compare against what's already in
`build.gradle` first (e.g. this project uses `spring-boot-starter-webmvc`, not the older
`spring-boot-starter-web`).
