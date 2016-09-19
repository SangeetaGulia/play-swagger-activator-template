package models

case class RequestWithBody(name: String, id: String, position: String){

  def toJson: play.api.libs.json.JsValue = play.api.libs.json.Json.toJson(serialize)

  def serialize: Map[String, String] =
    Map(
      "name" -> name,
      "id" -> id,
      "position" -> position
    ) map {
      case (key,value) => (key, value.toString)
    }

  lazy val toRequestData = RequestWithBody(name, id, position)

}