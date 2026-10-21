import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class ConsultaTest {
    


    @Test
    public void Testejava(){
        ConsultaAgendada consulta = new ConsultaAgendada("Rafael", LocalDateTime.now().plusDays(24), EEspecialidade.DERMATOLOGIA);
        assertEquals(140, consulta.valorConsulta(),0.001);
    }

}
