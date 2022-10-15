package fr.lernejo.umlgrapher;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.EnumSet;
import java.util.concurrent.Callable;

@Command(
    name = "classe",
    mixinStandardHelpOptions = true,
    version =" 4.0 ",
    requiredOptionMarker ='*',
    description = " Renseigne les classes ",
    optionListHeading = "%n Les options sont : %n"
)
public class Launcher implements Callable<Integer>{

    @Option(names={"-c","--classes"},required = true,description = "Permettre de renseigner les classes d'où faire partir l'analyse ", paramLabel = "test")
    boolean ct;
    @Option( names = {"-g","--graph-type"},required = false,description = "Permettre de sélectionner le type de graph que l'on souhaite en sortie (default: ${DEFAULT-VALUE})",defaultValue = "Mermaid")
      GraphType gt;
    @Override
    public Integer call() throws Exception {
        try{
            if(ct == true) {

            }
        }catch (RuntimeException e){

        }
       return null;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new Launcher()).execute();
        System.exit(exitCode);
    }
}
