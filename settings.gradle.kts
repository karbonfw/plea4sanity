rootProject.name = "plea4sanity"

// domain
include(":modules:domain:orders")

// api
include(":modules:api:orders")

// app
include(":modules:app:order-management")

// ports & adapters
include(":modules:adapters:backend-webflux")
include(":modules:adapters:order-store-inmem")
