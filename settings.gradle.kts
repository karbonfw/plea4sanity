rootProject.name = "plea4sanity"

// domain
include(":modules:domain:orders")

// app
include(":modules:app:order-management")

// ports & adapters
include(":modules:adapters:backend-webflux")
include(":modules:adapters:order-store-inmem")
