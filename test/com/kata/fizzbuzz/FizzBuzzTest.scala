import org.specs._

class FizzBuzzTest extends Specification {

	"FizzBuzz" should {
		"must cant divide two numbers" in {
		var fizzBuzz = new FizzBuzz
		var result =fizzBuzz.divide(2,2)
		result mustEquals 1
		}
	}

}
