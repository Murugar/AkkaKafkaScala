package com.iqmsoft

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

package object kafkascala {

  implicit val system = ActorSystem("kafka-scala")
  implicit val mat = ActorMaterializer()

}
