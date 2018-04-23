
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

object contactUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("contactUs")/*1.19*/ {_display_(Seq[Any](format.raw/*1.21*/("""
    
"""),format.raw/*3.1*/("""<div class="container-fluid">
       
	   <h2 class="text-"><br>Contact Us</br></h2>
        <div class="row">
          <div class="col-sm-5">
            <p>Hi! Thank you for Wishing to Contact Us ,
            <p>Submit Youre inquiry & we will try to get back to you within 48 hours.</p>
            <p><span class="glyphicon glyphicon-map-marker"></span> Galway,Ireland</p>
            <p><span class="glyphicon glyphicon-phone"></span> +01 456 9578</p>
            <p><span class="glyphicon glyphicon-envelope"></span> Ciniflix4U@hotmail.com</p> 
          </div>
          <div class="col-sm-5">
            <div class="row">
              <div class="col-sm-5 form-group">
                <input class="form-control" id="First Name" name="First Name" placeholder="First Name" type="text" required>
              </div>
			  <div class="col-sm-5  form-group">
                <input class="form-control" id="Last Name" name="Last Name" placeholder="Last Name" type="text" required>
              </div>
			  <div class="col-sm-5 form-group">
                <input class="form-control" id="Phone Number" name="Phone Number" placeholder="Phone Number" type="text" required>
			   
			 </div>
			
              <div class="col-sm-5 form-group">
                <input class="form-control" id="Email" name="Email" placeholder="Email" type="Email" required>
              </div>
			     <div class="col-sm-5 form-group">
                <input class="form-control" id="Confirm Email" name=" Confirm Email" placeholder="Confirm Email" type="Email" required>
              </div>
                <div class="col-sm-5 form-group">
               <input class="form-control" id="Inquiry " name="Inquiry" placeholder="Inquiry" type="Inquiry" required>
              </div>
			  </div>
            <div class="row">
              <div class="col-sm-5 form-group">
               <button class="btn btn-default btn-lg">Submit</button>
              </div>
            </div> 
          </div>
        </div>
      </div>
    """)))}),format.raw/*45.6*/("""
      """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 09:33:18 IST 2018
                  SOURCE: /home/wdd/webapps/ITPROJECT-master/app/views/contactUs.scala.html
                  HASH: f7a0aeff364e08959744bf4f01d1a5614e8b2c35
                  MATRIX: 1034->1|1059->18|1098->20|1132->28|3225->2092
                  LINES: 33->1|33->1|33->1|35->3|77->45
                  -- GENERATED --
              */
          