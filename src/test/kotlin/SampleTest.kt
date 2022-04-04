import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class MyTests : DescribeSpec({
    describe("setting up kotest with describe style") {
        it("passes the simpliest test") {
            val result = true

            result shouldBe true
        }
    }
})