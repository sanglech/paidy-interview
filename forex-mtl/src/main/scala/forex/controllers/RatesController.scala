import javax.inject._
// import play.api._
import play.api.mvc._

@Singleton 
class RatesController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

    // endpoint to get currencies
    // def index(fromCurrency: String, toCurrency: String) = Action { implicit request: Request[AnyContent] =>
    //     Ok("Hello World")
    // }
    def index () = Action {
        Ok("Hello World")
    }
}