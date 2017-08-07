
import scala.collection.mutable

val treasureMap = mutable.Map.empty[Int, String]

treasureMap += (1 -> "Go to Island")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Dig")

println(treasureMap(2))