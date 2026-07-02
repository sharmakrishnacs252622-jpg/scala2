import scala.util.Random

object Practical2 {

  def mean(list: List[Double]): Double = {
    list.sum / list.length
  }

  def variance(list: List[Double]): Double = {
    val m = mean(list)
    list.map(x => math.pow(x - m, 2)).sum / list.length
  }

  def stdDev(list: List[Double]): Double = {
    math.sqrt(variance(list))
  }

  def main(args: Array[String]): Unit = {
    val random = new Random()
    val numbers = List.fill(10)(random.nextInt(100).toDouble)

    println("Random Numbers: " + numbers)
    println("Mean: " + mean(numbers))
    println("Variance: " + variance(numbers))
    println("Standard Deviation: " + stdDev(numbers))
  }
}
