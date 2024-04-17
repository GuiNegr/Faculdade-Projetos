function teste(){
    var capitais = {
    "Brasil": "Brasilia",
    "Japão" : "Toquio",
    "Australia" : "Canberra"
};

console.log(capitais["Japão"]);

itens_menu = ["Home", "Contato" , "Sobre"];

const populaçoes = {
    "São Paulo": 100000,
    "Santo andre": 700000,
    "Guarulhos": 130000
};

for(const cidade in populaçoes){
    console.log(`${cidade} tem ${populaçoes[cidade]} habitantes. `)
}

//a variavel cidade e criada para passar pelo array populaçoes, com isso ao chamar
// o array populações puxamos os valores aonde tem o mesmo nome, na primeira passada
//a variavel cidade vai ter o valor São Paulo, na hora que popualçoes
//utiliza  a chave valor dela vai procurar qual tem o valor São Paulo
}

var alertar = function(){
    alert("Você clicou no maldito botão")
}