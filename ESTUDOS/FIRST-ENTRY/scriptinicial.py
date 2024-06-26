#anotações iniciais para entender a linguagem
#para entender a linguagem utilizarei a documentação e o w3Schools
#WELCOME TO MY STUDYS  LET'S COOK!!!

#forma de printar info nos terminais
print("hello world!")

#executar tarefas com python utilizando a versão 3("aque estpa nesse pc") tem de ser executado com python3

#VARIAVEL em python
#são nãotipada? 
testeVar = True
print(testeVar)
testeVar = "essa é iuma string"
print(testeVar)
#sim! a variavel guarda qualquer info, tomar CUIDADO para nao fazer a troca do tipo

#isso é algo que nunca testei em java porém acredito ser possivel tbm
ing = 20
pess = 10

ingEmaiorQpess = (ing > pess)
print(ingEmaiorQpess) #vai retornar o valor armazenado, no caso seria true

#input = scanner
#oque tiver em string dentro do input é a mensagem exibida ao usuario
#ele sempre converte o valor para string necessitando um cast dependendo do que voce precisa

resultado = input("informe qualquer coisa ")
print(resultado)

resultadoCast = int(input("escreva o valor em inteiro "))
print(resultadoCast)
print(type(resultadoCast))


#primeiro exercicio MEDIA

ma = int(input("informe o primeiro valor "))
mb = int(input("o segundo valor "))
mc = (ma + mb) / 2

print("media é ",mc)
print(type(mc))

#utilizando condiçao, e treinando essa identação pois é importante em python, já que não exite {} utilizasse a identação
#tomar CUIDADO COM ISSO!!

#CONDICIONAIS
# em python o && é substiuido por and
# acredito que o || é substituid por or
if mc > 10 and mc < 15:
    print("voce é um genio")
    print("voce continua na condição")
elif mc > 15 and mc < 20:
    print("testando o else if, q em python vira elif")
else:
    print("caiu no else")

#ARRAYS!
#porém como define um array sem valor apenas com tamanhos?
fstArray = [1,2,3]

print(fstArray[0])

#o array no python NÃO É ESTATICO? porque utilzia o arrayLIst e não o array convencional kkkkkkkk PYTHON KKKKKKKKKKKK
# se liga neguin
#inicializando uma lista sem valor
listavz = []

listavz.append(20)
listavz.append("meu deus uma string em uma lista")

#CUIDADO EM PYTHON VOCE PODE INSERIR QUALQUER VALOR NA LISTA
#a utilização de lista é igual a biblioteca em java por isso tem metoodos para manipular ela
#append insere
#insert e para inserir com posião, então tem que ser passado uma pos e um valor
#pop sem parametro remove o ultimo valor, com parametro numerico  retira o valor da pos desse valor numerico
#sort e reverse igual em java
#index retorna o primeiro valor da lista

#LOOPS
#For

lsN = []
for x in range(10):
    print(x)

#o x é a variavel usada para fazer o contador o range éo o que determina até aonde ele vai
#sim da para inserir um array em um array KKKKKKKKKKKKK slc

notas = []
for x in range(300):
    cdc = 4 * x
    nota = 10 * x
    resultado = [cdc,nota]
    notas.append(resultado)

for n in notas:
    cdc = n[0]
    nota = n[1]
    print("codigo do aluno é ", cdc , " a nota dele é ",nota)

#isso já é maluqice para entender, criamos um laço para adicionar uma lista em cada posição da lista notas, aonde éssa lista tem
# 2 posição 0 e 1
# no segundo for PODEMOS CRIAR UM ARRAY PARA ITERAR O NOTAS PQP Q Q É ISSO CARA

#WHILE é a mesma merda sem ()

contador = 1
while contador < 10:
    print(contador)
    contador += 1

#OBJETOS OU DICIONARIOS

pessoa = {
    "nome": "guilherme",
    "idade": 20,
    "peso": 85.5
}

# o da esquerda seria os atributos do objeto, e o da direita o valor desse atributo, esquerda nome do atributo direita valor


#FUNÇÃO


#def define a função, porém como passa função void?
#É SO NÃO COLOCAR RETURN KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK
#n é zueira
def soma (v1,v2):
    return v1 + v2