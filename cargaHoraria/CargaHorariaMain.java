package exercicio.cargaHoraria;
// O programa calcula o salário a partir das horas trabalhadas em um mês e do valor da hora de trabalho
import java.util.Scanner;

public class CargaHorariaMain {

    Scanner in = new Scanner(System.in);
    CargaHoraria ch = new CargaHoraria();
    CargaHorariaEntrada entrada = new CargaHorariaEntrada();

    public void iniciarCargaHoraria() {
        int consulta;

        do {
            entrada.inserirCargaHoraria(ch);
            ch.calcularDiasMes();
            ch.calcularHorasTrabalho(entrada.getHorasDia());
            ch.calcularSalario(entrada.getPagamentoHora());
            entrada.gerarRelatorio(ch);

            System.out.println("\n\nReiniciar consulta?" +
                    "\n1 - Sim" +
                    "\n2 - Não");
            consulta = in.nextInt();

        } while (consulta == 1);

    }

    public static void main(String[] args) {

        CargaHorariaMain main = new CargaHorariaMain();

        main.iniciarCargaHoraria();

    }

}
