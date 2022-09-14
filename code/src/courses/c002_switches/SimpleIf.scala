package courses.c002_switches

object SimpleIf extends App {

  var foodProduct: Boolean = false
  foodProduct = false

  // Default VAT value
  var vat: Double = 7.7

  if (foodProduct) vat = 2.5

  System.out.println("VAT is " + vat + " percent")
  var initPrice: Double = .0
  var totalPrice: Double = .0

  // VAT calculation
  initPrice = 567.2
  totalPrice = initPrice + (initPrice * vat / 100.0)
  System.out.println("Total price is " + totalPrice)
}