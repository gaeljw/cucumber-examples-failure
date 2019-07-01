import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith
import org.scalatest.TestSuite
import org.scalatest.junit.JUnitSuite
//import org.scalatestplus.junit.JUnitSuite

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/features"),
  glue = Array("classpath:steps")
)
class CucumberTest extends JUnitSuite {
}
