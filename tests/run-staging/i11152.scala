
import scala.quoted._
import scala.quoted.staging._

object Test {

  given Toolbox = Toolbox.make(getClass.getClassLoader)

  def main(args: Array[String]): Unit = run {
    '{
      given Int = 10
      compiletime.summonInline[Int]
      ()
    }
  }
}
