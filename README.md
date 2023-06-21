
# Previsão do Tempo - JAVA

Este é um programa simples que lê uma cidade informada pelo usuário e retorna a previsão do tempo atual, utilizando a API da [WeatherAPI](https://www.weatherapi.com/).




## Como Executar
Para executar o programa, basta clonar este repositório e rodar o arquivo `Main.java`.

Você precisa ter instalado em sua máquina:

* Java 8 ou superior
* Gson: biblioteca utilizada para converter strings JSON em objetos Java.
* Uma chave para a API. É necessário se [inscrever](https://www.weatherapi.com/signup.aspx) para conseguir a sua chave de API gratuita.

Após executar o arquivo `Main.java`, você será solicitado a inserir uma cidade. A partir dessa entrada do usuário, será chamada a API externa da WeatherAPI com base na cidade informada e recebido os resultados de previsão do tempo em formato JSON.

Em seguida, esses resultados são convertidos em um objeto Java da classe `WeatherTradutor`, também usando a biblioteca Gson. Por fim, as informações relevantes são impressas na tela para o usuário final.


## Exemplo de Uso

Ao executar o programa pela primeira vez e inserir "São Paulo" como cidade desejada, por exemplo:

## Uso/Exemplos
```
Informe a cidade:
sao paulo
Cidade: São Paulo
Temperatura: 25°C
Condição: Partly cloudy
```



## Classes

Classe `Main`

A classe `Main` é responsável por executar o programa principal. Ela utiliza as classes `WeatherAPI`, para obter informações de previsão do tempo através de uma API externa, e `WeatherTradutor`, que é responsável por traduzir os dados recebidos em formato JSON para um objeto Java.

O método principal (`main`) inicia pedindo que o usuário informe a cidade desejada como parâmetro. Em seguida, ele faz chamadas à API externa utilizando o nome da cidade informado pelo usuário, obtendo assim as informações de previsão do tempo em formato JSON.
Depois disso, ele utiliza a biblioteca Gson para converter essa string JSON em um objeto Java do tipo `WeatherTradutor`. Esse objeto contém algumas das principais informações sobre a previsão do tempo naquela cidade (nome da cidade, temperatura atual e descrição da condição climática).

Classe `WeatherTradutor`

A classe `WeatherTradutor` é responsável por armazenar as informações de previsão do tempo obtidas através da API externa. Ela contém os seguintes atributos:

`name`: nome da cidade.

`temp_c`: temperatura atual em graus Celsius

`conditionText`: descrição textual das condições climáticas atuais.

Além disso, a classe possui métodos getters e setters para cada um desses atributos, permitindo que essas informações possam ser acessadas e modificadas facilmente pelo programa principal.

Classe `WeatherAPI`

A classe `WeatherAPI` é responsável por realizar chamadas à API externa da WeatherAPI, passando como parâmetro a cidade desejada e recebendo uma string JSON em resposta.
Ela contém um único método público, chamado `getWeatherForecast`, que recebe o nome da cidade como parâmetro e retorna uma string JSON com as informações de previsão do tempo. Essas informações são obtidas através de uma conexão HTTP com a URL da API externa, utilizando-se a biblioteca padrão Java para essa finalidade.


## Autores

- [@rabisquim](https://www.github.com/rabisquim)

