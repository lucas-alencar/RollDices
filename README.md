# RollDicesSequencial - a analisis
Esse projeto mede o tempo em ms entre requisições http e a salva em um relatório de saída .txt

##Pré-requisitos
Para compilar esse projeto é necessário utilizar-se de uma ide que compile Maven ou ter o maven instalado em sua máquina

## Para compilar com o maven pelo terminal

```console
mvn compile
```

## Para executar
Ao possuir o arquivo executável .jar, basta rodar o arquivo e aguardar sua conclusão
```console
./main.jar
```Para se usar esse comando, deve-se escrever no console da seguinte forma:
103
```console
104
list-participants
105
```
106
Esse comando irá listar o nome das pessoas que participam do server que você está logado no momento.
107
​
108
## Comandos - list-channels
109
Para se usar esse comando, deve-se escrever no console da seguinte forma:
110
```console
111
list-channels
112
```
113
Esse comando irá listar o nome de todos canais criados no servidor conectado no momento, separando-os por servidores de texto e de voz.
114
​
115
## Comandos - create_channel
116
Para se usar esse comando, deve-se escrever no console da seguinte forma:
117
```console
118
create_channel <nome do canal> <tipo de canal>
119
```
120
Esse comando irá criar um canal do tipo especificado. Ele não permite dois canais que possuam simultaneamente o mesmo tipo e nome em um único servidor.
121
Os tipos de canais que podem ser usados são: 'voz' e 'texto'
122
​
123
## Comandos - enter_channel
124
Para se usar esse comando, deve-se escrever no console da seguinte forma:
125
```console
126
enter_channel <nome do canal> <tipo de canal>
127
```
128
Esse comando irá te fazer logar no canal especificado dentro do servidor que você está conectado no momento.
129
Os tipos de canais que podem ser usados são: 'voz' e 'texto'
130
​
131
## Comandos - leave_channel
132
Para se usar esse comando, deve-se escrever no console da seguinte forma:
133
```console
134
leave_channel
135
```
136
Esse comando irá te fazer desconectar do canal que está conectado no momento. Também é chamado caso você tente usar o comando leave-server.
137
​
138
## Comandos - send_message
139
Para se usar esse comando, deve-se escrever no console da seguinte forma:
140
```console
141
send_message <mensagem>
142
```
143
Esse comando irá adicionar uma mensagem no canal em que você se encontra no momento. Adicionando automaticamente a data e hora
144
​
145
## Comandos - list_messages
146
Para se usar esse comando, deve-se escrever no console da seguinte forma:
147
```console
148
list_messages
149
```
150
Esse comando irá listar todas as mensagens do canal atual.
