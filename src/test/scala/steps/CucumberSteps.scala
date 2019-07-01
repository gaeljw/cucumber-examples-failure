package steps

import cucumber.api.scala.{EN, ScalaDsl}
import org.scalatest.Matchers

class CucumberSteps extends ScalaDsl with EN with Matchers {

  private var sum: Int = _

  When("""^we add "([^"]*)" to "([^"]*)"$""") { (x: Int, y: Int) =>
    sum = x + y
  }

  Then("""^sum equals "([^"]*)"$""") { (expectedSum: Int) =>
    sum shouldEqual expectedSum
  }

}
