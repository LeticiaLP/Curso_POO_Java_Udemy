package exercicio.cargaHoraria;
// O programa calcula o salário a partir das horas trabalhadas em um mês e do valor da hora de trabalho
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class CargaHoraria {
    private int id;
    private int mes;
    private int ano;
    private int feriado;
    private int horasTrabalho;
    private float salario;

    List<LocalDate> diasUteisMes;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getFeriado() {
        return feriado;
    }
    public void setFeriado(int feriado) {
        this.feriado = feriado;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public float getSalario() {
        return salario;
    }
        // seleciona e lista os dias úteis de um mês
    public void calcularDiasMes() {

        YearMonth anoMes = YearMonth.of(ano, mes); // obtém o mês de um determinado ano
        diasUteisMes = new ArrayList<>(); // lista com dias úteis

        for (int dia = 1; dia <= anoMes.lengthOfMonth(); dia++) { // anoMes.lengthOfMonth() --> obter duração do mês

            LocalDate data = anoMes.atDay(dia); // obter um dia específico de um determinado mês (identifica dia da semana)
                // compara se o dia identificado é diferente de sábado e domingo, se for diferente adiciona na lista
            if (!data.getDayOfWeek().equals(DayOfWeek.SATURDAY) && !data.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                diasUteisMes.add(data);
            }
        }
    }
        // calcula as horas de trabalho em um mês
    public int calcularHorasTrabalho(int horasDia) {
        int diasMes;
        diasMes = diasUteisMes.size() - feriado;
        horasTrabalho = horasDia * diasMes;
        return horasTrabalho;
    }
        // calcula o salário mensal a partir das horas de trabalho
    public float calcularSalario(float pagamentoHora) {

        salario = horasTrabalho * pagamentoHora;
        return salario;
    }


}
