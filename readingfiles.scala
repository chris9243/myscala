
import scala.io.Source

if (args.length > 0){
	for(line <- Source.fromFile(args(0)).getLines)
	println(line.length + ": " + line)
}
else println("No file was given")