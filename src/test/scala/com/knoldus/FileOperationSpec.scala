/*package com.knoldus

import org.scalatest._

import scala.concurrent.Future
import scala.util.Success

class FileOperationSpec extends FlatSpec {
val  fileOperation = new FileOperation

  "getList method" should "return the number of files in folder1" in{
  val actualResult = fileOperation.getList("/home/sparsh/folder1")
    val expextedResult = Future(Success(List("/home/sparsh/folder1/file1.txt", "/home/sparsh/folder1/folder3/file2.txt", "/home/sparsh/folder1/folder3/file3.txt")
    assert(expextedResult == actualResult)
  }
  //"getFile method" should "return the number of files in every folder" in{

  //}

}

 */