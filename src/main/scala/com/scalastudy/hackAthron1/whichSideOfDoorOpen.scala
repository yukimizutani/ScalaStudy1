package com.scalastudy.hackAthron1

import javafx.geometry.Side

/**
  * Created by USER on 2016/06/21.
  */
class whichSideOfDoorOpen(station: String, way: String) {
  val leftDoorOpen = Array("池袋", "田端", "西日暮里", "日暮里", "鶯谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋", "浜松町", "田町")
  val rightDoorOpen = Array("大塚", "巣鴨", "駒込")

  if (way == "外回り") {
    openDoor(leftDoorOpen,rightDoorOpen)
  } else if (way == "内回り") {
    openDoor(rightDoorOpen,leftDoorOpen)
  } else {
    println("外回りか内回りか指定してください。")
  }

  def openDoor(leftSide:Array[String], rightSide:Array[String]){
    if (leftSide.contains(station)) {
      println(s"${way}では、${station}は左側のドアが開きます。")
    } else if (rightSide.contains(station)) {
      println(s"${way}では、${station}は右側のドアが開きます。")
    } else {
      println("その駅は存在しません。")
    }
  }
}