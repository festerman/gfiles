import se.bfiles.gfiles.base._

println("Welcome to the Scala worksheet")

var p1 = new Person()

p1.name = "Staffan Bergh"
p1.id = "1"
p1.gender = Male
p1.print()

var p2 = new Person();                    //> p2  : se.bfiles.gfiles.base.Person = Person null: null (null)
  p2.name = "Lena Andersson"
p2.id = "2"

p2.print();                                 //> Person 2: Lena Andersson (null)

  val e = new Event("Vigsel", p2, p1)
val e2 = new Event()

e2.desc = "Förlovning"
e2.id = "2"
e2.participants = List((p1,Principal),(p2,Principal))

var p3 = new Person("Jonathan", Male)
p3.id = "3"

val e3 = new Event()
e3.desc = "Födelse"
e3.id = "3"
e3.push_participant((p3, Principal))
e3.push_participant((p2, Participant))
e3.push_participant((p1, Participant))
e.print()
e2.print()
e3.print()

val r1 = new Relationship ()
r1.reltype = Couple
r1.p1 = p2
r1.p2 = p1

   println(r1)

