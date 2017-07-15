package com.iqmsoft.kafkascala

import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object Main extends App {

  println("Running Test Scala Code...")
  MyProducer.processMessages.andThen({
    case Success(_) =>
      println("Loading Good Data")
      MyConsumer.loadData
    case Failure(msg) => msg.printStackTrace()
  })

  while(true) {

  }

}
