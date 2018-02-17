# Treinamento de Junit Básico

Site JUnit:  http://junit.org/
Git:  https://github.com/junit-team/junit 

Junit é um framework open-source simples para escrever testes automatizados com suporte na linguagem de programação Java. Com o Junit podemos criar testes para verificar funcionalidades de classes e seus métodos, recomendado para testes unitários. Podemos automatizar também a execução de todos os testes de forma que quando for criada uma nova versão estável do sistema o framework execute todos os testes para garantir a integridade e estabilidade do sistema desenvolvido.

O Junit tem uma extrema importância no desenvolvimento de métodos ágeis de programação como o TDD (Test Driven Development) que consiste em escrever o teste antes e depois desenvolver a funcionalidade. Para ler mais sobre TDD acesse: http://tdd.caelum.com.br/

Para utilizar o Junit em seu projeto basta realizar a configuração no maven. Como configurar: https://github.com/junit-team/junit/wiki/Use-with-Maven

O Junit trabalha basicamente com anotações (Annotations). Essas anotações indicam se um método é de teste ou não, se um método deve ser executado antes da classe e/ou depois da classe, as anotações indicam também se o teste deve ou não ser ignorado e se a classe em questão é uma suite de teste, ou seja, se a partir desta classe é disparada a execução das demais classes de teste, entre outras anotações menos utilizadas.

## Anotações

Para determinar se um método é de teste utilizamos logo acima da método de teste a anotação: <b>@Test</b>

<pre><code> @Test
  public void calcular() {
  operacoes.somar(a, b);
  }</pre></code>

Para ignorar um método de teste utilizamos a anotação: <b>@Ignore</b>

<pre><code> 
  @Ignore
  @Test
  public void calcular() {
  operacoes.somar(a, b);
  }</pre></code>
