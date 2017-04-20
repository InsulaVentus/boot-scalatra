package no.nordea.tokenexchangepoc

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ServerTest extends FunSuite {

  test("this test always runs green") {
    print("Go figure")
  }

  test("this test always fails") {
    fail()
  }
}
