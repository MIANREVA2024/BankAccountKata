import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.vir.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    @DisplayName("crear cuenta con monto de saldo inicial cero")
    void testWhenTheBalanceIsZero(){
        //given
        //When=>Accion creates account without balance
        Account account = new Account();

        //Then=>Comprobar---account balance must be 0
        double balance = account.getBalance();
        assertEquals(0, balance);
    }
    @Test
    @DisplayName("crear cuenta con monto especifico de 1000")
    void testWhenTheBalanceIs1000(){
        //given
        //When
        Account account = new Account(1000);

        //Then
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }
    @Test
    @DisplayName("depositar dinero en su cuenta 500")
    void testWhenDeposit500(){
        //given=>una cuenta
        Account account =new Account(1000);

        //When=>depositar una cantidad x
        account.deposit(500);
        //Then=>al depositar se sume al saldo inicial
        double balance = account.getBalance();
        assertEquals(1500, balance);
    }
    @Test
    @DisplayName("depositar dinero en su cuenta cantidad positiva")
    void when_deposit_account_must_be_the_it_amount_is_negative(){

        //given=>una account
        Account account =new Account(1000);

        //When=>deposit una amount x
        account.deposit(-500);
        //Then=>al deposit se sume al saldo inicial
        double balance = account.getBalance();
        assertEquals(1000, balance);
    }
    @Test
    @DisplayName("Retirar dinero con saldo suficiente")
    void testWhenWithdrawWithSufficientBalance(){
        //given=>una cuenta
        Account account =new Account(1500);

        //When=>retirar una cantidad x
        account.retirar(200);

        //Then=>al verificar cuenta con fondos
        double balance = account.getBalance();
        assertEquals(1300, balance);
    }
    @Test
    @DisplayName("Retirar dinero con saldo insuficiente")
    void testWhenWithdraw(){
        //given=>una cuenta
        Account account =new Account(1500);

        //When=>retirar una cantidad x
        account.retirar(2000);
        //Then=>al verificar cuenta con fondos
        double balance = account.getBalance();
        assertEquals(1500, balance);
    }

}
