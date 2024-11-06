import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.vir.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    @DisplayName("Test para crear cuenta con saldo inicial cero")
    void testWhenTheBalanceIsZero(){
        //given
        //When=>Accion creates account without balance
        Account account = new Account();

        //Then=>Comprobar---account balance must be 0
        double balance = account.getBalance();
        assertEquals(0, balance);
    }
    @Test
    @DisplayName("depositar dinero")
    void testWhenTheDepositBalanceIsPositive(){
        //given
        //When
        Account account = new Account(1000);

        //Then
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }
}
