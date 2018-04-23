
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*9.102*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/styles.css")),format.raw/*10.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>

        <body id="index" data-spy="scroll" data-target=".navbar" data-offset="10">
        <nav class="navbar .navbar-inverse navbar-fixed-top">
                 <div class="container-fluid ">
                   <div class="navbar-header">
           <a class="navbar-brand" href=""""),_display_(/*23.43*/routes/*23.49*/.HomeController.index()),format.raw/*23.72*/(""""><span class="glyphicon glyphicon-fire"></span>RRR</a>
            </div>
              <ul class="nav navbar-nav navbar">
                
                
                <li><a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.products()),format.raw/*28.63*/(""""><span class="glyphicon glyphicon-user"></span>products</a></li>
                
               </ul>
               <ul class="nav navbar-nav navbar-right">
              
               <li><a href=""""),_display_(/*33.30*/routes/*33.36*/.HomeController.AboutUs()),format.raw/*33.61*/(""""><span class="glyphicon glyphicon-info-sign"></span>
               </span> About Us</a></li>
                <li><a href=""""),_display_(/*35.31*/routes/*35.37*/.HomeController.contactUs()),format.raw/*35.64*/(""""><span class="glyphicon glyphicon-earphone"></span>Contact Us</a></li>
                </ul>
            </div>
          </div>
        </nav>
        <footer class="container-fluid">
            <p></p>
        </footer>
        """),_display_(/*43.10*/content),format.raw/*43.17*/("""
        
        """),format.raw/*45.9*/("""<script src=""""),_display_(/*45.23*/routes/*45.29*/.Assets.versioned("javascripts/main.js")),format.raw/*45.69*/("""" type="text/javascript"></script>
   
</html>


"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 17:24:20 IST 2018
                  SOURCE: /home/wdd/webapps/FinalDay/app/views/main.scala.html
                  HASH: 71df57cde902801314ecf5d5ed2b1de0d4106307
                  MATRIX: 952->1|1077->31|1105->33|1184->138|1219->147|1253->155|1278->160|1366->222|1380->228|1442->269|1524->325|1538->331|1601->373|1684->429|1699->435|1764->478|1852->539|1867->545|1928->584|2676->1305|2691->1311|2735->1334|2950->1522|2965->1528|3012->1554|3243->1758|3258->1764|3304->1789|3456->1914|3471->1920|3519->1947|3779->2180|3807->2187|3852->2205|3893->2219|3908->2225|3969->2265
                  LINES: 28->1|33->1|35->3|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|55->23|55->23|55->23|60->28|60->28|60->28|65->33|65->33|65->33|67->35|67->35|67->35|75->43|75->43|77->45|77->45|77->45|77->45
                  -- GENERATED --
              */
          