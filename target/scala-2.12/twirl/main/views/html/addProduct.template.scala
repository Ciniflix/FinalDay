
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*1.1*/("""exit
"""),_display_(/*2.2*/(productForm: Form[models.Product])),format.raw/*2.37*/("""

"""),format.raw/*4.61*/("""
"""),format.raw/*6.1*/("""

"""),format.raw/*8.1*/("""<!-- Pass page title and content """),format.raw/*8.34*/("""{"""),format.raw/*8.35*/("""html between braces"""),format.raw/*8.54*/("""}"""),format.raw/*8.55*/(""" """),format.raw/*8.56*/("""to the main view -->
"""),_display_(/*9.2*/main("Add product")/*9.21*/ {_display_(Seq[Any](format.raw/*9.23*/("""

  """),format.raw/*11.3*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*14.3*/form(action = routes.HomeController.addproductSubmit(), 'class -> "form-horizontal", 'role->"form")/*14.102*/ {_display_(Seq[Any](format.raw/*14.104*/("""

    """),format.raw/*16.33*/("""
    """),format.raw/*17.94*/("""
    """),_display_(/*18.6*/CSRF/*18.10*/.formField),format.raw/*18.20*/("""

    """),format.raw/*20.5*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
    """),_display_(/*22.6*/inputText(productForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*22.80*/("""
    """),_display_(/*23.6*/inputText(productForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*23.94*/("""
    """),_display_(/*24.6*/inputText(productForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*24.82*/("""
    """),_display_(/*25.6*/inputText(productForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*25.82*/("""
   
    """),_display_(/*27.6*/inputText(productForm("id"), '_label -> "",'hidden -> "hidden")),format.raw/*27.69*/(""" 
   
    """),format.raw/*29.5*/("""<!-- Add a submit button -->
    <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*32.14*/routes/*32.20*/.HomeController.index),format.raw/*32.41*/("""">
				<button class="btn btn-warning">Cancel</button>
			</a>
    </div>


  """)))}),format.raw/*38.4*/(""" """),format.raw/*38.22*/("""

""")))}),format.raw/*40.2*/(""" """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 16:11:37 IST 2018
                  SOURCE: /home/wdd/webapps/FinalDay/app/views/addProduct.scala.html
                  HASH: e822fe4acd11fcb0a783c79f151923552f82c651
                  MATRIX: 1014->105|1058->0|1089->6|1144->41|1173->103|1200->121|1228->123|1288->156|1316->157|1362->176|1390->177|1418->178|1465->200|1492->219|1531->221|1562->225|1683->320|1792->419|1833->421|1867->455|1900->549|1932->555|1945->559|1976->569|2009->575|2132->672|2227->746|2259->752|2368->840|2400->846|2497->922|2529->928|2626->1004|2662->1014|2746->1077|2783->1087|2950->1227|2965->1233|3007->1254|3116->1333|3145->1351|3178->1354
                  LINES: 31->5|34->1|35->2|35->2|37->4|38->6|40->8|40->8|40->8|40->8|40->8|40->8|41->9|41->9|41->9|43->11|46->14|46->14|46->14|48->16|49->17|50->18|50->18|50->18|52->20|54->22|54->22|55->23|55->23|56->24|56->24|57->25|57->25|59->27|59->27|61->29|64->32|64->32|64->32|70->38|70->38|72->40
                  -- GENERATED --
              */
          