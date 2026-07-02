import breeze.linalg._

object BreezeMatrixOps {
  def main(args: Array[String]): Unit = {
    val matrix = DenseMatrix.rand[Double](3, 3)

    println("Random Matrix:")
    println(matrix)

    val transposeMatrix = matrix.t
    println("\nTranspose of Matrix:")
    println(transposeMatrix)

    val determinant = det(matrix)
    println("\nDeterminant: " + determinant)
  }
}
