package edu.self
package controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {
  @RequestMapping(Array("/"))
  def index(): String = "Hello from the unnatural fusion of Scala and Spring Boot.!"
}
