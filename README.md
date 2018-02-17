# Treinamento de Junit Básico

Site JUnit:  http://junit.org/<br>
Git:  https://github.com/junit-team/junit 

<p>Junit é um framework open-source simples para escrever testes automatizados com suporte na linguagem de programação Java. Com o Junit podemos criar testes para verificar funcionalidades de classes e seus métodos, recomendado para testes unitários. Podemos automatizar também a execução de todos os testes de forma que quando for criada uma nova versão estável do sistema o framework execute todos os testes para garantir a integridade e estabilidade do sistema desenvolvido.</p>

<p>O Junit tem uma extrema importância no desenvolvimento de métodos ágeis de programação como o TDD (Test Driven Development) que consiste em escrever o teste antes e depois desenvolver a funcionalidade. Para ler mais sobre TDD acesse: http://tdd.caelum.com.br/</p>

<p>Para utilizar o Junit em seu projeto basta realizar a configuração no maven. Como configurar: https://github.com/junit-team/junit/wiki/Use-with-Maven</p>

<p>O Junit trabalha basicamente com anotações (Annotations). Essas anotações indicam se um método é de teste ou não, se um método deve ser executado antes da classe e/ou depois da classe, as anotações indicam também se o teste deve ou não ser ignorado e se a classe em questão é uma suite de teste, ou seja, se a partir desta classe é disparada a execução das demais classes de teste, entre outras anotações menos utilizadas.</p>

## Anotações

Para determinar se um método é de teste utilizamos logo acima da método de teste a anotação: <b>@Test</b>

<pre><code>@Test
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
  
Para determinar que um método vai ser executado antes dos demais métodos da classe de teste utilizamos a anotação: <b>@BeforeClass</b>

Essa funcionalidade serve para que possamos antes de uma classe de teste por exemplo iniciar a conexão com o banco de dados, inicializar variaveis entre outras possibilidades.

<pre><code> 
  @BeforeClass
	public static void header() {
		System.out.println("Calculadora Inmetrics");
  }</pre></code>
  
  Para determinar que um método vai ser executado depois dos demais métodos da classe de teste utilizamos a anotação: <b>@AfterClass</b>
  
  Essa funcionalidade serve para que possamos depois de uma classe de teste por exemplo fechar a conexão com o banco de dados, ajudar o garbage collection a limpar os dados ociosos entre outras possibilidades.

<pre><code> 
	@AfterClass
	public static void rodape() {
		System.out.println("\nEssa calculadora foi desenvolvida por especialistas.");
  }</pre></code>
  
  Para determinar que um método vai ser executado antes de cada caso de teste utilizamos a anotação: <b>@Before</b>
  
  Essa funcionalidade serve por exemplo para que antes de um método possamos inicializar variaveis.
  
  <pre><code> 
  @Before
	public static void header() {
		System.out.println("Calculadora Inmetrics");
  }</pre></code>
  
  Para determinar que um método vai ser executado depois de cada caso de teste utilizamos a anotação: <b>@After</b>
  
  Essa funcionalidade serve por exemplo para que antes de um método possamos finalizar variaveis.
  
  <pre><code> 
	@After
	public static void rodape() {
		System.out.println("\nEssa calculadora foi desenvolvida por especialistas.");
  }</pre></code>
  
 Para determinar que um teste tem um tempo máximo para ser executado. Por exemplo caso desejamos que nosso teste não demore mais que 300 milisegundos podemos realizar a seguinte anotação: <b>@Test(timeout = 300)</b>
 
 Essa funcionalidade serve por exemplos para que possamos temporizar o retorno de um consulta no banco de dados.
 
 
<pre><code>@Test(timeout = 300)
	public void calcular() {
  operacoes.somar(a, b);
  }</pre></code>
 
Para verificar se o método está retornando uma exception, muito importante para testes unitários. Podemos verificar se está tratando exceções a anotação: <b>@Test(expected=NullPointerException.class)</b>

Essa funcionalidade é muito importante por exemplo para sabermos se o sistema está realmente tratando exceções e/ou validando erros internos.
 
<pre><code>	@Test(expected=NullPointerException.class)
	public void calcular() {
  operacoes.somar(a, b);
  }</pre></code>
 
 ## Assertions
  Os asserts determinam se uma condição de teste foi atendida ou não. Para ver os tipos de asserts bem como suas utilizações acesse:  https://github.com/junit-team/junit/wiki/Assertions
  

### Vamos fazer na prática?
