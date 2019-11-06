# Criando pacote de distribuição java

Para distribuir pacotes java, as classes são empacotadas em um arquivo jar que posteriormente pode ser distribuido de uma só vez para os clientes do sistema.

Teste 1 - main.jar

Executando:

```bash
java -classpath main.jar Main
```

'java' é o JVM. -classpath é o caminho para o pacote de classes. main.jar é o próprio pacote e Main é a classe principal a ser chamada dentro do aplicativo. É ela que contém o método estático main. 

Só lembrando que nesse caso eu chamei a classe principal de Main, porém, ela poderia ter qualquer nome. Nâo necessariamente precisa ser este.
 
# Teste de dependência entre arquivos jar

Na apostila que tenho seguido, um exemplo de execução de um jar é o seguinte: 

```bash
java -classpath main.jar:outro.jar ClassPrincipal
```

Logo, para testar essa funcionalidade de dependência, criei uma nova classe chamada Saudação, contendo um método estático, digaHello, que deve ser chamada passando um parâmetro
string correspondente ao nome da pessoa a quem se deseja cumprimentar.
Compilei as duas classes para arquivos .class. Tanto a classe windows, quanto a classe Saudacao.java. Adicionei as duas classes para pacotes jar separadamente. A classe 
windows foi para o pacote win.jar e a classe saudacao para o pacote saudacoes.jar.

Agora, ao executar: 
```bash
java -classpath main.jar ClassPrincipal
```
Obtenho o seguinte erro:
```bash
Exception in thread "main" java.lang.NoClassDefFoundError: Saudacao
	at Window.main(Window.java:13)
Caused by: java.lang.ClassNotFoundException: Saudacao
	at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 1 more
```
Já, adicionando os dois arquivos jar, temos o script rodando corretamente e apresentando a janela esperada.
```bash
java -classpath main.jar:saudacoes.jar Window
```

