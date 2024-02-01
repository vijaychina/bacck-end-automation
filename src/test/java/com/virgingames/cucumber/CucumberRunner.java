package com.virgingames.cucumber;

import com.virgingames.testbase.TestBase;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/"
        , tags = ""

)

public class CucumberRunner extends TestBase {

}
