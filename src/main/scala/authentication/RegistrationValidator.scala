package authentication

object RegistrationValidator {

  def isDataValid(email: String, password: String): Boolean = validEmail(email.trim) && validPassword(password.trim)

  private val emailRegex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r

  private def validEmail(email: String) = emailRegex.findFirstMatchIn(email).isDefined

  private def validPassword(password: String) = !password.isEmpty
}
