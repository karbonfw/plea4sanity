# Plea for sanity
A Webflux based reference project using hexagonal architecture.

[![CircleCI](https://circleci.com/gh/karbonfw/plea4sanity/tree/master.svg?style=svg)](https://circleci.com/gh/karbonfw/plea4sanity/tree/master)

How to build:
```
./gradlew build
```

How to run:
```
./gradlew bootRun
```
and then access: http://localhost:8080/orders/123

# Architecture
Fully hexagonal architecture with dependencies between modules visualized on
following package diagram:

![Package dependencies](http://www.plantuml.com/plantuml/png/5Sqz3i8m34VndLF00QWN9gPUnKt-q0Z7YVoXYjjJfgSt_LOFjiWkbrlJ8bcH9jSzOlgJoFXOtYtstD9XPMX0OocZquTj6_ewQ0huuQmjljJP0qPzr1JSAoQqGak3B_DFhEUV_G40)

* Green - domain & API
* Pink - application
* Blue - ports & adapters
