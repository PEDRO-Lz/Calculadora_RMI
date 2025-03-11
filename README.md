# Calculadora_RMI

Este projeto é uma calculadora remota implementada com Java RMI (Remote Method Invocation), permitindo que um cliente realize operações matemáticas em um servidor remoto de forma distribuída e interativa.

Estrutura do Projeto:

O projeto é composto por três arquivos principais:

Interface.java: Define os métodos remotos disponíveis para o cliente.

Server.java: Implementa a lógica da calculadora e disponibiliza os serviços via RMI.

Client.java: Conecta-se ao servidor e fornece um menu interativo para realizar operações.

Como Executar

Compile os arquivos Java:

javac Interface.java Server.java Client.java

Inicie o registro RMI:

rmiregistry &

Inicie o servidor:

java Server

Execute o cliente para interagir com o servidor:

java Client
