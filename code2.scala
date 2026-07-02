object Statistics {
  def mean(list: List[Double]): Double = {
    list.sum / list.length
  }

  def median(list: List[Double]): Double = {
    val sorted = list.sorted
    val n = sorted.length
    if (n % 2 == 0)
      (sorted(n/2 - 1) + sorted(n/2)) / 2.0
    else
      sorted(n/2)
  }

  def mode(list: List[Double]): List[Double] = {
    val grouped = list.groupBy(x => x).mapValues(_.size)
    val maxCount = grouped.values.max
    grouped.filter(_._2 == maxCount).keys.toList
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(10.0, 20.0, 20.0, 30.0, 40.0, 50.0, 20.0)

    println("Numbers: " + numbers)
    println("Mean: " + mean(numbers))
    println("Median: " + median(numbers))
    println("Mode: " + mode(numbers))
  }
}
