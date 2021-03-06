package pravda

import java.nio.file.{Files, Paths}

import pravda.dotnet.parser.FileParser
import pravda.dotnet.parser.FileParser.{ParsedDotnetFile, ParsedPdb, ParsedPe}

package object dotnet {

  private def readResourceBytes(filename: String) =
    Files.readAllBytes(Paths.get(s"dotnet-tests/resources/$filename"))

  def parsePeFile(file: String): Either[String, ParsedPe] = {
    val fileBytes = readResourceBytes(file)
    FileParser.parsePe(fileBytes)
  }

  def parsePdbFile(file: String): Either[String, ParsedPdb] = {
    val fileBytes = readResourceBytes(file)
    FileParser.parsePdb(fileBytes)
  }

  def parseDotnetFile(exeFile: String, pdbFile: Option[String]): Either[String, ParsedDotnetFile] =
    FileParser.parseDotnetFile(readResourceBytes(exeFile), pdbFile.map(readResourceBytes))
}
