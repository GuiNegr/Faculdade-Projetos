URI-URL-URN: [[URI-URL-URN]]
WEB SERVICE: [[WEB SERVICE]]

**REST:** é basicamente uma forma de estrutura de comunicação com servidores. utilizando o protocolo http podemos enviar(post) ou resgatar(get) informações para nosso servidor. podendo consumir e ou distribuir informações utilizando o JSON, tornando mais facil a consulta e uso na aplicação web.


**REQUEST:** Quando logamos no site, pesquisamos algo estamos fazendo uma request, o ato de pedir algo para um webService se tornar uma requisição. quando logo em um site estou fazendo uma requisição de verificação das minhas credenciais

**RESPONSE:** Apos a verificação do pedido(após fazer um request), o servidor me devolver uma response(uma resposta doque foi pedido, no caso do login acima séria a validade dele, caso esteja tudo correto me permita logar, caso não me de a resposta do porque)

**CODIGO DE STATUS/RESPOSTA HTTP:**
DO 100 AO 199 : INFORMACIONAIS
DO 200 AO 299: SUCESSO
DO 300 AO 399: REDIRECIONAMENTO
DO 400 AO 499: ERRO DE CLIENTE
DO 500 AO 599: ERRO DO SERVIDOR

PARA MAIS INFO: https://docs.oracle.com/en/cloud/iaas/messaging-cloud/csmes/rest-api-http-status-codes-and-error-messages-reference.html#GUID-AAB1EE32-BE4A-4ACC-BEAC-ABA85EB41919


https://dzone.com/refcardz/rest-foundations-restful?chapter=5


VERBOS HTTP
POST - ENVIAR INFORMAÇÕES(CREATE) SUPORTA ULR(PATH OU QUERY PARAM) E HEADER E VIA BODY
GET - RECUPERAR INFORMAÇÕES(READ) SUPORTA ULR(PATH OU QUERY PARAM) E HEADER
PUT OU PATH(MAIS UTILIZADO PUT) - ATUALIZAR INFORMAÇÕES(UPADTE)
DELETE