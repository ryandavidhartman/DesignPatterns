package com.scala.strategy

import com.scala.strategy.Strategies._

case class ModelDuck(flyingStrategy:FlyingStrategy = Strategies.flyNoWayStrategy,
                      quackStrategy:QuackStrategy = Strategies.muteStrategy) extends Duck {

  def display: Unit = System.out.println("I'm a duck Decoy")

}