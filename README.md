# Treinamento de Junit Básico

<p>Junit é um framework open-source simples para escrever testes automatizados com suporte na linguagem de programação Java. Com o Junit podemos criar testes para verificar funcionalidades de classes e seus métodos, recomendado para testes unitários. Podemos automatizar também a execução de todos os testes de forma que quando for criada uma nova versão estável do sistema o framework execute todos os testes para garantir a integridade e estabilidade do sistema desenvolvido.</p>

<p>O Junit tem uma extrema importância no desenvolvimento de métodos ágeis de programação como o TDD (Test Driven Development) que consiste em escrever o teste antes e depois desenvolver a funcionalidade. Para ler mais sobre TDD acesse: http://tdd.caelum.com.br/</p>

<p>Para utilizar o Junit em seu projeto basta realizar a configuração no maven. Como configurar: https://github.com/junit-team/junit/wiki/Use-with-Maven</p>

<p>O Junit trabalha basicamente com anotações (Annotations). Essas anotações indicam se um método é de teste ou não, se um método deve ser executado antes da classe e/ou depois da classe, as anotações indicam também se o teste deve ou não ser ignorado e se a classe em questão é uma suite de teste, ou seja, se a partir desta classe é disparada a execução das demais classes de teste, entre outras anotações menos utilizadas.</p>

## Anotações

### @Test
Para determinar se um método é de teste utilizamos logo acima da método de teste a anotação: <b>@Test</b>

<pre><code>@Test
public void calcular() {
  operacoes.somar(a, b);
}</pre></code>

### @Ignore
Para ignorar um método de teste utilizamos a anotação: <b>@Ignore</b>

```java
@Ignore
@Test
public void calcular() {
  operacoes.somar(a, b);
}
```

### @BeforeClass
Para determinar que um método vai ser executado antes dos demais métodos da classe de teste utilizamos a anotação: <b>@BeforeClass</b>

Essa funcionalidade serve para que possamos antes de uma classe de teste por exemplo iniciar a conexão com o banco de dados, inicializar variaveis entre outras possibilidades.
```java
@BeforeClass
public static void header() {
  System.out.println("Calculadora Inmetrics");
}
```

### @AfterClass
Para determinar que um método vai ser executado depois dos demais métodos da classe de teste utilizamos a anotação: <b>@AfterClass</b>
  
 Essa funcionalidade serve para que possamos depois de uma classe de teste por exemplo fechar a conexão com o banco de dados, ajudar o garbage collection a limpar os dados ociosos entre outras possibilidades.
```java
@AfterClass
public static void rodape() {
  System.out.println("\nEssa calculadora foi desenvolvida por especialistas.");
}
```

### @Before
Para determinar que um método vai ser executado antes de cada caso de teste utilizamos a anotação: <b>@Before</b>
  
Essa funcionalidade serve por exemplo para que antes de um método possamos inicializar variaveis.
```java
@Before
public static void header() {
  System.out.println("Calculadora Inmetrics");
}
```

### @After
Para determinar que um método vai ser executado depois de cada caso de teste utilizamos a anotação: <b>@After</b>

Essa funcionalidade serve por exemplo para que antes de um método possamos finalizar variaveis.

```java
@After
public static void rodape() {
  System.out.println("\nEssa calculadora foi desenvolvida por especialistas.");
}
```

### @Test(timeout = 0)
Para determinar que um teste tem um tempo máximo para ser executado. Por exemplo caso desejamos que nosso teste não demore mais que 300 milisegundos podemos realizar a seguinte anotação: <b>@Test(timeout = 300)</b>

Essa funcionalidade serve por exemplos para que possamos temporizar o retorno de um consulta no banco de dados.

```java
@Test(timeout = 300)
public void calcular() {
  operacoes.somar(a, b);
}
```

### @Test(expected=NullPointerException.class)
Para verificar se o método está retornando uma exception, muito importante para testes unitários. Podemos verificar se está tratando exceções a anotação: <b>@Test(expected=NullPointerException.class)</b>

Essa funcionalidade é muito importante por exemplo para sabermos se o sistema está realmente tratando exceções e/ou validando erros internos.

```java
@Test(expected=NullPointerException.class)
public void calcular() {
  operacoes.somar(a, b);
}
```
 
 ## Assertions
Os asserts determinam se uma condição de teste foi atendida ou não. Para ver os tipos de asserts bem como suas utilizações acesse:  https://github.com/junit-team/junit/wiki/Assertions

### AssertEquals

```java
@Test(expected=NullPointerException.class)
public void calcular() {
 double a = 4.0, b = 3.0;
 final double resultado = operacoes.somar(a, b);
 Assert.assertEquals(7.0, resultado, 0);
}
```
  
Site JUnit:  http://junit.org/<br>
Git:  https://github.com/junit-team/junit 

### Bora fazer na prática?
<img src="https://touts-images-2.s3.amazonaws.com/art/12330/xlarge_bora-hora-do-show.jpg" height="400" width="250" alt="Bora! Hora do SHOW." />
