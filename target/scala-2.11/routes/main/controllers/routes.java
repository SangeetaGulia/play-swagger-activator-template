
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/sangeeta/projects/contribute/testSwagger/conf/routes
// @DATE:Sat Mar 04 12:27:42 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApiSpecs ApiSpecs = new controllers.ReverseApiSpecs(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSwaggerUiController SwaggerUiController = new controllers.ReverseSwaggerUiController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApiSpecs ApiSpecs = new controllers.javascript.ReverseApiSpecs(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSwaggerUiController SwaggerUiController = new controllers.javascript.ReverseSwaggerUiController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
