$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: utf-8"
    }
  ],
  "line": 4,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 1834635800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta;consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "que acessa a Wikipedia em Portugues",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "pesquiso por \"Ovo de Páscoa\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "Exibe a expressão \"Ovo de Páscoa\" no titulo da guia",
  "keyword": "Entao "
});
formatter.match({
  "location": "Post.queAcessaAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 4147020600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 1290147800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 19
    }
  ],
  "location": "Post.exibeAExpressãoNoTituloDaGuia(String)"
});
formatter.result({
  "duration": 27395900,
  "status": "passed"
});
formatter.after({
  "duration": 629480100,
  "status": "passed"
});
});