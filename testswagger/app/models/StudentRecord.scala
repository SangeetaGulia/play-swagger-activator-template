package models

/**
  * Created by knodus on 23/9/16.
  */

case class StudentRecordResponse(data: StudentRecord)

case class StudentRecord (id: String, name: String, age: String){

  def toJson: play.api.libs.json.JsValue = play.api.libs.json.Json.toJson(serialize)

  def serialize: Map[String, String] =
    Map(
      "id" -> id,
      "name" -> name,
      "age" -> age
    ) map {
      case (key,value) => (key, value.toString)
    }
}
