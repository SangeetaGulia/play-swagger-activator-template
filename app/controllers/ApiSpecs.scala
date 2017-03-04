package controllers

import com.google.inject.Inject
import play.api.libs.concurrent.Execution.Implicits._
import com.iheart.playSwagger.SwaggerSpecGenerator
import play.api.mvc.{Action, Controller}

import scala.concurrent.Future

class ApiSpecs extends Controller {
  implicit val cl = getClass.getClassLoader

  // The root package of your domain classes, play-swagger will automatically generate definitions when it encounters class references in this package.
  val domainPackage = "models"
  private lazy val generator = SwaggerSpecGenerator(domainPackage)

  def specs = Action.async { _ =>
      Future.fromTry(generator.generate()).map(Ok(_)) //generate() can also taking in an optional arg of the route file name.
    }

}
