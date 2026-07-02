import breeze.linalg._
import breeze.stats.distributions.Rand

object Practical5 {

  def main(args: Array[String]): Unit = {

    // Generate a random 3x3 matrix
    val matrix = DenseMatrix.rand[Double](3, 3, Rand.uniform)

    // Calculate transpose
    val transposeMatrix = matrix.t

    // Calculate determinant
    val determinant = det(matrix)

    // Display results
    println("Random Matrix:")
    println(matrix)

    println("\nTranspose of Matrix:")
    println(transposeMatrix)

    println("\nDeterminant:")
    println(determinant)
  }
}
