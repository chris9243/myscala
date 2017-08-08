
def AddorSub(from:Int,to:Int):Unit = {
	println(from)
	if (from != to) {
		AddorSub(from + (if(from < to) 1 else -1), to)
	}

}