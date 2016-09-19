package utils

import models.RequestWithBody
import play.api.libs.json.Json

/**
  * Created by knodus on 18/9/16.
  */
object JsonHelper {

  implicit val requestWithBodyFormatter = Json.format[RequestWithBody]

}
