package controllers

import models.RequestWithBody
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Action, AnyContent, Controller, Result}
import utils.JsonHelper._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
  * Created by knodus on 18/9/16.
  */
class SwaggerUiController extends Controller {

  def generateMirrorResponse: Action[AnyContent] = Action.async { implicit request =>
    val bodyMap = request.body.asFormUrlEncoded.fold(Map.empty[String, String])((data: Map[String, Seq[String]]) =>
      data map { case (k, Seq(v)) => (k, v) })
    val body: JsValue = Json.toJson(bodyMap)

    val responseDataOpt: Option[RequestWithBody] = body.asOpt[RequestWithBody].map(res => res.toRequestData)
    Future {
      responseDataOpt match {
        case Some(request) => Ok(Json.obj("data" -> request.toJson))
        case None => BadRequest(Json.obj("error" -> "Incorrect request format !!"))

      }
    }
  }
}


