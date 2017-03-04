package models

case class StudentRecordResponse(data: StudentRecord)

case class StudentRecord (id: String, name: String, age: String, contact: Option[Long]= None) {

  def toJson: play.api.libs.json.JsValue = play.api.libs.json.Json.toJson(serialize)

  def serialize: Map[String, String] =
    Map(
      "id" -> id,
      "name" -> name,
      "age" -> age,
      "contact" -> contact.getOrElse("")
    ) map {
      case (key,value) => (key, value.toString)
    }
}
