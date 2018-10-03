package se.bfiles.gfiles.base

trait Subject {
  private var _id: String = _

  def id: String = _id

  def id_= (i:String):Unit = _id = i
}
