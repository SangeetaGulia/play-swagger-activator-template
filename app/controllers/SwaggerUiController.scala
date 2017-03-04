package controllers

import models.{RequestWithBody, StudentRecord}
import play.api.libs.json.{JsValue, Json}
import play.api.mvc.{Action, AnyContent, Controller}
import utils.JsonHelper._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class SwaggerUiController extends Controller {

  val studentRecord = List(StudentRecord("1", "Vijay", "30"), StudentRecord("2", "Praveen Kumar", "28", Some(977777777)), StudentRecord("3", "Sangeeta Gulia", "24", Some(888888888)), StudentRecord("4", "Antra Raghav", "23"), StudentRecord("5", "Shweta Gaur", "24"))

  /**
    * generating mirror response getting parameter in form of FormUrlEncodedBody
    *
    * @return
    */
  def generateMirrorResponse: Action[AnyContent] = Action.async { implicit request =>
    val bodyMap = request.body.asFormUrlEncoded.fold(Map.empty[String, String])((data: Map[String, Seq[String]]) =>
      data map { case (k, Seq(v)) => (k, v) })
    val body: JsValue = Json.toJson(bodyMap)

    Future {
      body.asOpt[RequestWithBody].map(res => res.toRequestData) match {
        case Some(request) => Ok(Json.obj("data" -> request.toJson))
        case None => BadRequest(Json.obj("error" -> "Incorrect request format !!"))
      }
    }
  }

  /**
    * Get Student Record by Id using 'in path' param ..... demonstrating usage of optional parameter too
    *
    * @param id
    * @return
    */
  def getRecordById(id: Int): Action[AnyContent] = Action.async { implicit request =>
    Future {
      val listOfIds = studentRecord.map { student => student.id }
      if (listOfIds.contains(id.toString)) {
        Ok(Json.obj("data" -> (studentRecord.filter(_.id == id.toString).head).toJson))
      } else {
        BadRequest(Json.obj("error" -> "No record found for given id."))
      }
    }
  }

  /**
    * Get Student Record by id using querystring
    *
    * @return
    */
  def getStudentRecordById: Action[AnyContent] = Action.async { implicit request =>
    val id: String = request.queryString.get("id").fold("")(id => id.head)
    Future {
      val listOfIds = studentRecord.map { student => student.id }
      if (listOfIds.contains(id)) {
        Ok(Json.obj("data" -> (studentRecord.filter(_.id == id).head).toJson))
      } else {
        BadRequest(Json.obj("error" -> "No record found for given id."))
      }
    }
  }

}


