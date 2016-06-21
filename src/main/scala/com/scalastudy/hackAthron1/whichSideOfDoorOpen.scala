package com.scalastudy.hackAthron1

import javafx.geometry.Side

/**
  * Created by USER on 2016/06/21.
  */
class whichSideOfDoorOpen(station: String, way: String) {
  val leftDoorOpen = Array("池袋", "田端", "西日暮里", "日暮里", "鶯谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋", "浜松町", "田町")
  val rightDoorOpen = Array("大塚", "巣鴨", "駒込")

  if (way == "外回り") {
    if (leftDoorOpen.contains(station)) {
      println(s"${way}では、${station}は左側のドアが開きます。")
    } else if (rightDoorOpen.contains(station)) {
      println(s"${way}では、${station}は右側のドアが開きます。")
    } else {
      println("その駅は存在しません。")
    }
  } else if (way == "内回り") {
    if (rightDoorOpen.contains(station)) {
      println(s"${way}では、${station}は左側のドアが開きます。")
    } else if (leftDoorOpen.contains(station)) {
      println(s"${way}では、${station}は右側のドアが開きます。")
    } else {
      println("その駅は存在しません。")
    }
  } else {
    println("外回りか内回りか指定してください。")
  }

  //  var i = 0
  //
  //  if(way=="外回り") {
  //    if (side == "左側") {
  //      println("外回りで左側のドアが開くのは：")
  //      while (i < leftDoorOpen.length) {
  //        println(leftDoorOpen(i))
  //        i += 1
  //      }
  //    } else {
  //      println("外回りで右側のドアが開くのは：")
  //      while (i < rightDoorOpen.length) {
  //        println(rightDoorOpen(i))
  //        i += 1
  //      }
  //    }
  //  }else{
  //    if (side == "左側") {
  //      println("内回りで左側のドアが開くのは：")
  //      while (i < rightDoorOpen.length) {
  //        println(rightDoorOpen(i))
  //        i += 1
  //      }
  //    } else {
  //      println("内回りで右側のドアが開くのは：")
  //      while (i < leftDoorOpen.length) {
  //        println(leftDoorOpen(i))
  //        i += 1
  //      }
  //    }
  //  }
}