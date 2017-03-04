
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sangeeta/projects/contribute/testSwagger/conf/routes
// @DATE:Sat Mar 04 12:27:42 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:17
package controllers {

  // @LINE:20
  class ReverseApiSpecs(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def specs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "swagger.json")
    }
  
  }

  // @LINE:17
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:75
  class ReverseSwaggerUiController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def getRecordById(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "student/record/" + implicitly[PathBindable[Int]].unbind("id", id))
    }
  
    // @LINE:150
    def getStudentRecordById(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "get/student/record")
    }
  
    // @LINE:75
    def generateMirrorResponse(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mirror/body/data")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/swagger-ui")))
      Call("GET", _prefix + { _defaultPrefix } + "docs/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }


}
