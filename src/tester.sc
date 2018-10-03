val l = List[Tuple2[Any, Any]]((1,"a"), ("b", 2))

l.mkString("[",",","]") //returns "[a,b,c]"
l.mkString(" - ") // returns "a - b - c"
//or the same, using infix notation
l mkString ","