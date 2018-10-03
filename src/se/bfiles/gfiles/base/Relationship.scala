package se.bfiles.gfiles.base

sealed trait RelationshipType {
  def directed: Boolean
  def toString(p1: Person, p2: Person): String
}

case object Couple extends RelationshipType {
  val directed = false
  def toString(p1: Person, p2: Person): String = p1 + " and " + p2 + " is a couple"
}

case object ParentChild extends RelationshipType {
  val directed = true
  def toString(p1: Person, p2: Person): String = p1 + " is a parent of " + p2
}

// The Relationship data type describes a relationship between two persons.

class Relationship extends Subject () {
  private var _reltype: RelationshipType = _
  private var _p1: Person = _
  private var _p2: Person = _
  
  def reltype: RelationshipType = _reltype
  def reltype_= (t: RelationshipType): Unit = _reltype = t

  def p1: Person = _p1
  def p1_= (p: Person): Unit = _p1 = p

  def p2: Person = _p2
  def p2_= (p: Person): Unit = _p2 = p
  
  override def toString: String = {
    if (reltype != null)
      reltype.toString(p1, p2)
    else
      "type not set"
  }
}
