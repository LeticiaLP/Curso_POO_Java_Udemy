package exercicio.cargaHoraria;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CargaHorariaTeste {

    CargaHoraria carga = new CargaHoraria();

    @Before
    public void configurar() {
        carga.setMes(3);
        carga.setAno(2021);
        carga.setFeriado(1);
    }

    @Test
    public void testeCalcularDiasMes() {

        carga.calcularDiasMes();

        Assert.assertEquals(23, carga.diasUteisMes.size());
    }
    @Test
    public void testeCalcularHorasTrabalho() {

        carga.calcularDiasMes();

       Assert.assertEquals(176, carga.calcularHorasTrabalho(8),0);
    }
    @Test
    public void testeCalcularSalario() {

        carga.calcularDiasMes();
        carga.calcularHorasTrabalho(8);

        Assert.assertEquals(6600, carga.calcularSalario((float) 37.5),0);
    }

}
