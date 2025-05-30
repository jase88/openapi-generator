/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using modelData.mustache
package sample.cask.model
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*


        /** ComplexRequestNestedObjectData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class ComplexRequestNestedObjectData(
/* A field within a nested object */
  nestedField1: String = "" ,
/* Another field in a nested object */
  nestedField2: Int = 0 
  

) derives RW {

  def asJsonString: String = asJson.toString()

  def asJson : ujson.Value = {
    val jason = writeJs(this)
    jason
  }

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val _allValidationErrors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ================== nestedField1 validation ==================
        
        
        
        

        // ================== nestedField2 validation ==================
        
        
        
        

    _allValidationErrors.toSeq
  }

  /**
   * @return the validated model within a Try (if successful)
   */
  def validated(failFast : Boolean = false) : scala.util.Try[ComplexRequestNestedObject] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : ComplexRequestNestedObject = {
    ComplexRequestNestedObject(
        nestedField1 = Option(nestedField1) /* 1 */,
        nestedField2 = Option(nestedField2) /* 1 */
    
    )
  }
}

object ComplexRequestNestedObjectData {

  def validated(d8a : ComplexRequestNestedObjectData, failFast : Boolean) : scala.util.Try[ComplexRequestNestedObject] = d8a.validated(failFast)

  def fromJson(jason : ujson.Value) : ComplexRequestNestedObjectData = try {
        val data = read[ComplexRequestNestedObjectData](jason)
        data
    } catch {
      case NonFatal(e) => sys.error(s"Error creating ComplexRequestNestedObjectData from json '$jason': $e")
  }

  def fromJsonString(jason : String) : ComplexRequestNestedObjectData = {
        val parsed = try {
           read[ujson.Value](jason)
        } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
        }
        fromJson(parsed)
  }

  def manyFromJsonString(jason : String) : Seq[ComplexRequestNestedObjectData] = try {
        read[List[ComplexRequestNestedObjectData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[ComplexRequestNestedObject]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[ComplexRequestNestedObject]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, ComplexRequestNestedObjectData] = try {
        read[Map[String, ComplexRequestNestedObjectData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, ComplexRequestNestedObject]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, ComplexRequestNestedObject]())) {
         case (Success(map), (key, next)) =>
           next.validated(failFast) match {
             case Success(ok) => Success(map.updated(key, ok))
             case Failure(err) => Failure(new Exception(s"Validation error on element $key: ${err.getMessage}", err))
           }
         case (fail, _) => fail
       }
     }
  }
}

