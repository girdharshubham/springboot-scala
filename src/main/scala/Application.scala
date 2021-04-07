package edu.self

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootConfig

object Application {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[BootConfig])
  }

}
