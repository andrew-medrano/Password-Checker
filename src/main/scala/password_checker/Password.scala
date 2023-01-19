package password_checker

object Password {
  def isValid(password : String): Boolean =
    password.length() >= 6 && password.contains(1)
}
