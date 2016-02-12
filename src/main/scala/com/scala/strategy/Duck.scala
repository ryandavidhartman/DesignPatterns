package com.scala.strategy

import com.scala.strategy.Strategies._


trait Duck {

  val quackStrategy: QuackStrategy
  val flyingStrategy: FlyingStrategy

  def display()
  def swim() = System.out.println("All ducks float, even decoys!")
  def fly() = flyingStrategy()
  def quack() = quackStrategy()
}


