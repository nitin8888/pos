package com.rbc.pos.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The class to launch the BDD feature file.
 * 
 * @author Nitin Shreyakar
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\rbc\\pos\\bdd\\feature"} , glue = {"com.rbc.pos.bdd"})
public class CostCalculatorBDDTest {
}
