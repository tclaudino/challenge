# Challenge
Repositório utilizado para o desafio do HellTriangle

# Escolha da Linguagem de Programação
Utilizei o Java pois esta é a linguagem que tenho mais experiência e a única que sei desenvolver testes automatizados

# Classes Principais
challenge/helltriangle/src/main/java/com/b2w/helltriangle/service/TriangleService.java: possui o método que recebe o array multimendicional e faz o cálculo seguindo as regras do desafio.

challenge/helltriangle/src/main/java/com/b2w/helltriangle/test/TriangleServiceTest.java: possui os testes unitários para a classe TriangleService.java

#Infraestrutura
Este projeto utiliza Maven. É importante ter esta ferramenta configurada juntamente com o Java (a partir da versão 7).
Links para download do Maven: http://maven.apache.org/download.cgi
Configuração do Maven: http://maven.apache.org/install.html

# Instruções para Execução
Dentro do diretório "helltriangle" (onde se encontra o arquivo pom.xml), execute os comandos conforme a finalidade:

  - Execução dos testes: mvn clean test
  - Criar atefato (jar): mvn clean package 
  - Executar teste e criar atefado: mvn clean install

