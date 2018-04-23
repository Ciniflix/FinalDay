
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object Mens extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*3.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.34*/("""

"""),format.raw/*5.1*/("""<!-- Pass page title and content """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""html between braces"""),format.raw/*5.54*/("""}"""),format.raw/*5.55*/(""" """),format.raw/*5.56*/("""to the main view -->
"""),_display_(/*6.2*/main("products")/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""
  """),format.raw/*7.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">

        """),format.raw/*16.73*/("""
        """),_display_(/*17.10*/if(flash.containsKey("success"))/*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""
          """),format.raw/*18.11*/("""<div class="alert alert-success">
            """),_display_(/*19.14*/flash/*19.19*/.get("success")),format.raw/*19.34*/("""
          """),format.raw/*20.11*/("""</div>
        """)))}),format.raw/*21.10*/("""

        """),format.raw/*23.9*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
            """),format.raw/*36.36*/("""
            """),format.raw/*37.77*/("""

            """),_display_(/*39.14*/for(p <- products) yield /*39.32*/ {_display_(Seq[Any](format.raw/*39.34*/("""
            """),format.raw/*40.13*/("""<tr>
              <td>"""),_display_(/*41.20*/p/*41.21*/.getId),format.raw/*41.27*/("""</td>
              <td>"""),_display_(/*42.20*/p/*42.21*/.getName),format.raw/*42.29*/("""</td>
              <td>"""),_display_(/*43.20*/p/*43.21*/.getDescription),format.raw/*43.36*/("""</td>
              <td>"""),_display_(/*44.20*/p/*44.21*/.getStock),format.raw/*44.30*/("""</td>
              <td>&euro; """),_display_(/*45.27*/("%.2f".format(p.getPrice))),format.raw/*45.54*/("""</td>
            </tr>
          """)))}),format.raw/*47.12*/(""" """),format.raw/*47.30*/("""
          """),format.raw/*48.11*/("""</tbody>
        </table>
        <hr>
        <p>
          <a href=""""),_display_(/*52.21*/routes/*52.27*/.HomeController.addproduct),format.raw/*52.53*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 14:58:23 IST 2018
                  SOURCE: /home/wdd/webapps/FinalDay/app/views/Mens.scala.html
                  HASH: 8a2aa76770c3f8ba891ce44d1b71760438fa302f
                  MATRIX: 973->21|1100->53|1130->57|1190->90|1218->91|1264->110|1292->111|1320->112|1368->135|1392->151|1431->153|1461->157|1712->444|1750->455|1791->487|1831->489|1871->501|1946->549|1960->554|1996->569|2036->581|2084->598|2123->610|2533->1015|2575->1093|2619->1110|2653->1128|2693->1130|2735->1144|2787->1169|2797->1170|2824->1176|2877->1202|2887->1203|2916->1211|2969->1237|2979->1238|3015->1253|3068->1279|3078->1280|3108->1289|3168->1322|3216->1349|3284->1386|3313->1404|3353->1416|3455->1491|3470->1497|3517->1523
                  LINES: 28->3|33->3|35->5|35->5|35->5|35->5|35->5|35->5|36->6|36->6|36->6|37->7|46->16|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|51->21|53->23|66->36|67->37|69->39|69->39|69->39|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|77->47|77->47|78->48|82->52|82->52|82->52
                  -- GENERATED --
              */
          