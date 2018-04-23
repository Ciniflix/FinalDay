
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

object addproduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*3.61*/("""
"""),format.raw/*5.1*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and content """),format.raw/*7.34*/("""{"""),format.raw/*7.35*/("""html between braces"""),format.raw/*7.54*/("""}"""),format.raw/*7.55*/(""" """),format.raw/*7.56*/("""to the main view -->
"""),_display_(/*8.2*/main("Add product")/*8.21*/ {_display_(Seq[Any](format.raw/*8.23*/("""

  """),format.raw/*10.3*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.HomeController.addproductSubmit(), 'class -> "form-horizontal", 'role->"form")/*13.102*/ {_display_(Seq[Any](format.raw/*13.104*/("""

    """),format.raw/*15.33*/("""
    """),format.raw/*16.94*/("""
    """),_display_(/*17.6*/CSRF/*17.10*/.formField),format.raw/*17.20*/("""

    """),format.raw/*19.5*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
    """),_display_(/*21.6*/inputText(productForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*21.80*/("""
    """),_display_(/*22.6*/inputText(productForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*22.94*/("""
    """),_display_(/*23.6*/inputText(productForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*23.82*/("""
    """),_display_(/*24.6*/inputText(productForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*24.82*/("""
   
    """),_display_(/*26.6*/inputText(productForm("id"), '_label -> "",'hidden -> "hidden")),format.raw/*26.69*/(""" 
   
    """),format.raw/*28.5*/("""<!-- Add a submit button -->
    <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*31.14*/routes/*31.20*/.HomeController.index),format.raw/*31.41*/("""">
				<button class="btn btn-warning">Cancel</button>
			</a>
    </div>


  """)))}),format.raw/*37.4*/(""" """),format.raw/*37.22*/("""

""")))}),format.raw/*39.2*/(""" """))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 14:28:45 IST 2018
                  SOURCE: /home/wdd/webapps/FinalDay/app/views/addproduct.scala.html
                  HASH: ffc7b6e823d014ce24dde95a1bdf5b8ee904f76c
                  MATRIX: 967->1|1075->100|1120->36|1149->98|1176->116|1204->118|1264->151|1292->152|1338->171|1366->172|1394->173|1441->195|1468->214|1507->216|1538->220|1659->315|1768->414|1809->416|1843->450|1876->544|1908->550|1921->554|1952->564|1985->570|2108->667|2203->741|2235->747|2344->835|2376->841|2473->917|2505->923|2602->999|2638->1009|2722->1072|2759->1082|2926->1222|2941->1228|2983->1249|3092->1328|3121->1346|3154->1349
                  LINES: 28->1|31->4|34->1|36->3|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|42->10|45->13|45->13|45->13|47->15|48->16|49->17|49->17|49->17|51->19|53->21|53->21|54->22|54->22|55->23|55->23|56->24|56->24|58->26|58->26|60->28|63->31|63->31|63->31|69->37|69->37|71->39
                  -- GENERATED --
              */
          