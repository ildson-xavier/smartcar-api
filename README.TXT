Elaborar os serviços necessários para o controle de uma frota de veículos autônomos.

Para entrega no Portal do Aluno, é necessário informar:
1) Código-fonte: Informe a URL do repositório. Caso o repositório seja privado, adicionar o 
usuário profeduardo.galego@fiap.com.br como colaborador;
2) Se hospedado em alguma nuvem, informar o endereço da aplicação;
3) Documentação (podendo ser o link para uma página Swagger);

SUGESTÕES: 
- Parta sempre para a abordagem mais simples e prática, tentando fazer um MVP que contemple as principais funcionalidades.
- Não há necessidade de chamadas de serviços externos, como mapas ou geolocalização. Quem o fizer, contará como uma "nota bônus".
- Mesmo caso para a persistência: Não há necessidade de persistir os dados em um banco de dados. Quem o fizer, 
  contará como uma "nota bônus".
  
CENÁRIO:
- Veiculo disponibiza informações de estado:
	+ Temperatura do motor
	+ Nivel de combustivel
	+ Localização
	+ Estado: parado; movimento
	+ Destino (Curso)
- Frota disponibiliza informaçoes:
	+ Quantidade de carro numa região
	+ Quantidade de carros parados e em movimento
- Frota faz ação:
	+ Desativar veiculo
	+ Mandar veiculo para garagem
	+ Mandar veiculo para uma região
- Usuario faz:
	+ Controle das frotas
+ 