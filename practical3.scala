import scala.util.Random

object practical3 {

  // Calculate Mean
  def mean(numbers: List[Double]): Double = {
    numbers.sum / numbers.length
  }

  // Calculate Variance
  def variance(numbers: List[Double]): Double = {
    val avg = mean(numbers)
    numbers.map(num => math.pow(num - avg, 2)).sum / numbers.length
  }

  // Calculate Standard Deviation
  def standardDeviation(numbers: List[Double]): Double = {
    math.sqrt(variance(numbers))
  }

  def main(args: Array[String]): Unit = {

    // Generate 10 random numbers (0 to 99)
    val random = new Random()
    val numbers = List.fill(10)(random.nextInt(100).toDouble)

    println("Random Numbers: " + numbers)
    println("Mean: " + mean(numbers))
    println("Variance: " + variance(numbers))
    println("Standard Deviation: " + standardDeviation(numbers))
  }
}
