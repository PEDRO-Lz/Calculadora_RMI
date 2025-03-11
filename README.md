# Calculadora_RMI
Calculadora RMI

Este projeto é uma calculadora remota implementada com Java RMI (Remote Method Invocation), permitindo que um cliente realize operações matemáticas em um servidor remoto.

Estrutura do Projeto

O projeto é composto por três arquivos principais:

Interface.java: Define os métodos remotos disponíveis para o cliente.

Server.java: Implementa a lógica da calculadora e disponibiliza os serviços via RMI.

Client.java: Conecta-se ao servidor e fornece um menu interativo para realizar operações.

Funcionalidades

A calculadora permite as seguintes operações:

Incremento: O cliente pode solicitar que o servidor incremente um contador até o valor 10.

Zerar valor: O cliente pode redefinir o contador para zero.

Soma: O cliente pode enviar dois números para serem somados pelo servidor.

Obter resultado da soma: O cliente pode recuperar o resultado da última soma realizada.

Enviar mensagem: O cliente pode enviar uma mensagem para o servidor exibi-la.

Como Executar

Servidor

Compile os arquivos Java:

javac Interface.java Server.java Client.java

Inicie o registro RMI:

rmiregistry &

Inicie o servidor:

java Server

Cliente

Execute o cliente para interagir com o servidor:

java Client

Escolha uma das operações no menu interativo.

Conclusão

Este projeto demonstra a implementação de uma calculadora remota utilizando Java RMI, permitindo a execução de operações matemáticas de forma distribuída e interativa.
