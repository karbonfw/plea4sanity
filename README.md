# Plea for Sanity
A Webflux based reference project using hexagonal architecture.

[![CircleCI](https://circleci.com/gh/karbonfw/plea4sanity/tree/master.svg?style=svg)](https://circleci.com/gh/karbonfw/plea4sanity/tree/master)

## Running
How to build:
```
./gradlew build
```

How to run:
```
./gradlew bootRun
```
and then access: http://localhost:8080/customers/123/orders

## Architecture
Fully hexagonal architecture with dependencies between modules visualized on
following package diagram:

![Package dependencies](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/karbonfw/plea4sanity/master/module-dependencies.puml)

* Green - domain & API
* Pink - application
* Blue - ports & adapters
