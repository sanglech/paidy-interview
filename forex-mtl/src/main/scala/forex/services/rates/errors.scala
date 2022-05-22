package forex.services.rates

object errors {

  sealed trait Error
  object Error {
    final case class OneFrameLookupFailed(msg: String) extends Error
  }
  // TODO add more descriptive error messages

}
