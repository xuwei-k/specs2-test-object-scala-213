package example

import org.specs2.mutable.Specification
import java.nio.file.{Files, Path, Paths}
import java.nio.charset.StandardCharsets.UTF_8

class TestClass extends Specification {
  "a1" should {
    "b1" in {
      Files.write(Paths.get("test_class.txt"), "x1".getBytes(UTF_8))
      1 must_== 1
    }
  }
}

object TestObject extends Specification {
  "a2" should {
    "b2" in {
      Files.write(Paths.get("test_object.txt"), "x2".getBytes(UTF_8))
      1 must_== 1
    }
  }
}
