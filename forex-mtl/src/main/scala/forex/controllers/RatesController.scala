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

    /*
     TODO 
    1) Check if to and from currency is in cache and within 5min
    2) If yes return currency from there do not hit API.
    3) If No check if currencies are legal currencies we support. If no throw error.
    4) If are legal, hit API and cache result and return result.
    */

    def index () = Action {
        Ok("Hello World")
    }
}