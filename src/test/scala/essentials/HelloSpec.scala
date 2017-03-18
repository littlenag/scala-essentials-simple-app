package essentials

import org.scalatest._

class HelloSpec extends UnitSpec {

  "Hello" should {
    "have a saying" in {
      Hello.getText should be("Hello World!")
    }
  }

}
