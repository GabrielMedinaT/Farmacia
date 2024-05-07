/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author gabriel
 */
import java.util.ArrayList;
import java.util.List;

public class Medicamentos {
    private static final List<String> listaMedicamentos = new ArrayList<>();

    static {
        // Analgésicos
        listaMedicamentos.add("Paracetamol");
        listaMedicamentos.add("Ibuprofeno");
        listaMedicamentos.add("Ácido acetilsalicílico");
        listaMedicamentos.add("Naproxeno");
        listaMedicamentos.add("Ketorolaco");
        
        // Analépticos
        listaMedicamentos.add("Cafeína");
        listaMedicamentos.add("Modafinilo");
        listaMedicamentos.add("Anfetaminas");
        listaMedicamentos.add("Metilfenidato");
        listaMedicamentos.add("Feniletilamina");

        // Anestésicos
        listaMedicamentos.add("Lidocaína");
        listaMedicamentos.add("Propofol");
        listaMedicamentos.add("Ketamina");
        listaMedicamentos.add("Isoflurano");
        listaMedicamentos.add("Sevoflurano");

        // Antiácidos
        listaMedicamentos.add("Almagato");
        listaMedicamentos.add("Hidróxido de aluminio");
        listaMedicamentos.add("Carbonato de calcio");
        listaMedicamentos.add("Hidróxido de magnesio");
        listaMedicamentos.add("Omeprazol");

        // Antidepresivos
        listaMedicamentos.add("Sertralina");
        listaMedicamentos.add("Fluoxetina");
        listaMedicamentos.add("Escitalopram");
        listaMedicamentos.add("Venlafaxina");
        listaMedicamentos.add("Bupropión");

        // Antibióticos
        listaMedicamentos.add("Amoxicilina");
        listaMedicamentos.add("Azitromicina");
        listaMedicamentos.add("Cefalexina");
        listaMedicamentos.add("Levofloxacino");
        listaMedicamentos.add("Metronidazol");
        listaMedicamentos.add("Clindamicina");
        listaMedicamentos.add("Doxiciclina");
        listaMedicamentos.add("Ciprofloxacino");
        listaMedicamentos.add("Amoxicilina/Ácido clavulánico");
        listaMedicamentos.add("Eritromicina");
        listaMedicamentos.add("Sulfametoxazol/Trimetoprima");
        listaMedicamentos.add("Linezolid");
        listaMedicamentos.add("Vancomicina");
        listaMedicamentos.add("Gentamicina");
        listaMedicamentos.add("Cloranfenicol");
        listaMedicamentos.add("Rifampicina");
        listaMedicamentos.add("Imipenem/Cilastatina");
        listaMedicamentos.add("Meropenem");
        listaMedicamentos.add("Doripenem");
        listaMedicamentos.add("Tigeciclina");
        listaMedicamentos.add("Colistina");
        listaMedicamentos.add("Ceftazidima");
        listaMedicamentos.add("Ceftriaxona");
        listaMedicamentos.add("Cefotaxima");
        listaMedicamentos.add("Meropenem/Vaborbactam");
        listaMedicamentos.add("Ceftolozano/Tazobactam");
    }

    public static List<String> filtrarMedicamentos(String textoIngresado) {
        List<String> medicamentosFiltrados = new ArrayList<>();
        for (String medicina : listaMedicamentos) {
            if (medicina.toLowerCase().startsWith(textoIngresado.toLowerCase())) {
                medicamentosFiltrados.add(medicina);
            }
        }
        return medicamentosFiltrados;
    }
}
