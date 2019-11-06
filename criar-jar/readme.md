# Criando pacote de distribuição java

Para distribuir pacotes java, as classes são empacotadas em um arquivo jar que posteriormente pode ser distribuido de uma só vez para os clientes do sistema.

Teste 1 - main.jar

Executando:

```bash
java -classpath main.jar Main
```

'java' é o JVM. -classpath é o caminho para o pacote de classes. main.jar é o próprio pacote e Main é a classe principal a ser chamada dentro do aplicativo. É ela que contém o método estático main. 

Só lembrando que nesse caso eu chamei a classe principal de Main, porém, ela poderia ter qualquer nome. Nâo necessariamente precisa ser este.
 