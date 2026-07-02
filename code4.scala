import breeze.linalg._

object BreezeVectorOps {
  def main(args: Array[String]): Unit = {
    val v1 = DenseVector(1.0, 2.0, 3.0, 4.0, 5.0)
    val v2 = DenseVector(5.0, 4.0, 3.0, 2.0, 1.0)

    println("Vector 1: " + v1)
    println("Vector 2: " + v2)

    println("Sum of v1: " + sum(v1))
    println("Mean of v1: " + mean(v1))

    val dotProduct = v1.dot(v2)
    println("Dot Product: " + dotProduct)
  }
}
