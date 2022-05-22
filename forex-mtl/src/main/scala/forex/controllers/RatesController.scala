import javax.inject._
// import play.api._
import play.api.mvc._

@Singleton 
class RatesController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

    // endpoint to get currencies
    // def index(fromCurrency: String, toCurrency: String) = Action { implicit request: Request[AnyContent] =>
    //     Ok("Hello World")
    // }

    // Cached currencies with timestamp
    val cachedCurrencies : Map[String, Int]
    val cachedCurrenciesTimeStamp: Map[String, Timestamp]

    def index () = Action {
        Ok("Hello World")
    }
}