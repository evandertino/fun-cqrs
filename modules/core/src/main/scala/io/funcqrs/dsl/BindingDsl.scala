package io.funcqrs.dsl

import scala.language.{ higherKinds, implicitConversions }

object BindingDsl {

  val api = Api
  object Api extends SpecSupport with BindingSupport

}

