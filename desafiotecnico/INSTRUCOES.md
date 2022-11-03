
## Instruções de Uso
Olá, queremos convidá-lo a participar de nosso desafio de seleção.  Pronto para participar? Seu trabalho será visto por nosso time e você receberá ao final um feedback sobre o que achamos do seu trabalho. Não é legal?

### Repositório
Baixe o repositório no seu ambiente local e importe na sua IDE, para este projeto estou utilizando o Intellij
```
*  git clone https://github.com/fernandoericofilho/desafio2
```

### Subindo base postgres
Dentro da pasta *docker* executar o comando:
```
*  docker-compose up -d
```
Certifique-se que o postgres está rodando (IMAGE postgres) via docker desktop ou comando:
```
*  docker ps
```

### Executando o projeto
Para baixar as bibliotecas utilizada e dar um build no projeto execute na raiz do projeto o comando:
 ```
*  mvn clean install
```  

### Rodando o Projeto
Na pasta src/main/java selecione o arquivo MainApplication, clique com o botão direito do mouse e clique em *RUN*

### Testando com swagger
Acesse a URL abaixo:
 ```
*  http://localhost:8080/swagger-ui/index.html
```  

