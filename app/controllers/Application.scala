package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index())
  }
  
  def hello(name: String) = Action {
	  Ok(views.html.hello(name))
  }

  def login() = Action {
	Ok(views.html.login())
  }	
}
