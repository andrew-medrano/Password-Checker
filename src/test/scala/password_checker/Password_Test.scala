package password_checker

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Password_Test extends AnyFunSpec with Matchers {
  describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters") {
        val tooShort = "abcde"
        val longEnough = "abcde1"
        val evenLonger = "abcdefghi1"
        Password.isValid(tooShort) shouldBe false
        Password.isValid(longEnough) shouldBe true
        Password.isValid(evenLonger) shouldBe true
      }
    }
    describe("and determines proper composition"){
      it("rejects passwords which don't contain a number") {
        val doesntContainNumber = "abcdefgh"
        val containsNumber = "abcd3223sks"
        Password.isValid(doesntContainNumber) shouldBe false
        Password.isValid(containsNumber) shouldBe true
      }
    }
  }
}
