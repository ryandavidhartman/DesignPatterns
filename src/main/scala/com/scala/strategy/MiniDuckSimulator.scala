package com.scala.strategy




object MiniDuckSimulator {
  def main(args: Array[String]): Unit = {
    System.out.println("Hi From Scala")
    val mallard: MallardDuck = new MallardDuck
    val rubberDuckie: RubberDuck = new RubberDuck
    val decoy: DecoyDuck = new DecoyDuck

    val model: ModelDuck = new ModelDuck

    mallard.quack()
    rubberDuckie.quack()
    decoy.quack()

    model.fly()
    val model2 = new ModelDuck(Strategies.flyRocketPoweredStrategy)
    model2.fly()

  }

}
