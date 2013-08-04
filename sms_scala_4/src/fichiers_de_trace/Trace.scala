package fichiers_de_trace

import java.io.{FileWriter, BufferedWriter, PrintWriter, File}
import java.util.Date
import java.text.{ParsePosition, SimpleDateFormat}

/**
 * Created with IntelliJ IDEA.
 * User: olivier
 * Date: 03/08/13
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
class Trace {

  var fichier_ou_ecrire = ""

  def logue(chaine_a_loguer: String): Unit = {

    fichier_ou_ecrire = if (fichier_ou_ecrire == "") donne_fichier else fichier_ou_ecrire
    val ecrivain = new PrintWriter(new BufferedWriter
    (new FileWriter(fichier_ou_ecrire, true)))
    val temps_ajh = new Date
    val sdf = new SimpleDateFormat("dd/MM/yyyy:hh-mm-ss : ")
    ecrivain.println(sdf.format(temps_ajh) + chaine_a_loguer)
    ecrivain.close()
  }

  def donne_fichier: String = {

    // si le répertoire "logs" n'existe pas, le créer
    val rep_logs = new File("logs")
    if (!rep_logs.exists()) rep_logs.mkdir()

    val temps_ajh = new Date
    val sdf = new SimpleDateFormat("'Le' dd MM yyyy 'à' hh mm ss")

    "logs\\chasse_et_peche_" + sdf.format(temps_ajh) + ".log"

  }

}
