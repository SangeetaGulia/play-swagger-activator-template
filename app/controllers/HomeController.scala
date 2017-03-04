  package controllers

  import javax.inject._

  import models.HomeGateway
  import play.api.libs.json.Json
  import play.api.mvc._

  /**
    * This controller creates an `Action` to handle HTTP requests to the
    * application's home page.
    */
  @Singleton
  class HomeController @Inject() extends Controller {

    /**
      * Create an Action to render an HTML page that gives the gateway name.
      * The configuration in the `routes` file means that this method
      * will be called when the application receives a `GET` request with
      * a path of `/`.
      */
    def index = Action {
      implicit val a = Json.format[HomeGateway]
      val gateway = HomeGateway("gateway1")
      Ok(Json.toJson(gateway))
    }

  }
