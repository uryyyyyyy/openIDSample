name := """openIDSample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test",
	"junit" % "junit" % "4.12" % "test",
	"com.sparkjava" % "spark-core" % "2.3",
	"com.google.http-client" % "google-http-client-jackson2" % "1.21.0",
	"com.sparkjava" % "spark-template-thymeleaf" % "2.3",
	"com.google.oauth-client" % "google-oauth-client" % "1.21.0"

)
