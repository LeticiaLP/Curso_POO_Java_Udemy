package exercicio.cargaHoraria;
// O programa calcula o salário a partir das horas trabalhadas em um mês e do valor da hora de trabalho
import java.util.Scanner;

public class CargaHorariaEntrada {
    private int horasDia;
    private float pagamentoHora;

    Scanner in = new Scanner(System.in);

    public int getHorasDia() {
        return horasDia;
    }
    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public float getPagamentoHora() {
        return pagamentoHora;
    }
    public void setPagamentoHora(float pagamentoHora) {
        this.pagamentoHora = pagamentoHora;
    }

    public void inserirCargaHoraria(CargaHoraria ch) {

        System.out.println("\n============================================================================");
        System.out.printf("%-12s%-2s%n", "", "SISTEMA DE CONTROLE DE RENDIMENTOS POR CARGA HORÁRIA");
        System.out.println("============================================================================\n");
        System.out.print("Insira a ID do colaborador: ");
        ch.setId(in.nextInt());
        System.out.println("\nInsira o ano e o mês de trabalho.");
        System.out.print("Ano: ");
        ch.setAno(in.nextInt());
        System.out.print("Mês: ");
        ch.setMes(in.nextInt());
        System.out.print("\nInsira o número de feriados nos dias úteis do mês: ");
        ch.setFeriado(in.nextInt());
        System.out.print("\nInsira a quantidade de horas trabalhadas por dia: ");
        horasDia = in.nextInt();
        System.out.print("\nInsira o valor pago por hora trabalhada: ");
        pagamentoHora = in.nextFloat();

    }

    public void gerarRelatorio(CargaHoraria ch) {

        System.out.println("\n============================================================================");
        System.out.printf("%-17s%-2s%n", "", "RELATÓRIO DE RENDIMENTOS POR CARGA HORÁRIA");
        System.out.println("============================================================================\n");
        System.out.print("ID: " + ch.getId());
        System.out.print("\nANO: " + ch.getAno());
        System.out.print("\nMÊS: " + ch.getMes());
        System.out.print("\nHORAS TRABALHADAS POR MÊS: " + ch.getHorasTrabalho());
        System.out.printf("%s%.2f", "\nVALOR DA HORA DE TRABALHO: R$ ", pagamentoHora);
        System.out.printf("%s%.2f", "\nSALÁRIO: R$ ", ch.getSalario());
    }
}
