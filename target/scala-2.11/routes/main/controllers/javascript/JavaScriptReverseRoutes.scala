
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sangeeta/projects/contribute/testSwagger/conf/routes
// @DATE:Sat Mar 04 12:27:42 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:17
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:20
  class ReverseApiSpecs(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def specs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiSpecs.specs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "swagger.json"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:75
  class ReverseSwaggerUiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def getRecordById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SwaggerUiController.getRecordById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/record/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:150
    def getStudentRecordById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SwaggerUiController.getStudentRecordById",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get/student/record"})
        }
      """
    )
  
    // @LINE:75
    def generateMirrorResponse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SwaggerUiController.generateMirrorResponse",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mirror/body/data"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docs/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
