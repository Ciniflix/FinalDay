
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/FinalDay/conf/routes
// @DATE:Mon Apr 23 12:15:04 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
