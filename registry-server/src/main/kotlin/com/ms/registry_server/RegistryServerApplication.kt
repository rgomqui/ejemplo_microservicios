package com.ms.registry_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class RegistryServerApplication

fun main(args: Array<String>) {
	runApplication<RegistryServerApplication>(*args)
}
