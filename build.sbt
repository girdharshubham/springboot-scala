name := "springboot-scala"

version := "0.1"

scalaVersion := "2.13.5"

idePackagePrefix := Some("edu.self")

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.4.4",
  "org.springframework.boot" % "spring-boot-starter-test" % "2.4.4" % Test
)