libraryDependencies += "org.specs2" %% "specs2-core" % "4.9.3" % "test"

TaskKey[Unit]("check") := {
  assert(file("test_class.txt").exists, "test_class.txt does not exists")
  assert(file("test_object.txt").exists, "test_object.txt does not exists")
}
