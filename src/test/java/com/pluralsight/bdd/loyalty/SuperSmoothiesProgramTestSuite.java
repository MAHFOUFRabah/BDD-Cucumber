package com.pluralsight.bdd.loyalty;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "classpath:com/pluralsight/bdd/feature",
                  glue ="com.pluralsight.bdd")
public class SuperSmoothiesProgramTestSuite {
}
