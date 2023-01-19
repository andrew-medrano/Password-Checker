package password_checker

object Password {
  def isValid(password : String): Boolean =
    var good_password = false
    if (password.length() >= 6) then
       for character <- "1234567890" do
        if password.contains(character) then good_password = true
    good_password
}
