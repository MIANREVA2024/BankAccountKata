## BANK ACCOUNT KATA
## Descripción

Crearemos esta kata para poder practicar los principios basicos de la OOP como:
Abstraccion y Encapsulacion usando TDD.

## Objetivo de Aprendisaje
- Desarrollar un sistema simple de gestión de cuentas bancarias que permita a los usuarios 
realizar operaciones básicas como depositar dinero, retirar dinero y consultar el saldo.
Este ejercicio te ayudará a practicar la programación orientada a objetos (OOP), el manejo
de estados, y el diseño de una API sencilla.
- Practicar la implementación de una lógica de negocio simple.
- Practicar el diseño y uso de métodos en una clase para gestionar una serie de 
 operaciones de manera coherente.
## Tecnologias

- Intellij IDEA
- JavaScript
- Git
- Git Hub
- TDD.
- Descargar dependencias.
## Uso

Seras responsable de implementar la lógica para un sistema de gestión de cuentas bancarias. 
Los usuarios de este sistema deben poder crear cuentas, depositar dinero, retirar dinero y 
consultar el saldo actual de sus cuentas.

## Características
- **Crear una Cuenta:**
    - El saldo inicial puede ser cero o una cantidad especificada durante la creación de la cuenta.
- **Depositar Dinero:**
    - Los usuarios deben poder depositar una cantidad positiva de dinero en su cuenta.
    - Después de un depósito, el saldo de la cuenta debe incrementarse en la cantidad depositada.
- **Retirar Dinero:**
    - Los usuarios deben poder retirar dinero de su cuenta.
    - El sistema debe verificar que la cuenta tenga suficientes fondos antes de permitir una retirada. Si no hay suficientes fondos, la transacción debe ser rechazada y el saldo no debe cambiar.
    - Después de una retirada exitosa, el saldo de la cuenta debe disminuir en la cantidad retirada.
- **Consultar el Saldo:**
    - Los usuarios deben poder consultar el saldo actual de su cuenta en cualquier momento.
    - El saldo debe reflejar todas las operaciones anteriores (depósitos y retiradas).
                          
                           
                           DATE           | AMOUNT  | BALANCE
                           Primer Retiro  | 200.00  | 1300.00
                           Primer Deposito| 500.00  | 1500.00
                           Crea cuenta    | 1000.00 | 1000.00
                           
## Reglas
- No se permite retirar más dinero del que hay disponible en la cuenta.
- El número de cuenta debe ser único para cada cuenta.
- Los depósitos y retiradas deben ser cantidades positivas.

## Autor y Agradecimiento

|                                                                                  **Miguel Reyes**                                                                                    |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <a href="https://github.com/MIANREVA2024"> <img src="https://img.shields.io/badge/github-%23121011.svg?&style=for-the-badge&logo=github&logoColor=white"/></a>             |
| <a href="https://www.linkedin.com/in/miguelreyesvasquez/"> <img src="https://img.shields.io/badge/linkedin%20-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white"/></a> |