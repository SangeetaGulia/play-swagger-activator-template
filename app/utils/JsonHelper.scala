package utils

import models.RequestWithBody
import play.api.libs.json.Json

object JsonHelper {

  implicit val requestWithBodyFormatter = Json.format[RequestWithBody]

}
