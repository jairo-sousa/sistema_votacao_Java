# SISTEMA DE VOTAÇÃO

Esta é uma atividade do curso desenvolvimento de sistemas, realizado no [SENAC](https://www.ce.senac.br/).

### A atividade

> Criar um sitema de votação em java.

#### Restrições:

-   Pode usar apenas os conceitos já abordados em aula para cumprir os requisitos
    -   `if`, `while`, `Scanner`, variáveis etc.
-   Não usar funções (exceto para funcionalidades adicionais)

#### Requisitos

-   Desenvolver uma estratégia para definir o número de rodadas de votação.
-   Receber votos para: Candidato1, Candidato2 Candidato3 e Candidato4, voto em branco e voto nulo
-   Mostrar vencedor

---

### Minha solução

-   O sistema pede para criar uma senha e após digitar, mostra o menu de votação.
-   No menu de votação:
    -   Digitar um número de [1-6] registra um voto.
        -   Reproduz um som ao registrar votos.
    -   Digitar 7 para sair, o programa pede a senha para autorizar e encerrar.
    -   Digitar "a", mostra o menu de ajuda, com as opções.
    -   Digitar outra coisa, resulta em opção inválida.
-   Ao encerrar a votação, mostra os votos.
-   Verifica casos de empate, e mostra os canddatos empatados
-   Se não acontecer empate e o "vencedor" obtiver 50% dos votos + 1 voto, mostra o vencedor, seus votos e porcentagem de votos.
    -   Com menos votos mostra o mais votado e informa que haverá segundo turno
    -   O sistema não lida com segundos turnos de votação
