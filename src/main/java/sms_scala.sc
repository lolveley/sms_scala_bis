import java.io.{IOException, FileWriter, BufferedWriter}

/**
 * Created with IntelliJ IDEA.
 * User: olivier
 * Date: 02/08/13
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */

object sms_scala {

  def serviceInit(){

    var bufWriter : BufferedWriter=null
    var fileWriter:FileWriter=null

    try{
      fileWriter = new FileWriter("taskInit.txt", true)
      bufWriter = new BufferedWriter(fileWriter)
      // Insï¿½rer un saut de ligne
      bufWriter.newLine()
      bufWriter.write("ok")
      bufWriter.close()
    } catch{
      case e:IOException => {}

    } finally {
      try {
        bufWriter.close();
        fileWriter.close();
      } catch {
        case e:IOException => {}
      }
    }


  }


}

class sms_scala{


}