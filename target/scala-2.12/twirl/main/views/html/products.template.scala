
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /* Parameters */
  def apply/*2.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.34*/("""

"""),format.raw/*4.1*/("""<!-- Pass page title and content """),format.raw/*4.34*/("""{"""),format.raw/*4.35*/("""html between braces"""),format.raw/*4.54*/("""}"""),format.raw/*4.55*/(""" """),format.raw/*4.56*/("""to the main view -->
"""),_display_(/*5.2*/main("products")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
  """),format.raw/*6.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">

        """),format.raw/*15.73*/("""
        """),_display_(/*16.10*/if(flash.containsKey("success"))/*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
          """),format.raw/*17.11*/("""<div class="alert alert-success">
            """),_display_(/*18.14*/flash/*18.19*/.get("success")),format.raw/*18.34*/("""
          """),format.raw/*19.11*/("""</div>
        """)))}),format.raw/*20.10*/("""

        """),format.raw/*22.9*/("""<table class="table table-bordered table-hover table-condensed">
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
            """),format.raw/*35.36*/("""
            """),format.raw/*36.77*/("""

            """),_display_(/*38.14*/for(p <- products) yield /*38.32*/ {_display_(Seq[Any](format.raw/*38.34*/("""
            """),format.raw/*39.13*/("""<tr>
              <td>"""),_display_(/*40.20*/p/*40.21*/.getId),format.raw/*40.27*/("""</td>
              <td>"""),_display_(/*41.20*/p/*41.21*/.getName),format.raw/*41.29*/("""</td>
              <td>"""),_display_(/*42.20*/p/*42.21*/.getDescription),format.raw/*42.36*/("""</td>
              <td>"""),_display_(/*43.20*/p/*43.21*/.getStock),format.raw/*43.30*/("""</td>
              <td>&euro; """),_display_(/*44.27*/("%.2f".format(p.getPrice))),format.raw/*44.54*/("""</td>
            </tr>
          """)))}),format.raw/*46.12*/(""" """),format.raw/*46.30*/("""
          """),format.raw/*47.11*/("""</tbody>
        </table>
        <hr>
        <p>
          <a href=""""),_display_(/*51.21*/routes/*51.27*/.HomeController.addproduct),format.raw/*51.53*/("""">
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
                  DATE: Mon Apr 23 14:29:07 IST 2018
                  SOURCE: /home/wdd/webapps/FinalDay/app/views/products.scala.html
                  HASH: 9aeaf7865bc1da9e9c358640fdf7d9bac67894a5
                  MATRIX: 977->18|1104->50|1132->52|1192->85|1220->86|1266->105|1294->106|1322->107|1369->129|1393->145|1432->147|1461->150|1703->428|1740->438|1781->470|1821->472|1860->483|1934->530|1948->535|1984->550|2023->561|2070->577|2107->587|2504->979|2545->1056|2587->1071|2621->1089|2661->1091|2702->1104|2753->1128|2763->1129|2790->1135|2842->1160|2852->1161|2881->1169|2933->1194|2943->1195|2979->1210|3031->1235|3041->1236|3071->1245|3130->1277|3178->1304|3244->1339|3273->1357|3312->1368|3410->1439|3425->1445|3472->1471
                  LINES: 28->2|33->2|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|53->22|66->35|67->36|69->38|69->38|69->38|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|77->46|77->46|78->47|82->51|82->51|82->51
                  -- GENERATED --
              */
          