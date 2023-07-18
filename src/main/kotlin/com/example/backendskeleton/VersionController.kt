package com.example.backendskeleton

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/version")
class VersionController() {
    @GetMapping("")
    fun getVersion(): GetVersion {
        return GetVersion(version = "0.0.1")
    }
}