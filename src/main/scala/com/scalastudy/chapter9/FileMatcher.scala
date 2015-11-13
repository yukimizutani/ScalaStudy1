package com.scalastudy.chapter9

object FileMatcher {

  private def filesHere = new java.io.File("D:\\scala\\20150826").listFiles()

  def filesEnding(query:String) = {
    //for(file <- filesHere; if file.getName.endsWith(query))
    //  yield file
    //filesMatching(query,  (fileName:String, query:String) => fileName.endsWith(query) )
    filesMatching(_.endsWith(query) )
  }

  def filesContains(query:String) =  {
   // for(file <- filesHere; if file.getName.contains(query))
   //   yield  file
    filesMatching((fileName:String) => fileName.contains(query) )
    filesMatching(_.contains(query) )
  }

  def filesRegex(query:String)  = {
    //for(file <- filesHere; if file.getName.matches(query))
    //  yield file
    filesMatching(_.matches(query) )
  }

  def filesMatching(matcher:(String) => Boolean) =
    for( file <- filesHere; if matcher(file.getName))
      yield file



}
