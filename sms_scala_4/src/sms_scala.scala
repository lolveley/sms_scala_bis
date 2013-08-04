import java.io.{File, IOException, FileWriter, BufferedWriter}

/**
 * Created with IntelliJ IDEA.
 * User: olivier
 * Date: 02/08/13
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */

object sms_scala {

//  def main(args:Array[String]):Unit={
//    serviceInit()
//  }


  def serviceInit(): Boolean = {

    val rep_log=new File("logs")
    rep_log.mkdir()
    val trace=new fichiers_de_trace.Trace
    trace.logue("abc")
    trace.logue("ras")

    true

  }






}
