
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sangeeta/projects/contribute/testSwagger/conf/routes
// @DATE:Sat Mar 04 12:27:42 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:17
  HomeController_0: controllers.HomeController,
  // @LINE:20
  ApiSpecs_2: controllers.ApiSpecs,
  // @LINE:23
  Assets_1: controllers.Assets,
  // @LINE:75
  SwaggerUiController_3: controllers.SwaggerUiController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:17
    HomeController_0: controllers.HomeController,
    // @LINE:20
    ApiSpecs_2: controllers.ApiSpecs,
    // @LINE:23
    Assets_1: controllers.Assets,
    // @LINE:75
    SwaggerUiController_3: controllers.SwaggerUiController
  ) = this(errorHandler, HomeController_0, ApiSpecs_2, Assets_1, SwaggerUiController_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ApiSpecs_2, Assets_1, SwaggerUiController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """swagger.json""", """controllers.ApiSpecs.specs"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docs/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public/lib/swagger-ui", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mirror/body/data""", """controllers.SwaggerUiController.generateMirrorResponse"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """student/record/""" + "$" + """id<[^/]+>""", """controllers.SwaggerUiController.getRecordById(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """get/student/record""", """controllers.SwaggerUiController.getStudentRecordById"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:17
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """##
{
	"responses": {
		"200": {
			"description": "success",
			"schema": {
				"""" + "$" + """ref": "#/definitions/models.HomeGateway"
			}
		}
	}
}
##""",
      this.prefix + """"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ApiSpecs_specs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("swagger.json")))
  )
  private[this] lazy val controllers_ApiSpecs_specs1_invoker = createInvoker(
    ApiSpecs_2.specs,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiSpecs",
      "specs",
      Nil,
      "GET",
      """## NoDocs ###""",
      this.prefix + """swagger.json"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docs/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
      "GET",
      """## NoDocs ###""",
      this.prefix + """docs/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_SwaggerUiController_generateMirrorResponse3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mirror/body/data")))
  )
  private[this] lazy val controllers_SwaggerUiController_generateMirrorResponse3_invoker = createInvoker(
    SwaggerUiController_3.generateMirrorResponse,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SwaggerUiController",
      "generateMirrorResponse",
      Nil,
      "POST",
      """##
 {
    "tags" : ["BodyData"],
    "summary" : "mirror response",
    "consumes" : [ "application/x-www-form-urlencoded" ],
    "parameters" : [
    {
       "in" : "formData",
       "name":"name",
       "description": "Employee Name",
       "required":true,
       "type":"string"
    },
    {
       "in" : "formData",
       "name":"id",
       "description": "Employee Id",
       "required":true,
       "type":"integer",
       "format":"int64"
    },{
       "in" : "formData",
       "name":"position",
       "description": "Employee Position",
       "required":true,
       "type":"string"
    }
   ],
    "responses": {
        "200": {
            "description": "success",
            "schema": {
                """" + "$" + """ref": "#/definitions/models.RequestWithBody"
            }
        },
		"400": {
			"description": "Problem in parsing input json data",
			"schema": {
				"""" + "$" + """ref": "#/definitions/models.ErrorResponse"
			}
		},
       "default": {
            "description": "error",
            "schema": {
                """" + "$" + """ref": "#/definitions/models.ErrorResponse"
            }
        }
    }
 }
##""",
      this.prefix + """mirror/body/data"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_SwaggerUiController_getRecordById4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("student/record/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SwaggerUiController_getRecordById4_invoker = createInvoker(
    SwaggerUiController_3.getRecordById(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SwaggerUiController",
      "getRecordById",
      Seq(classOf[Int]),
      "GET",
      """##
 {
    "tags" : ["PathContainData"],
    "summary" : "get student record(path example)",
    "parameters" : [
    {
       "in" : "path",
       "name":"id",
       "description": "Student Id",
       "required":true,
       "type":"string"
    }
   ],
    "responses": {
        "200": {
            "description": "success",
            "schema": {
                """" + "$" + """ref": "#/definitions/models.StudentRecordResponse"
            }
        },
		"400": {
			"description": "No record found for given id",
			"schema": {
				"""" + "$" + """ref": "#/definitions/models.ErrorResponse"
			}
		},
       "default": {
            "description": "error",
            "schema": {
                """" + "$" + """ref": "#/definitions/models.ErrorResponse"
            }
        }
    }
 }
##""",
      this.prefix + """student/record/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:150
  private[this] lazy val controllers_SwaggerUiController_getStudentRecordById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get/student/record")))
  )
  private[this] lazy val controllers_SwaggerUiController_getStudentRecordById5_invoker = createInvoker(
    SwaggerUiController_3.getStudentRecordById,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SwaggerUiController",
      "getStudentRecordById",
      Nil,
      "GET",
      """##
 {
    "tags" : ["QueryStringContainData"],
    "summary" : "get student record(query example)",
    "parameters" : [
    {
       "in" : "query",
       "name":"id",
       "description": "Student Id",
       "required":true,
       "type":"string"
    }
   ],
    "responses": {
        "200": {
            "description": "success",
            "schema": {
                """" + "$" + """ref": "#/definitions/models.StudentRecordResponse"
            }
        },
		"400": {
			"description": "No record found for given id",
			"schema": {
				"""" + "$" + """ref": "#/definitions/models.ErrorResponse"
			}
		},
       "default": {
            "description": "error",
            "schema": {
                """" + "$" + """ref": "#/definitions/models.ErrorResponse"
            }
        }
    }
 }
##""",
      this.prefix + """get/student/record"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:17
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:20
    case controllers_ApiSpecs_specs1_route(params) =>
      call { 
        controllers_ApiSpecs_specs1_invoker.call(ApiSpecs_2.specs)
      }
  
    // @LINE:23
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public/lib/swagger-ui")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:75
    case controllers_SwaggerUiController_generateMirrorResponse3_route(params) =>
      call { 
        controllers_SwaggerUiController_generateMirrorResponse3_invoker.call(SwaggerUiController_3.generateMirrorResponse)
      }
  
    // @LINE:113
    case controllers_SwaggerUiController_getRecordById4_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_SwaggerUiController_getRecordById4_invoker.call(SwaggerUiController_3.getRecordById(id))
      }
  
    // @LINE:150
    case controllers_SwaggerUiController_getStudentRecordById5_route(params) =>
      call { 
        controllers_SwaggerUiController_getStudentRecordById5_invoker.call(SwaggerUiController_3.getStudentRecordById)
      }
  }
}
