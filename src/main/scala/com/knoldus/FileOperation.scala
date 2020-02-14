package com.knoldus

import java.io.File

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class FileOperation {
  def getList(path: String): Future[List[File]] = {
    def getFile(path: String, emptyList: List[File]): List[File] = {
      val directory = new File(path)
      if (directory.exists() && directory.isDirectory) {
        val files = emptyList ::: directory.listFiles.filter(_.isFile()).toList

        val listDirectory = directory.listFiles.filter(_.isDirectory).toList
        files ::: listDirectory.flatMap(a => getFile(a.getPath, List[File]()))
      }
      else {
        emptyList
      }

    }

    Future {
      getFile(path, List())
    }
  }


}

