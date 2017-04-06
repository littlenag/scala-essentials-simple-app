package essentials

import org.scalatest._

class HelloSpec extends UnitSpec {

  "Hello" should {
    "have a saying" in {
      Hello.getText should be("Hello World!")
    }
  }

  "Exercise 4" should {
    "Write unit tests for the Map key/value reversing function you wrote in Exercise 2." in {
      // Your code here!
    }
  }

  "Exercise 5" should {
    // Write a function that will transform a List[String] to a List[Double].
    def toDoubles(stringList:List[String]) : List[Double] = Nil

    "Write a unit test for the toDoubles function." in {
      // Your code here!
    }
  }

  "Exercise 6" should {
    "Write a unit test for the code multiplication table printer you wrote in Exercise 1." in {
      // Your code here!
    }
  }
}
