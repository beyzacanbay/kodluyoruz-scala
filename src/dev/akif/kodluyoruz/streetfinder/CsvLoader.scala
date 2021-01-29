package dev.akif.kodluyoruz.streetfinder

import java.io.File



trait CsvLoader {
  def loadCsv(file: File): List[String]
}


  class LoadCSV extends CsvLoader{
    override def loadCsv(file: File): List[String] = {
      val liste : List[String] = io.Source.fromFile(file).getLines.map(_.split(",")(1)).toList
      liste

    }
  }







