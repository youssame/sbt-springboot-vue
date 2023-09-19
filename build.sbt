name := "SbtSpringBootVue"
description := "A demo how to use Spring Boot with Java and SBT "

lazy val buildSettings = Seq(
    organization        := "com.youssame.app",
    version             := "0.1",
  )

libraryDependencies ++= Seq(
	// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
	"org.springframework.boot" % "spring-boot-starter-web" % "3.1.0",
	
	// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test
	"org.springframework.boot" % "spring-boot-starter-test" % "3.1.3" % Test,

  // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools
  "org.springframework.boot" % "spring-boot-devtools" % "3.1.3" % true

)