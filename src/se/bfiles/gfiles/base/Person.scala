package se.bfiles.gfiles.base

class Person extends Subject () {
  private var _name: String = _
  private var _gender: Gender = _

  def this(n: String, g: Gender) {
    this()
    _name = n
    _gender = g
  } 
  
  def name: String = _name

  def name_= (n:String):Unit = _name = n

  def gender: Gender = _gender

  def gender_= (g:Gender):Unit = _gender = g

  override def toString: String =
    "Person " + id + ": " + name + " (" + gender + ")"

  def print (): Unit = {
    println(toString())
  }
}

sealed trait Gender

case object Male extends Gender
case object Female extends Gender
case object Unknown extends Gender
