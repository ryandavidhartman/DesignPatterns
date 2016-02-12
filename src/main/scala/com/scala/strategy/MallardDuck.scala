package com.scala.strategy

import com.scala.strategy.Strategies.{QuackStrategy, FlyingStrategy}

case class MallardDuck(flyingStrategy:FlyingStrategy = Strategies.flyWithWingsStrategy,
                       quackStrategy:QuackStrategy = Strategies.quackStrategy) extends Duck {

  def display: Unit = System.out.println("I'm a real Mallard duck")

}
