package dev.akif.kodluyoruz.streetfinder

trait StreetFinder {
  def findStreets(streets: List[String], names: Set[String]): List[String]

}
class FindStreets extends StreetFinder{
  override def findStreets(streets: List[String], names: Set[String]): List[String] = {
    names.flatMap(name => {streets.filter(_.toLowerCase().contains(name.toLowerCase()))}).toList

  }
}



