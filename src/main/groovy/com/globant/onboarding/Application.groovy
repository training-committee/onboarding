package com.globant.onboarding

import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application {
    public static void main(String[] args) {
        def app = new SpringApplication(Application.class)
        app.setBannerMode(Banner.Mode.OFF)
        app.run(args)
    }
}
