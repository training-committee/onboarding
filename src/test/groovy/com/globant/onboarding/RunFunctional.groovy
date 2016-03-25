package com.globant.onboarding

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(
        format=["pretty", "html:build/reports/cucumber"],
        strict=true,
        tags = ["~@ignore"]
)
class RunFunctional {}
