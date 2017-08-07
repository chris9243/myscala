
import scala.collection.mutable

val treasureMap = mutable.Map.empty[Int, String]

treasureMap += (1 -> "Go to Island")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Dig")

println(treasureMap(2))


val mymap = Map(1->"one",2->"two",3->"three",4->"four")

mymap(3)
