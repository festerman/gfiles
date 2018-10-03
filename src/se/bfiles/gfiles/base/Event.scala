package se.bfiles.gfiles.base

class Event extends Subject () {
  private var _desc: String = _
  private var _participants: List[(Person, EventRole)] = Nil

  def this(desc: String, p1: Person, p2: Person) {
    this()
    _desc = desc
    _participants = List((p1,null),(p2,null))
  }
  
  def desc: String = _desc

  def desc_= (d: String): Unit = _desc = d

  def participants: List[(Person, EventRole)] = _participants

  def participants_= (p: List[(Person, EventRole)]): Unit = _participants = p

  def push_participant (t: (Person, EventRole)):Unit =
    _participants = t :: participants

  override def toString: String =
    participants mkString ("Event " + id + ":\n\t","\n\t","")

    def print (): Unit = {
      println(toString())
    }
}

sealed trait EventRole

case object Principal extends EventRole
case object Participant extends EventRole
