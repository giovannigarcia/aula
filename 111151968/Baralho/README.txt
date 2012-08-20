Este trabalho trata-se de uma implementa��o de uma biblioteca que simula um baralho de 52 cartas. Apresenta ainda algumas fun��es, como cortar o baralho, comprar uma carta, descartar uma carta, etc.




Documenta��o:

Utilizando a GUI do doxygen.
Acessando pelo terminal: digitar "doxywizard"
Se preciso instalar a GUI, digitar "sudo apt-get install doxygen-gui"

Na primeira tela que aparece, em Step 1, informar o diret�rio de onde o doxygen ir� rodar. Pode ser a pasta onde ir� gerar a documenta��o, a mesma onde est�o os arquivos .c e .h.

No t�pico Project:
Preenchar "Project name", "Source code directory" e "Destination directory". Informar o diret�rio onde encontran-se os arquivos do projeto, os .c e o .h.
Clicar em "Next".

No t�pico Mode:
Marcar "Optmize for C or PHP".
Clicar em "Next".

No t�pico "Output":
Clicar em "Next".

Ap�s, clicar na aba "Expert", t�pico "Input":
No campo INPUT_ENCODING, tive que mudar para ISO-8859-1, mas UTF-* deve funcionar.

Clicar na aba "Run":
Clicar no bot�o "Run doxygen".

Pronto. A documenta��o deve estar pronta e pode ser acessada na de destino informada em "Destination directory".




Constru��o:

Utilizando o CMAKE (http://www.cmake.org/) acessar via terminal o diret�rio onde est�o salvos os arquivos do projeto e o arquivo CMakeLists.txt que acompanha.
Ent�o, digitar os seguintes comandos "cmake ." e logo ap�s "make":
cmake . -> o CMAKE gera os arquivos de constru��o
make -> executa a compila��o


